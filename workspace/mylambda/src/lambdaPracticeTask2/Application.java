package lambdaPracticeTask2;

//	������ ������ ����
/*
 * 1-1. voidŸ������ �Լ��� �������̽� ����. ��, �� ������ ����ϱ� ���� �Լ��� �������̽� ����.
 * 1-2. �� ������ �Ű������� �߻� �޼ҵ� ����.
 * 1-3. ���� �޼ҵ尡 �ִ� Ŭ�������� static���� �� ������ ������ ������ ���ٽ� ����.
 * 
 * 2-1. ���Ŀ��� ��ȣ�� ���ڿ��� �迭Ÿ������ �����ϱ� ���ؼ� �Լ��� �������̽� ����.
 * 2-2. ���ڿ� �Ű������� �޾Ƽ� getOper��� �߻�޼ҵ� ����.
 * 2-3. ���� �޼ҵ忡�� static���� ���ٽ��� ����Ͽ� ���Ŀ��� ��ȣ�� �����Ͽ� getOper�� ����. 
 */


public class Application {
	
	public static Calc calc(String oper) {
		Calc calc = null;
		if(oper.equals("+")) {
			return calc = (n1, n2) -> n1 + n2;
		}else if(oper.equals("-")) {
			return calc = (n1, n2) -> n1 - n2;
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println("������� �ʴ� ���̽��Դϴ�.");
		}
		return calc;
	};
	
	public static void oper(String expression) {
		
	}
	
	public static void main(String[] args) {
		
	}
}
