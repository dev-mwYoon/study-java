package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
//			System.out.println(10 / 3);
			System.out.println("���� ����!");
			
		} catch (ArithmeticException e) {
			e.printStackTrace();	// ���� �� �����ڵ��� Ȯ���ϴ� �ܰ�(���� �ܰ�)
			System.out.println(e.getMessage());
			System.out.println(e);
			System.out.println("0���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("���� ��");
	}
}	
