import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DatabaseApp {
    // 데이터베이스 연결 정보 설정 (MySQL 9.x 버전 표준)   
    private static final String URL = "jdbc:mysql://localhost:3306/sample_db?serverTimezone=UTC&useSSL=false";
    private static final String USER = "root";       // 사용자 계정
    private static final String PASSWORD = "mysql123";     // 설치할 때 설정한 비밀번호 입력
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // 1. JDBC 드라이버 로드 (MySQL 8.x/9.x 버전은 생략 가능하나 명시적 로드 권장)
            Class.forName("com.mysql.cj.jdbc.Driver");    
            // 2. 데이터베이스 연결
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("데이터베이스 연결 성공!");
            // 3. 데이터 삽입 (INSERT) 실행
            insertStudent(conn, "홍길동", "컴퓨터공학과", "010-1234-5678");
            insertStudent(conn, "이순신", "정보통신과", "010-9876-5432");
            // 4. 데이터 조회 (SELECT) 실행
            selectStudents(conn);
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 드라이버를 찾을 수 없습니다: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("데이터베이스 오류: " + e.getMessage());
        } finally {
            // 5. 자원 반납 (Connection 종료)
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("데이터베이스 연결 종료.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // PreparedStatement는 JDBC에서 SQL 문을 미리 컴파일한 후 실행하는 객체
    // 데이터를 삽입하는 메소드 (PreparedStatement 활용)
    private static void insertStudent(Connection conn, String name, String major, String phone) throws SQLException {
        String sql = "INSERT INTO student (name, major, phone) VALUES (?, ?, ?)";  // ?:외부에서 제공되는 값
        
            // try-with-resources 구문을 사용하여 PreparedStatement 자동 close
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);   // 첫번째인수는 ?변수의 번호, 두 번째인수는 ?변수의 값, setString()은 문자열 저장
            pstmt.setString(2, major);
            pstmt.setString(3, phone);
            
            int rows = pstmt.executeUpdate();  // 영향받은 행의 수 반환, insert/update/delete 사용경우
            System.out.println(rows + "개의 학생 데이터가 추가되었습니다.");
        }
    }

    // 데이터를 조회하는 메소드 (Statement 및 ResultSet 활용)
    private static void selectStudents(Connection conn) throws SQLException {
        String sql = "SELECT * FROM student";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            System.out.println("\n--- 학생 명단 목록 ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String major = rs.getString("major");
                String phone = rs.getString("phone");
                
                System.out.printf("ID: %d | 이름: %s | 전공: %s | 전화번호: %s\n", id, name, major, phone);
            }
            System.out.println("-----------------------\n");
        }
    }
}