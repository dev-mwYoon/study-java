package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnecter {
//	파일에 덮어쓰기 메소드
	public static BufferedWriter getBufferedWriter (String path) throws IOException {
		return new BufferedWriter(new FileWriter(path));
	}
	
//	파일에 이어쓰기 메소드
	public static BufferedWriter getBufferedAppend (String path) throws IOException {
		return new BufferedWriter(new FileWriter(path, true));
	}
	
	
//	파일 읽어오기 메소드
	public static BufferedReader getBufferedReader (String path) throws IOException {
		return new BufferedReader(new FileReader(path));
	}
	
	
}





















