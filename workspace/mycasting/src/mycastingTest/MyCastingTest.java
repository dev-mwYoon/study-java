package mycastingTest;

//	부모
class Car {
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
}

//	자식
class SuperCar extends Car {
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}

	void openRoof() {
		System.out.println("지붕 열기");
	}
}

public class MyCastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();

//		up casting
		Car noOptionFerrari = new SuperCar();
		noOptionFerrari.engineStart();

//		SuperCar brokenFerrari = new Car(); // 서로 타입이 다르기 때문에 오류남. 즉, 컴파일 오류. 제일 좋은 오류
//		SuperCar brokenFerrari = (SuperCar)new Car(); // 메모리에 다 못채워서 오류남. 즉, 빌드 오류. 그나마 나은 오류
//		런타임 오류 => Qa test

//		down casting
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;
		fullOptionFerrari.openRoof();

//      matiz instanceof Car : true
		System.out.println(matiz instanceof Car);

//      matiz instanceof SuperCar : false
		System.out.println(matiz instanceof SuperCar);

//      ferrari instanceof Car : true
		System.out.println(ferrari instanceof Car);

//      ferrari instanceof SuperCar : true
		System.out.println(ferrari instanceof SuperCar);

//      noOptionFerrari instanceof Car : true
		System.out.println(noOptionFerrari instanceof Car);

//      noOptionFerrari instanceof SuperCar : true
		System.out.println(noOptionFerrari instanceof SuperCar);

//      fullOptionFerrari instanceof Car : true
		System.out.println(fullOptionFerrari instanceof Car);

//      fullOptionFerrari instanceof SuperCar : true
		System.out.println(fullOptionFerrari instanceof SuperCar);

	}
}
