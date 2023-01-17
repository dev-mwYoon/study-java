package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import domain.SalaryVO;

public class SalaryDAO {
//	�߰�
	public void insert(SalaryVO salaryVO) throws IOException {
		BufferedWriter bufferedWriter = DBConnecter.getAppend();
//		��� ���ڿ� �� �������� �޼ҵ� \n�� �ٹٲޱ�����
//		new String (Files.readAllBytes(Paths.get(DBConnecter.PATH)));
		String content = new String(Files.readAllBytes(Paths.get(DBConnecter.PATH)));
		String temp = null;
		temp = content.charAt(content.length() - 1) == '\n' ? "" : "\n";
		temp += salaryVO.toString();
		bufferedWriter.write(temp);
		bufferedWriter.close();

	}

//	����
	public void update(SalaryVO salaryVO) throws IOException {
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";

//		line�� ���� �ȿ� ��� ���� \n�����ϰ� �����ͼ� ����. �������� null���� ����?
		while ((line = bufferedReader.readLine()) != null) {
//			������ line�� ���������� ���� �Ϳ� 0��° �ε����� �޸��� �ְ� ������ �ڿ� ���� ���ݰ� ��ġ�ϸ�
//			��, ���� �ٿ� ������ ���ٸ� ����
			if (line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "����")) {
//				���ڿ� data�� line���� 0��° �ε������� �� �ڿ� ������������ ����.
				String data = line.substring(0, line.lastIndexOf("    "));
//				temp�� ������������ ������������������ ������ data�� �ٽ� ������ ���������� ����.
//				��, �ǵڿ��� �ι�° ���� �������� �ְ�, ���� �ְ�, �ҵ漼 �ְ�, ���� �ְ�, ���漼 �ְ�, �ٹٲޱ����ϸ� ��.
				temp += data.substring(0, data.lastIndexOf("    ")) + "   " + insertComma(salaryVO.getIncomeTax())
						+ "   " + insertComma(salaryVO.getLocalTax()) + "\n";
				continue;
//				System.out.println();
//				System.out.println(temp); // tempȮ�ο�
			}
			temp += line + "\n";
		}
		BufferedWriter bufferedWriter = DBConnecter.getWriter();
		bufferedWriter.write(temp);

		bufferedWriter.close();
		bufferedReader.close();

	}

//	����
	public void delete(SalaryVO salaryVO) throws IOException {
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";

//		line�� ���� �ȿ� ��� ���� \n�����ϰ� �����ͼ� ����. �������� null���� ����?
		while ((line = bufferedReader.readLine()) != null) {
//			������ line�� ���������� ���� �Ϳ� 0��° �ε����� �޸��� �ְ� ������ �ڿ� ���� ���ݰ� ��ġ�ϸ�
//			��, ���� �ٿ� ������ ���ٸ� ����
			if (line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "����")) {
//				���ڿ� data�� line���� 0��° �ε������� �� �ڿ� ������������ ����.
				String data = line.substring(0, line.lastIndexOf("    "));
//				temp�� ������������ ������������������ ������ data�� �ٽ� ������ ���������� ����.
//				��, �ǵڿ��� �ι�° ���� �������� �ְ�, ���� �ְ�, �ҵ漼 �ְ�, ���� �ְ�, ���漼 �ְ�, �ٹٲޱ����ϸ� ��.
//				�� �κ��� ����� ����
//				temp += data.substring(0, data.lastIndexOf("    ")) + "   " + insertComma(salaryVO.getIncomeTax())
//						+ "   " + insertComma(salaryVO.getLocalTax()) + "\n";
				continue;
//				System.out.println();
//				System.out.println(temp); // tempȮ�ο�
			}
			temp += line + "\n";
		}
		BufferedWriter bufferedWriter = DBConnecter.getWriter();
		bufferedWriter.write(temp);

		bufferedWriter.close();
		bufferedReader.close();

	}
	public void returnInt() {
		
	}
	
//	��ȸ
	public SalaryVO view(int salary) throws IOException {
		
////		��ü��ȸ
//		System.out.println(new String (Files.readAllBytes(Paths.get(DBConnecter.PATH))));
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null;
		SalaryVO temp = new SalaryVO();
//		��ü�� �����̶� ������
		while((line = bufferedReader.readLine()) != null) {
			if (line.split("   ")[0].equals(insertComma(salary) + "����")) {
//				private int salary; // ����
//				private int netPay; // �Ǽ��ɾ�
//				private int taxDeductionAmount; // ������
//				private int pension; // ���ο���
//				private int healthInsurance; // �ǰ������
//				private int longTermCarePay; // ������
//				private int employmentInsurance; // ��뺸��
//				private int incomeTax; // �ҵ漼
//				private int localTax; // ����ҵ漼
				
				
				
				temp.setSalary(Integer.parseInt(line.split("   ")[0].split("����")[0].replaceAll(",", "")));
				temp.setNetPay(Integer.parseInt(line.split("   ")[1].replaceAll(",", "")));
				temp.setTaxDeductionAmount(Integer.parseInt(line.split("   ")[2].replaceAll(",", "")));
				temp.setPension(Integer.parseInt(line.split("   ")[3].replaceAll(",", "")));
				temp.setHealthInsurance(Integer.parseInt(line.split("   ")[4].replaceAll(",", "")));
				temp.setLongTermCarePay(Integer.parseInt(line.split("   ")[5].replaceAll(",", "")));
				temp.setEmploymentInsurance(Integer.parseInt(line.split("   ")[6].replaceAll(",", "")));
				temp.setIncomeTax(Integer.parseInt(line.split("   ")[7].replaceAll(",", "")));
				temp.setLocalTax(Integer.parseInt(line.split("   ")[8].replaceAll(",", "")));
				
				
			}
		}
		
		return temp;
	}
//	���
	public void viewAll() throws IOException {
	//	��ü��ȸ
		System.out.println(new String (Files.readAllBytes(Paths.get(DBConnecter.PATH))));
	}
	
	
//	�޸��忡���� �ϱ� ������
	public static String insertComma(int number) {
		String temp = String.valueOf(number);
		String result = "";
		for (int i = 0; i < temp.length(); i++) {
			if (i != 0 && i % 3 == 0) {
				result = "," + result;

			}
			result = temp.charAt(temp.length() - 1 - i) + result;

		}
		return result;
	}
}
