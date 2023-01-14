package mymarkerInterfaceTest;

public class MyLab {
	
	public void checkKinds(MyAnimal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof MyCarnivorMarker) {
				System.out.println("육식동물");
			} else if(animals[i] instanceof MyHerbivoreMarker) {
				System.out.println("초식동물");
			} else {
				System.out.println("잡식동물");
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
