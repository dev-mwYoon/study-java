//package fileTest;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FileTest {
//	public static void main(String[] args) throws IOException{
//
////		���� ���: ��𿡼� �ۼ��ص� ã�ư� �� �ִ� ���, C:/a/b
////		��� ��� : ���� ��ġ�� ���� ����Ǵ� ���, ../a/b
//		BufferedWriter bufferedWriter = null;
////		����
////		try {
////			bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt"));
////		} catch (IOException e) {
////			e.printStackTrace();
////		} finally {
////			if (bufferedWriter != null) {
////				bufferedWriter.close();
////			}
////		}
//		bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt"));
//		if (bufferedWriter != null) {
//			bufferedWriter.close();
//		}
////		����
//		File file = new File("src/test.txt");
//		if(file.exists()) {
//			file.delete();
//		}
//		
//		//      ���� ���: ��𿡼� �ۼ��ص� ã�ư� �� �ִ� ���, C:/a/b
//      ��� ���: ���� ��ġ�� ���� ����Ǵ� ���, ../a/b
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt"));
////      bufferedWriter.close();
//      
////      ���� ���� �� �پ��� ������ �߻��Ͽ�, 9���� ���� ���ʹ� ������� ���� close()�� ����!
////      System.gc();
////      System.runFinalization();   
//      
//      File file = new File("src/test.txt");
//      if (file.exists()) {
//         file.delete();
//      }
//	}
//}

package fileTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FileTest {

	public static void main(String[] args) throws IOException {

//      ���� ���: ��𿡼� �ۼ��ص� ã�ư� �� �ִ� ���, C:/a/b
//      ��� ���: ���� ��ġ�� ���� ����Ǵ� ���, ../a/b
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt"));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt", true));
//		bufferedWriter.write("�ȳ�"); // ����ҰŸ� write , �ҷ��ðŸ� read
//		bufferedWriter.close();

		BufferedReader bufferedReader = null; 
		try {
			bufferedReader = new BufferedReader(new FileReader("src/test.txt"));
//		bufferedReader.readLine(); // �� ���� ���ڿ��� �о��
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line); // ������ �� �ٹٲ��� �����ʴ´�.
			}
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� ���");
		} finally { // finally�� ��� � ���� �ݴ��� �˷��ֱ� ������ �������� ����.
			if(bufferedReader != null) {
				bufferedReader.close();
			}
		}
		
//      ���� ���� �� �پ��� ������ �߻��Ͽ�, 9���� ���� ���ʹ� ������� ���� close()�� ����!
//      System.gc();
//      System.runFinalization();   

//		File file = new File("src/test.txt");
//		if (file.exists()) {
//			file.delete();
//		}
	}
}
