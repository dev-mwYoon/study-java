package domain;

//	�ڽ�Ŭ�������� gender�� �������� �ֱ�����
//	instanceof �޼ҵ带 ����ؾ���.
//	������ ��Ŀ �������̽��� ���� ��� ��ĳ������ ������ �޼ҵ带 ����� �� �����Ƿ�?
//	
public class Name {
	
//	�̸�
	private String name;
//	��ŷ
	private int ranking;
//	�ش� �̸� �α� ��
	private int population;

	
	public Name() {;}

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

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		return name + "\t" + ranking + "\t" + population;
	}
}
