package domain;

public class NameVO {
//	�̸�
//	��ŷ
//	�̸���
	private String name;
	private int ranking;
	private int nameNumber;
	private String gender;
	

	public NameVO(String gender, String name, int ranking, int nameNumber) {
		super();
		this.gender = gender;
		this.name = name;
		this.ranking = ranking;
		this.nameNumber = nameNumber;
	}

	public NameVO() {;}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public int getNameNumber() {
		return nameNumber;
	}
	public void setNameNumber(int nameNumber) {
		this.nameNumber = nameNumber;
	}

	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return gender + "\t" + name + "\t" + ranking + "\t" + nameNumber;  
	}
	
	
	
	
}
