package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnecter {
//	���Ͽ� ����� �޼ҵ�
	public static BufferedWriter getWriter(String path) throws IOException {
		return new BufferedWriter(new FileWriter(path));
	}
	
//	���Ͽ� �̾�� �޼ҵ�
	public static BufferedWriter getAppend(String path) throws IOException {
		return new BufferedWriter(new FileWriter(path, true));
	}
//	���� �о���� �޼ҵ�
	public static BufferedReader getReader(String path) throws IOException {
		return new BufferedReader(new FileReader(path));
	}
}





















