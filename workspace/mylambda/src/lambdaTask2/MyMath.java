package lambdaTask2;

import java.util.Scanner;

public class MyMath {
	public static Calc calculator(String oper) { // Calc��� �Լ��� �������̽��� �����ϴ� static�޼ҵ� ����. static ��� ������ ���Ϸ���.
		Calc calc = null;	// �Լ��� �������̽� CalcŸ������ calc�� ���� �� null�� �ʱ�ȭ.
		switch(oper) { // ��ȣ oper�� �޾Ƽ� switch������ case����.
		case "+": // �� ������ ������ ��
			calc = (n1, n2) -> n1 + n2; // n1=number1, n2=number2 ��, (n1, n2)�� �Ű������� -> n1 + n2�� calc�� ����
			break; // switch�� Ż��
		case "-": // �� ������ ������ ��
			calc = (n1, n2) -> n1 - n2; // �Ű������� (n1,n2)�� �� ������ ������ ���� calc�� ����.
			break; // switch�� Ż��
		}
		return calc; // switch���� ���� ������ calc���� return. return�� �ڷ����� CalcŸ��.
	}
	
	public static void main(String[] args) { 
		OperCheck operCheck = e -> { // ������ operCheck ��ü�� ����.
			String temp = ""; // ���������� �ϱ����� ���ڿ� Ÿ���� temp�� �������� ����.
			for (int i = 0; i < e.length(); i++) { // ���ڿ��� ������ ���̸�ŭ for�� �ݺ�
				char c = e.charAt(i); // ĳ���� Ÿ���� c�ȿ� ������ �����ϳ��� ����
				if(c == '-' || c == '+') { // c�� -�Ǵ� +���
					temp += c; // ���ڿ� temp�� c�� �������� ���Ѽ� -or+�� �ִ´�.
				}
			}
			return temp.split("");	// ���ٽ� ��ü�� ������ ���ϰ��� ����.
		};
		
		String message = "������ ����, ������ ���� ���� �Է��ϼ���.";
		String exampleMessage = "��)9+7-5";
		String expression = null;
		String[] opers = null, numbers = null;
		
		int number1 = 0, number2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		System.out.println(exampleMessage);
		expression = sc.nextLine();	// ���鵵 �ޱ����� nextLine�� ���.
		expression = expression.trim(); // �� �հ� �� ���� ���� ����
		expression = expression.replaceAll(" ", ""); // ���� ���� ���ŷ� ���. replaceAll("str1", "str2") -> str1�� str2�� ����.
		
		opers = operCheck.getOpers(expression); // �Ű������� �Է¹��� ������ �ְ� ���ٽ��� ���� �� ���ڿ��� �迭�ȿ� ����. 
		numbers = expression.split("\\+|\\-"); // +�� - ��θ� ���������� ����Ͽ� ��� �� ������ ���ڸ� �����Ƿ� ���ڿ��� �迭�� numbers�� ����.
		
//		calc���ٽ��� ������ number1 = number1 +|- number2 �� ���Ŀ� �ݺ��̹Ƿ�
//		number1�� numbers[0] ���� ����. �׷���, ������ ù ������ �������, numbers[0]�� ���� �����̹Ƿ�
//		���׿����ڸ� �̿��ؼ� numbers[0]�� �����̶�� number1�� "-" + numbers[1] 
		number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]);
		
		for (int i = 0; i < opers.length; i++) {
			if(i == 0 && number1 < 0) {continue;}
			number2 = Integer.parseInt(numbers[i + 1]);
			number1= MyMath.calculator(opers[i]).calc(number1, number2);
		}
		
		System.out.println(number1);
	}
}


















