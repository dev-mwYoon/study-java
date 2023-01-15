package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
		
////		람다식은 원래 이렇게 사용함
//		LambdaInter lambdaInter = new LambdaInter() {
//			
//			@Override
//			public boolean checkMultipleOf10(int number) {
//				return number % 10 == 0;
//			}
//		};
		
//		원래는 example(int number) 가 있는 메소드지만
//		익명 메소드는 (int number) 로 사용하고 자료형 생략 가능. 소괄호도 생략 가능. 즉, 매개변수만 작성.
//		주소값에 해당 내용을 넣어서 객체에서 해당 주소를 불러와서 사용.
		LambdaInter lambdaInter = (number) -> number % 10 == 0; // -> 이건 애로우익스프레션
		boolean result = lambdaInter.checkMultipleOf10(10);
		System.out.println(result);
		
		
//		LambdaInter lambdaInter = (number) -> {
//			System.out.println("10의 배수 검사");
//			return number % 10 == 0;
//		};
//		boolean result = lambdaInter.checkMultipleOf10(10);
//		System.out.println(result);
	}
}
