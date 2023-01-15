package lambdaTest;

@FunctionalInterface
public interface LambdaInter {
//	10의 배수인지 아닌지 검사하는 메소드
	public boolean checkMultipleOf10(int number);	// abstract 생략한 이유 : interface는 추상메소드만 가능
//	public boolean checkMultipleOf20(int number);	// 하나 더 만들면 오류 이유 : FunctionalInterface는 추상메소드가 하나만 존재하기 때문
}
