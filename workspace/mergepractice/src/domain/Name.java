package domain;

//	자식클래스에서 gender를 구분지어 넣기위해
//	instanceof 메소드를 사용해야함.
//	하지만 마커 인터페이스로 묶을 경우 
//	마커인터페이스 타입의 어레이리스트를 map으로 재정의할 때,
//	VO가 업캐스팅되었으므로 Name안에 있는 메소드만 사용 가능.
//	하지만 아무것도 없으므로 모두 다 재정의해야하는 사태가 발생.
//	그럴거면 그냥 Name을 class타입으로 바꾸고 모든 필드와 getter setter를 여기서 정의하고,
//	BoyVO와 GirlVo에 상속시켜주는 것이 훨~씬! 나음.
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
