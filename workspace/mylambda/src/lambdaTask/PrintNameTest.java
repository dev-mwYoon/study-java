package lambdaTask;

public class PrintNameTest {
	
	public static void printFullName(PrintName printName) {
		System.out.println(printName.getFullName("À±", "¹Î¿ì"));
	}
	
	public static void main(String[] args) {
//		PrintName printName = (lastName, firstName) -> lastName + firstName;
//		String result = printName.getFullName("À±", "¹Î¿ì");
//		System.out.println(result);
		
//		PrintName printFullName = (lastName, firstName) -> {
//			System.out.print("ÀüÃ¼ ÀÌ¸§ Ãâ·Â : ");
//			return lastName + firstName;
//		};
//		PrintNameTest printNameTest = new PrintNameTest();
//		System.out.println(printNameTest.printFullName(printName));

		
//		¸Þ¼Òµå°¡ staticÀÏ ¶§
		printFullName((l, f) -> l + f);
//		¸Þ¼Òµå°¡ staticÀÌ ¾Æ´Ò ¶§
		PrintNameTest printNameTest = new PrintNameTest();
		printNameTest.printFullName((l, f) -> l + f);
	}
}
