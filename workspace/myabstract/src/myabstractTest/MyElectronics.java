package myabstractTest;

//		추상 클래스는 클래스 내에 추상 메소드를 선언하기 위해 만든 것이다.
public  abstract  class MyElectronics {
//	public void on() { // 추상 클래스여도 일반 메소드 생성 가능. 즉, 중괄호(바디)를 열 수 있음.
//		
//	}
//	추상 메소드.
	public abstract void on(); // 일반 메소드랑 혼용이 가능하므로 abstract를 반드시 붙여야 한다.
	public abstract void off(); 
	
	
}
