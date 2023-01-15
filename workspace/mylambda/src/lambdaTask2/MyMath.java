package lambdaTask2;

import java.util.Scanner;

public class MyMath {
	public static Calc calculator(String oper) { // Calc라는 함수형 인터페이스를 리턴하는 static메소드 선언. static 사용 이유는 편하려고.
		Calc calc = null;	// 함수형 인터페이스 Calc타입으로 calc를 선언 후 null로 초기화.
		switch(oper) { // 부호 oper를 받아서 switch문으로 case나눔.
		case "+": // 두 정수의 덧셈일 때
			calc = (n1, n2) -> n1 + n2; // n1=number1, n2=number2 즉, (n1, n2)인 매개변수로 -> n1 + n2을 calc의 대입
			break; // switch문 탈출
		case "-": // 두 정수의 뺄셈일 때
			calc = (n1, n2) -> n1 - n2; // 매개변수인 (n1,n2)를 두 정수의 뺄셈의 값을 calc에 대입.
			break; // switch문 탈출
		}
		return calc; // switch문에 따라 대입한 calc값을 return. return의 자료형은 Calc타입.
	}
	
	public static void main(String[] args) { 
		OperCheck operCheck = e -> { // 계산식을 operCheck 객체에 대입.
			String temp = ""; // 누적연산을 하기위해 문자열 타입의 temp를 공란으로 선언.
			for (int i = 0; i < e.length(); i++) { // 문자열인 계산식의 길이만큼 for문 반복
				char c = e.charAt(i); // 캐릭터 타입의 c안에 계산식의 문자하나씩 대입
				if(c == '-' || c == '+') { // c가 -또는 +라면
					temp += c; // 문자열 temp에 c를 누적연산 시켜서 -or+만 넣는다.
				}
			}
			return temp.split("");	// 람다식 자체는 무조건 리턴값을 보유.
		};
		
		String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
		String exampleMessage = "예)9+7-5";
		String expression = null;
		String[] opers = null, numbers = null;
		
		int number1 = 0, number2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		System.out.println(exampleMessage);
		expression = sc.nextLine();	// 공백도 받기위해 nextLine을 사용.
		expression = expression.trim(); // 맨 앞과 맨 뒤의 공백 제거
		expression = expression.replaceAll(" ", ""); // 사이 공백 제거로 사용. replaceAll("str1", "str2") -> str1을 str2로 변경.
		
		opers = operCheck.getOpers(expression); // 매개변수로 입력받은 계산식을 넣고 람다식을 실행 후 문자열의 배열안에 대입. 
		numbers = expression.split("\\+|\\-"); // +와 - 모두를 구분점으로 사용하여 모두 뺀 계산식은 숫자만 남으므로 문자열의 배열인 numbers에 대입.
		
//		calc람다식은 무조건 number1 = number1 +|- number2 의 계산식에 반복이므로
//		number1에 numbers[0] 값을 대입. 그러나, 계산식의 첫 정수가 음수라면, numbers[0]의 값은 공백이므로
//		삼항연산자를 이용해서 numbers[0]이 공란이라면 number1에 "-" + numbers[1] 
		number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]);
		
		for (int i = 0; i < opers.length; i++) {
			if(i == 0 && number1 < 0) {continue;}
			number2 = Integer.parseInt(numbers[i + 1]);
			number1= MyMath.calculator(opers[i]).calc(number1, number2);
		}
		
		System.out.println(number1);
	}
}


















