package lambdaTask;

public class PrintNameTest {
	
	public static void printFullName(PrintName printName) {
		System.out.println(printName.getFullName("��", "�ο�"));
	}
	
	public static void main(String[] args) {
//		PrintName printName = (lastName, firstName) -> lastName + firstName;
//		String result = printName.getFullName("��", "�ο�");
//		System.out.println(result);
		
//		PrintName printFullName = (lastName, firstName) -> {
//			System.out.print("��ü �̸� ��� : ");
//			return lastName + firstName;
//		};
//		PrintNameTest printNameTest = new PrintNameTest();
//		System.out.println(printNameTest.printFullName(printName));

		
//		�޼ҵ尡 static�� ��
		printFullName((l, f) -> l + f);
//		�޼ҵ尡 static�� �ƴ� ��
		PrintNameTest printNameTest = new PrintNameTest();
		printNameTest.printFullName((l, f) -> l + f);
	}
}
