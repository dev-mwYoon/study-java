package mycastingTest;

//	�θ�
class Car {
	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
}

//	�ڽ�
class SuperCar extends Car {
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}

	void openRoof() {
		System.out.println("���� ����");
	}
}

public class MyCastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();

//		up casting
		Car noOptionFerrari = new SuperCar();
		noOptionFerrari.engineStart();

//		SuperCar brokenFerrari = new Car(); // ���� Ÿ���� �ٸ��� ������ ������. ��, ������ ����. ���� ���� ����
//		SuperCar brokenFerrari = (SuperCar)new Car(); // �޸𸮿� �� ��ä���� ������. ��, ���� ����. �׳��� ���� ����
//		��Ÿ�� ���� => Qa test

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
