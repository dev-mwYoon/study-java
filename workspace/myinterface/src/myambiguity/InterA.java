package myambiguity;

public interface InterA {
	public default void printData() { // abstract�ڸ��� default�� �־ �Ϲݸ޼ҵ�� ��� �����ϴ�.
		System.out.println("InterA");
	}
}
