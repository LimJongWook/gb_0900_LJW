package classTest;

class Car{
//	브랜드
//	색상
//	가격
	/*전역변수*/
	String brand;
	String color;
	int price;
	
	public Car() {; }
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	//	시동켜기
	void enginOn() {
		System.out.println(this.brand + " 시동 켜기");
	}
//	시동끄기
	void enginOff() {
		System.out.println(this.brand + " 시동 끄기");
	}
}

public class Road {
	public static void main(String[] args) {
		Car myCar = new Car("KIA","Black",3000);
		myCar.enginOn();
		myCar.enginOff();
	}
}
