class MyInt{
	int a;
}

public class PRPA_Test02 {

	static void func1(MyInt m) {
		m.a = m.a + 1;
		System.out.printf("전달받은 a ==> %d%n", m.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInt m = new MyInt();
		m.a = 10;
		
		func1(m);
		System.out.printf("func1()실행 후의 a ==> %d%n", m.a);
	}

}
