
public class ObjectArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student[] students = new student[3];
		
		students[0] = new student("김철수", 85);
		students[1] = new student("이영희", 92);
		students[2] = new student("박민수", 78);
		
		for (int i = 0; i< students.length; i++)
		{
			students[i].printInfo();
		}
	}

}
