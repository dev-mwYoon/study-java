package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import domain.SalaryVO;

public class SalaryDAO {
//	추가
	public void insert(SalaryVO salaryVO) throws IOException {
		BufferedWriter bufferedWriter = DBConnecter.getAppend();
//		모든 문자열 다 가져오는 메소드 \n인 줄바꿈까지도
//		new String (Files.readAllBytes(Paths.get(DBConnecter.PATH)));
		String content = new String(Files.readAllBytes(Paths.get(DBConnecter.PATH)));
		String temp = null;
		temp = content.charAt(content.length() - 1) == '\n' ? "" : "\n";
		temp += salaryVO.toString();
		bufferedWriter.write(temp);
		bufferedWriter.close();

	}

//	수정
	public void update(SalaryVO salaryVO) throws IOException {
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";

//		line에 파일 안에 모든 줄을 \n제외하고 가져와서 대입. 마지막에 null까지 대입?
		while ((line = bufferedReader.readLine()) != null) {
//			가져온 line을 구분점으로 나눈 것에 0번째 인덱스가 콤마를 넣고 만원을 뒤에 붙인 가격과 일치하면
//			즉, 같은 줄에 연봉과 같다면 수정
			if (line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "만원")) {
//				문자열 data에 line에서 0번째 인덱스부터 맨 뒤에 공백전까지를 대입.
				String data = line.substring(0, line.lastIndexOf("    "));
//				temp에 누적연산으로 마지막공백전까지를 대입한 data를 다시 마지막 공백전까지 대입.
//				즉, 맨뒤에서 두번째 공백 전까지를 넣고, 공백 넣고, 소득세 넣고, 공백 넣고, 지방세 넣고, 줄바꿈까지하면 끝.
				temp += data.substring(0, data.lastIndexOf("    ")) + "   " + insertComma(salaryVO.getIncomeTax())
						+ "   " + insertComma(salaryVO.getLocalTax()) + "\n";
				continue;
//				System.out.println();
//				System.out.println(temp); // temp확인용
			}
			temp += line + "\n";
		}
		BufferedWriter bufferedWriter = DBConnecter.getWriter();
		bufferedWriter.write(temp);

		bufferedWriter.close();
		bufferedReader.close();

	}

//	삭제
	public void delete(SalaryVO salaryVO) throws IOException {
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";

//		line에 파일 안에 모든 줄을 \n제외하고 가져와서 대입. 마지막에 null까지 대입?
		while ((line = bufferedReader.readLine()) != null) {
//			가져온 line을 구분점으로 나눈 것에 0번째 인덱스가 콤마를 넣고 만원을 뒤에 붙인 가격과 일치하면
//			즉, 같은 줄에 연봉과 같다면 수정
			if (line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "만원")) {
//				문자열 data에 line에서 0번째 인덱스부터 맨 뒤에 공백전까지를 대입.
				String data = line.substring(0, line.lastIndexOf("    "));
//				temp에 누적연산으로 마지막공백전까지를 대입한 data를 다시 마지막 공백전까지 대입.
//				즉, 맨뒤에서 두번째 공백 전까지를 넣고, 공백 넣고, 소득세 넣고, 공백 넣고, 지방세 넣고, 줄바꿈까지하면 끝.
//				이 부분을 지우면 삭제
//				temp += data.substring(0, data.lastIndexOf("    ")) + "   " + insertComma(salaryVO.getIncomeTax())
//						+ "   " + insertComma(salaryVO.getLocalTax()) + "\n";
				continue;
//				System.out.println();
//				System.out.println(temp); // temp확인용
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
	
//	조회
	public SalaryVO view(int salary) throws IOException {
		
////		전체조회
//		System.out.println(new String (Files.readAllBytes(Paths.get(DBConnecter.PATH))));
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null;
		SalaryVO temp = new SalaryVO();
//		객체의 연봉이랑 같으면
		while((line = bufferedReader.readLine()) != null) {
			if (line.split("   ")[0].equals(insertComma(salary) + "만원")) {
//				private int salary; // 연봉
//				private int netPay; // 실수령액
//				private int taxDeductionAmount; // 공제액
//				private int pension; // 국민연금
//				private int healthInsurance; // 건강보험료
//				private int longTermCarePay; // 장기요양료
//				private int employmentInsurance; // 고용보험
//				private int incomeTax; // 소득세
//				private int localTax; // 지방소득세
				
				
				
				temp.setSalary(Integer.parseInt(line.split("   ")[0].split("만원")[0].replaceAll(",", "")));
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
//	목록
	public void viewAll() throws IOException {
	//	전체조회
		System.out.println(new String (Files.readAllBytes(Paths.get(DBConnecter.PATH))));
	}
	
	
//	메모장에서만 하기 때문에
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
