package myinterfaceTest;

public interface MyPet {
//	 int eyes = 2; // 앞에 final과 static이 생략됨. 
	 public final static int EYES = 2; // 모든 객체가 공유하기 위해 static을 붙임.
	 public int NOSE = 1;
	 
//	 public void giveYourHand(); // 접근자 뒤에 abstract 생략됨.
	 public abstract void giveYourHand();
	 public void bang();
	 public void sitDown();
	 public void waitNow();
	 public void getNose();
	
}
