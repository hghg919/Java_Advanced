interface MyFunction4 {
	void printTest();
}

public class LamdaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction4 p = () -> {
			System.out.println("Hello");
		};
		p.printTest();
		
		p = () -> System.out.println("안녕!!!");
		p.printTest();
	}

}
