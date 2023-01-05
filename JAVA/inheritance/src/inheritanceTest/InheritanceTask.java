package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void enginStart() {
		System.out.println("엻쇠로 시동 킴");
	}
	
	void enginStop() {
		System.out.println("열쇠로 시동 끔");
	}
}

class SuperCar extends Car {

	String mode;
	
	public SuperCar() {;}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}

//	슈퍼카는 음성으로 시동을 켜고 끌 수 있다.
	@Override
	void enginStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	void enginStop() {
		System.out.println("음성으로 시동 끔");
	}
	
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 55000, "Sport");
	
		ferrari.enginStart();
		ferrari.enginStop();
	}
}
