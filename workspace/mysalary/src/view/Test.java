package view;

import java.io.IOException;

import dao.SalaryDAO;
import domain.SalaryVO;

public class Test {
	public static void main(String[] args) throws IOException {
//		System.out.println(SalaryDAO.insertComma(159438));
//		SalaryVO salaryVO_15100 = new SalaryVO();
//		SalaryDAO salaryDAO = new SalaryDAO();
//		
//		salaryVO_15100.setSalary(15100);
//		salaryVO_15100.setNetPay(9_000_000);
//		
////		IOException이 들어감
//		salaryDAO.insert(salaryVO_15100);

//		SalaryVO salaryVO = new SalaryVO();
//		SalaryDAO salaryDAO = new SalaryDAO();
////	      
//		salaryVO.setSalary(15100);
//		salaryVO.setIncomeTax(1000000);
////	      salaryVO.setNetPay(9_000_000);
////	      
////	      salaryDAO.insert(salaryVO);
//
//		salaryDAO.update(salaryVO);
		
//		salaryDAO.view(salaryVO);
		
		
		SalaryVO salaryVO = new SalaryVO();
		SalaryDAO salaryDAO = new SalaryDAO();
		
		
		System.out.println(salaryDAO.view(3400));
		
	}
}
