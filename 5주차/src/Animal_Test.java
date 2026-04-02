class Animal {
	void speak() {
		System.out.println("동물은 소리를 냅니다.");
	}
}

class Dog extends Animal {
	void speak() {
		System.out.println("강아지 : 멍멍!");
	}
}

class Cat extends Animal {
	void speak() {
		System.out.println("고양이 : 야옹!");
	}
}

public class Animal_Test {

	public static void main(String[] args) {
		Animal b = new Dog();
		b.speak();
		Animal c = new Cat();
		c.speak();
	}

}
