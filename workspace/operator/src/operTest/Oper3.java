package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
		//		����ڿ��� Ű�� �Է¹ް�
		//		������� ������ ���
		//		�Ǽ���� �Ǽ��� ���
		//		�� ) 183 -> 183���
		//			183.5 -> 183.5 ���
		//		���� �����ڸ� ���!
		//		��Ʈ! �E������ Ǯ�� ����. ���Ĺ��ڷ� Ǯ�� �� ����.
//		����ڿ��� Ű�� �Է¹ް�
//		������� ������ ���
//		�Ǽ���� �Ǽ��� ���
//		��) 183 -> 183 ���
//			183.5 -> 183.5 ���
		
		
//		���� �����ڸ� ���!
		// 1��°
		double num = 0;	// �Է��� ���� ����. �Է¹��� ���� ������ ���� �Ǽ��� ����
		boolean tof = false;	// ����/�Ǽ� ���θ� ������ ����
		String result = null;	// ���Ĺ��ڸ� �����ϴ�, ����� ���ڿ� �޽����� ���� ����
		
		Scanner sc = new Scanner(System.in);	// ��ĳ�� ����
//		�Է� �ȳ��� ���� �޽��� ���
		System.out.println("����/�Ǽ� �Ǻ����Դϴ�.\n���ڸ� �Է����ּ���.");
		System.out.print("�Է� : ");
		num = sc.nextDouble();	// �Է°��� ������ ����.
		
		tof = num - (int)num == 0;	// �Ǽ� - ������ ���� 0�̶�� true�� ������ ������� �� �� �� ����.
		result = tof ? "���(����) : %.0f" : "���(�Ǽ�) : %.1f";	// �� ���ǽ��� ����� ���ǿ� ���� ���Ĺ��ڸ� �ٸ��� ����
		
//		System.out.printf(result, tof ? (int)num : num);	// ������ %f�� ����� �Ǽ��̹Ƿ� �Ķ���Ϳ����� ���׿����ڸ� ����� �ʿ䰡 ����.
		System.out.printf(result, num);
//		sc.close();
		
////		����� ����
//		double height = 0.0;
//		String message = "Ű : 0";
////		Scanner sc = new Scanner(System.in);
//		boolean check = false; // boolean���� �ʱ�ȭ ���� false�̴�.
//		String format = null;
//		String forLength = "";
//		int length = 0;
//
//		System.out.println(message);
//		height = sc.nextDouble();
//		check = height - (int)height == 0;
//		forLength = height - (int)height + "";
//
//		length = forLength.length() > 8 ? 8 : forLength.length();
//		
//		// ���׿����ڴ� ���� �� ����� �� ������ ��Ƽ� ����� �� �� ������ ����ؼ� ����� ������ �Ѵ�.
//		format = check ? "%.0fcm" : "%." + (forLength.length()-2) + "fcm"; // ���׿����ڵ� �����ڶ� ���� + �Ǽ� ������ �ϸ� �Ǽ��� ����� ���´�.
//		System.out.printf(format, height);
	}
}