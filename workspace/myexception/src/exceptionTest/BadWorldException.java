package exceptionTest;

//	Exception 상속 : 컴파일러가 체크
//	RuntimeException 상속 : 컴파일러가 체크하지 않음
public class BadWorldException extends /*RuntimeException*/  Exception  {
	
	public BadWorldException(String message) {
		super(message);
	}
}
