package lambdaPracticeTask2;

//	덧셈과 뺄셈의 계산식
/*
 * 1-1. void타입으로 함수형 인터페이스 제작. 즉, 두 정수를 계산하기 위한 함수형 인터페이스 제작.
 * 1-2. 두 정수를 매개변수로 추상 메소드 선언.
 * 1-3. 메인 메소드가 있는 클래스에서 static으로 두 정수의 덧셈과 뺄셈의 람다식 제작.
 * 
 * 2-1. 계산식에서 부호만 문자열의 배열타입으로 리턴하기 위해서 함수형 인터페이스 제작.
 * 2-2. 문자열 매개변수를 받아서 getOper라는 추상메소드 선언.
 * 2-3. 메인 메소드에서 static으로 람다식을 사용하여 계산식에서 부호만 추출하여 getOper에 대입. 
 */


public class Application {
	
	public static Calc calc(String oper) {
		Calc calc = null;
		if(oper.equals("+")) {
			return calc = (n1, n2) -> n1 + n2;
		}else if(oper.equals("-")) {
			return calc = (n1, n2) -> n1 - n2;
		}else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("고려하지 않는 케이스입니다.");
		}
		return calc;
	};
	
	public static void oper(String expression) {
		
	}
	
	public static void main(String[] args) {
		
	}
}
