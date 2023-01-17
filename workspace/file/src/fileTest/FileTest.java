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
////		절대 경로: 어디에서 작성해도 찾아갈 수 있는 경로, C:/a/b
////		상대 경로 : 현재 위치에 따라 변경되는 경로, ../a/b
//		BufferedWriter bufferedWriter = null;
////		생성
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
////		삭제
//		File file = new File("src/test.txt");
//		if(file.exists()) {
//			file.delete();
//		}
//		
//		//      절대 경로: 어디에서 작성해도 찾아갈 수 있는 경로, C:/a/b
//      상대 경로: 현재 위치에 따라 변경되는 경로, ../a/b
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt"));
////      bufferedWriter.close();
//      
////      성능 저하 및 다양한 결함이 발생하여, 9버전 이후 부터는 사용하지 말고 close()를 쓰자!
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

//      절대 경로: 어디에서 작성해도 찾아갈 수 있는 경로, C:/a/b
//      상대 경로: 현재 위치에 따라 변경되는 경로, ../a/b
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt"));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt", true));
//		bufferedWriter.write("안녕"); // 출력할거면 write , 불러올거면 read
//		bufferedWriter.close();

		BufferedReader bufferedReader = null; 
		try {
			bufferedReader = new BufferedReader(new FileReader("src/test.txt"));
//		bufferedReader.readLine(); // 한 줄을 문자열로 읽어옴
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line); // 가져올 때 줄바꿈은 하지않는다.
			}
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 경로");
		} finally { // finally에 써야 어떤 것을 닫는지 알려주기 때문에 가독성이 좋다.
			if(bufferedReader != null) {
				bufferedReader.close();
			}
		}
		
//      성능 저하 및 다양한 결함이 발생하여, 9버전 이후 부터는 사용하지 말고 close()를 쓰자!
//      System.gc();
//      System.runFinalization();   

//		File file = new File("src/test.txt");
//		if (file.exists()) {
//			file.delete();
//		}
	}
}
