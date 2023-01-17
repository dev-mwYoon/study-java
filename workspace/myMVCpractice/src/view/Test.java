package view;

import java.io.FileNotFoundException;
import java.io.IOException;

import dao.BoysDAO;
import dao.GirlsDAO;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		for (int i = 0; i < new BoysDAO().setObject().size(); i++) {
			System.out.println(new BoysDAO().setObject().get(i));
		}
		for (int i = 0; i < new GirlsDAO().setObject().size(); i++) {
			System.out.println(new GirlsDAO().setObject().get(i));
		}
		
	}
}
