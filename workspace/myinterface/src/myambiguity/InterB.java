package myambiguity;

public interface InterB {
	public default void printData() { // abstract�ڸ��� default�� �־ �Ϲݸ޼ҵ�� ��� �����ϴ�.
		System.out.println("InterB");
	}
}
