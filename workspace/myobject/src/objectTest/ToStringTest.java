package objectTest;

class Student {
	private int number;
	private String name;

	public Student() {
		;
	}

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj instanceof Student) {
//			Student another = (Student) obj;
//			if (another.number == number) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Student) {
			Student another = (Student) obj;
			if (another.number == number) {
				return true;
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
