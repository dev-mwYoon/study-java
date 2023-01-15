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
		if (this == obj)	// �� ��ü�� �ּҰ��� ���ٸ�
			return true;
		if (obj == null)	// obj�� null�̶��,
			return false;
		if (getClass() != obj.getClass())	// �� ��ü�� Ŭ���� �� �� ���� ������
			return false;
		Student other = (Student) obj;	// �޾ƿ� ��ü�� ������� Ŭ������ �ٿ�ĳ����.
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
