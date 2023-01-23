package domain;

//	자식클래스에서 gender를 구분지어 넣기위해
//	instanceof 메소드를 사용해야함.
//	하지만 마커 인터페이스로 묶을 경우 업캐스팅한 곳에서 메소드를 사용할 수 없으므로?
//	
public class Name {
	
//	이름
	private String name;
//	랭킹
	private int ranking;
//	해당 이름 인구 수
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
