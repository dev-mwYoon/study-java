package myambiguity;

public interface InterA {
	public default void printData() { // abstract자리에 default를 넣어서 일반메소드로 사용 가능하다.
		System.out.println("InterA");
	}
}
