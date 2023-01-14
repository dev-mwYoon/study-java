package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
//			System.out.println(10 / 3);
			System.out.println("연산 성공!");
			
		} catch (ArithmeticException e) {
			e.printStackTrace();	// 배포 전 개발자들이 확인하는 단계(검증 단계)
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("오류 뜸");
	}
}	
