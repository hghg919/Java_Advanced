
public class student {
	String name;
	int score;
	
	student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	void printInfo() {
		System.out.println("이름: " + name + ", 점수: " + score);
	}
}
