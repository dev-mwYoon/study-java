package exceptionTest;

//	Exception ��� : �����Ϸ��� üũ
//	RuntimeException ��� : �����Ϸ��� üũ���� ����
public class BadWorldException extends /*RuntimeException*/  Exception  {
	
	public BadWorldException(String message) {
		super(message);
	}
}
