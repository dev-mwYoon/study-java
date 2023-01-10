package objectTest;

class Student {
	private int number;
	private String name;
	
	public Student() {;}
	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {	// equlas 재정의
		if(this == obj) {	// 이것의 주소값과 obj의 주소값이 같다면
			return true;	// 트루
		}
		
		if(obj instanceof Student) {	// obj의 다운캐스팅한게 Student클래스 타입과 같다면
			Student another = (Student) obj;	// Student클래스 타입의 another객체가 Student타입의 클래스로 obj를 다운캐스팅. 
			if(this.number == another.number) {	// number 2개가 같다면
				return true;	// 트루
			}
		}
		return false;
	}
	
	
	
	
}

public class ToStringTest {
	public static void main(String[] args) {
		Student 한동석 = new Student();
		
		한동석.setNumber(1);
		한동석.setName("한동석");
		
		System.out.println(한동석);
	}
}



















