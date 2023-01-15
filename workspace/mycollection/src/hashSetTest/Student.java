package hashSetTest;

public class Student {
	private int number;
	private String name;
	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}


	public Student() {;}
	
	
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


	@Override
	public boolean equals(Object obj) {
		if (this == obj)	// 두 객체의 주소값이 같다면
			return true;
		if (obj == null)	// obj가 null이라면,
			return false;
		if (getClass() != obj.getClass())	// 두 객체의 클래스 비교 후 같지 않으면
			return false;
		Student other = (Student) obj;	// 받아온 객체를 사용중인 클래스로 다운캐스팅.
		if (name == null) {		// 
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	
	

}
