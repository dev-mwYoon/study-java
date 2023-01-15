package lambdaTask2;

@FunctionalInterface	//함수형 인터페이스로 선언
public interface Calc {	
	public int calc(int number1, int number2);	// 함수형 인터페이스는 하나의 추상메소드만 존재.
}
