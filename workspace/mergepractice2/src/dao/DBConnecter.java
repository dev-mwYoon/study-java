package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnecter {
//	���Ͽ� ����� �޼ҵ�
	public static BufferedWriter getBufferedWriter (String path) throws IOException {
		return new BufferedWriter(new FileWriter(path));
	}
	
//	���Ͽ� �̾�� �޼ҵ�
	public static BufferedWriter getBufferedAppend (String path) throws IOException {
		return new BufferedWriter(new FileWriter(path, true));
	}
	
	
//	���� �о���� �޼ҵ�
	public static BufferedReader getBufferedReader (String path) throws IOException {
		return new BufferedReader(new FileReader(path));
	}
	
	
}





















