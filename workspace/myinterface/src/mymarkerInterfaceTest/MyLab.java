package mymarkerInterfaceTest;

public class MyLab {
	
	public void checkKinds(MyAnimal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof MyCarnivorMarker) {
				System.out.println("���ĵ���");
			} else if(animals[i] instanceof MyHerbivoreMarker) {
				System.out.println("�ʽĵ���");
			} else {
				System.out.println("��ĵ���");
			}
		}
	}
	
	public static void main(String[] args) {
		MyAnimal[] animals = {
				new MyBear(),
				new MyTiger(),
				new MyDog(),
				new MyCow()
		};
		new MyLab().checkKinds(animals);
	}
}
