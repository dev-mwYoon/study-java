package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
		String[] games = {"��Ʋ�׶���", "��", "������ġ", "�ν�Ʈ��ũ", "�����ý��丮", "��Ÿũ����Ʈ"};
		
//		�迭�� (���Ͽ�)����ϰ� ��ü ������ �����ͼ� �ֿܼ� ����ϱ�
		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/task.txt", true));
//		for (int i = 0; i < games.length; i++) {
//			bufferedWriter.write(games[i] + "\n");
////			System.out.println(); // �ǹ�X
//		}
//		bufferedWriter.close();
		
		
//		BufferedReader bufferedReader = null;
//		bufferedReader = new BufferedReader(new FileReader("src/task.txt"));
//		String line = null;
//		try {
//			while ((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("�߸��� ����Դϴ�.");
//			e.printStackTrace();
//		} finally {
//			if (bufferedReader != null) {
//				bufferedReader.close();
//			}
//		}
		
//		�ν�Ʈ��ũ�� ����2002�� ����
		BufferedReader bufferedReader = null;
		String line = null, temp ="";
		final String TARGET = "�ν�Ʈ��ũ";
		try {
//			bufferedReader�� task.txt�ȿ� (�о��)������ �����Ѵ�.
			bufferedReader = new BufferedReader(new FileReader("src/task.txt"));
			
//			bufferedReader���� \n�� ���� null������ �ҷ��� ���� line�� ��� ���������� null.
			while((line = bufferedReader.readLine()) != null) {
//				TARGET�� ����2002�� �̾ƿ� line�� ���ٸ� ����2022 ����
				if (line.equals(TARGET)) {
					temp += "����2002\n";
					continue;
				}
				temp += line + "\n";
			}
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/task.txt"));
			bufferedWriter.write(temp);
			bufferedWriter.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� ����Դϴ�.");
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
		
////		����2002 ����
//		BufferedReader bufferedReader = null;
//		String line = null, temp ="";
//		final String TARGET = "����2002";
//		try {
//			bufferedReader = new BufferedReader(new FileReader("src/task.txt"));
//			while((line = bufferedReader.readLine()) != null) {
//				if (line.equals(TARGET)) {
////					temp += "����2002\n"; // �� �κ��� ���� ����.
//					continue;
//				}
//				temp += line + "\n";
//			}
//			
//			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/task.txt"));
//			bufferedWriter.write(temp);
//			bufferedWriter.close();
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("�߸��� ����Դϴ�.");
//			e.printStackTrace();
//		} finally {
//			if (bufferedReader != null) {
//				bufferedReader.close();
//			}
//		}
	}
}
