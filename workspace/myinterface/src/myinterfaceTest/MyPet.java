package myinterfaceTest;

public interface MyPet {
//	 int eyes = 2; // �տ� final�� static�� ������. 
	 public final static int EYES = 2; // ��� ��ü�� �����ϱ� ���� static�� ����.
	 public int NOSE = 1;
	 
//	 public void giveYourHand(); // ������ �ڿ� abstract ������.
	 public abstract void giveYourHand();
	 public void bang();
	 public void sitDown();
	 public void waitNow();
	 public void getNose();
	
}
