package collectionTask;

import java.util.ArrayList;
import java.util.Scanner;

//[��ȭ �ǽ�]
//		   User Ŭ���� ����
//		   - �̸�, ���̵�, ��й�ȣ, �޴�����ȣ
//		   - private���� ����
//		   - �⺻ �����ڸ� ����
//		   - toString() ������
//		   
//		   UserField Ŭ���� ����
//		   - ȸ�� ������ ���� DB�� ArrayList�� ����
//		   - ���̵� �ߺ��˻�
//		   - ȸ������
//		   - �α���
//		   - ��ȣȭ
//		   - ��й�ȣ ����(��й�ȣ ã�� ����)
//		   - ������ȣ ����
//
//		   Page Ŭ���� ����
//		   - main �޼ҵ� ����
//		   - �׽�Ʈ ����
public class Page {
	public static void main(String[] args) {
		/*
		 * ȸ������ �α��� ��й�ȣ ����
		 * 
		 */

		String name = null, id = null, password = null, phoneNumber = null, certificationNumber = null;
		String temp = null;
		String nameMessage = "�̸� �Է�";
		String idMessage = "���̵� �Է�";
		String reinputIdMessage = "���̵� �ߺ��Դϴ�. �ٽ� �Է����ּ���.";
		String passwordMessage = "��й�ȣ �Է�";
		String rePasswordMessage = "���ο� ��й�ȣ �Է�";
		String phoneNumberMessage = "�ڵ�����ȣ �Է�";
		String reinputPhoneNumberMessage = "�޴�����ȣ �ߺ��Դϴ�. �ٽ� �Է����ּ���.";
		String certificationMessage = "������ȣ�� �Է����ּ���.";
		UserField userField = new UserField();
		User user = new User();

		ArrayList<User> users = userField.users;

		Scanner sc = new Scanner(System.in);
//		   - ���̵� �ߺ��˻�
//		   - ȸ������
//		   - �α���
//		   - ��ȣȭ
//		   - ��й�ȣ ����(��й�ȣ ã�� ����)
//		   - ������ȣ ����
		int choice = 0;
		boolean flag = false;
		String[] arMsg = { "1. ȸ������", "2. �α���", "3. ��й�ȣ ã��", "4. ������" };
		
		for (int i = 0; i < arMsg.length; i++) {
			System.out.println(arMsg[i]);
		}
		choice = sc.nextInt();

		while (true) {
			switch (choice) {
//			ȸ������
			case 4: {
				System.out.println("�����մϴ�.");
				flag = true;
				break;
			}
			case 1: {
//				�̸� �Է�
				System.out.println(nameMessage);
				name = sc.next();
				user.setName(name);

//				���̵� �Է�
				System.out.println(idMessage);
				id = sc.next();

//				���̵� �ߺ��˻�
				while (userField.checkId(id) != null) {
					System.out.println(reinputIdMessage);
					id = sc.next();
					System.out.println(userField.checkId(id));
				}
				user.setId(id);

//				��й�ȣ �Է�
				System.out.println(passwordMessage);
				password = sc.next();
				user.setPassword(password);

//				�޴�����ȣ �Է�
				System.out.println(phoneNumberMessage);
				phoneNumber = sc.next();
				user.setPhoneNumber(phoneNumber);
//				while(userField.checkPhoneNumber(phoneNumber) != null) {
//					System.out.println(reinputPhoneNumberMessage);
//					phoneNumber = sc.next();
//				}

//				��� ����Ʈ users��ü�� user�߰�
				users.add(user);
				break;
			}
//			�α���
			case 2: {
				while (true) {
					System.out.println(idMessage);
					id = sc.next();
					System.out.println(passwordMessage);
					password = sc.next();
					userField.login(id, password);
					
					if (userField.login(id, password) != null) {
						break;
					}
					System.out.println("�α��� ����");
				}
				
				break;
			}
//			��й�ȣ ã��
			case 3: {
				while (true) {
					System.out.println(idMessage);
					id = sc.next();
					if(userField.checkId(id) == null) {
						continue;
					}
					user = userField.checkId(id);
					System.out.println(phoneNumberMessage);
					phoneNumber = sc.next();
					temp = userField.sendCertificationNumber(phoneNumber);
					
					System.out.println(certificationMessage);
					certificationNumber = sc.next();
					
					if (certificationNumber.equals(temp)) {
						System.out.println(rePasswordMessage);
						password = sc.next();
						user.setPassword(password);
						break;
					}
				}
				break;
			}
//			�߸� �Է�.
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
//			4.������ �Է� �� flag true�� ��ȯ
			if(flag) {break;}
		}

	}
}
