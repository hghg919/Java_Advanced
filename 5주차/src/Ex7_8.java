class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product {
	Tv1() {
		super(100);
	}
	public String toString() {return "Tv";}
}

class Computer extends Product {
	Computer() {super(200);}
	public String toString() {return "Computer";}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void 
}
public class Ex7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
