package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
		String[] games = {"배틀그라운드", "롤", "오버워치", "로스트아크", "메이플스토리", "스타크래프트"};
		
//		배열로 (파일에)출력하고 전체 내용을 가져와서 콘솔에 출력하기
		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/task.txt", true));
//		for (int i = 0; i < games.length; i++) {
//			bufferedWriter.write(games[i] + "\n");
////			System.out.println(); // 의미X
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
//			System.out.println("잘못된 경로입니다.");
//			e.printStackTrace();
//		} finally {
//			if (bufferedReader != null) {
//				bufferedReader.close();
//			}
//		}
		
//		로스트아크를 피파2002로 변경
		BufferedReader bufferedReader = null;
		String line = null, temp ="";
		final String TARGET = "로스트아크";
		try {
//			bufferedReader에 task.txt안에 (읽어온)내용을 대입한다.
			bufferedReader = new BufferedReader(new FileReader("src/task.txt"));
			
//			bufferedReader에서 \n을 빼고 null전까지 불러온 것을 line에 담고 마지막에는 null.
			while((line = bufferedReader.readLine()) != null) {
//				TARGET인 피파2002과 뽑아온 line과 같다면 피파2022 대입
				if (line.equals(TARGET)) {
					temp += "피파2002\n";
					continue;
				}
				temp += line + "\n";
			}
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/task.txt"));
			bufferedWriter.write(temp);
			bufferedWriter.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 경로입니다.");
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
		
////		피파2002 삭제
//		BufferedReader bufferedReader = null;
//		String line = null, temp ="";
//		final String TARGET = "피파2002";
//		try {
//			bufferedReader = new BufferedReader(new FileReader("src/task.txt"));
//			while((line = bufferedReader.readLine()) != null) {
//				if (line.equals(TARGET)) {
////					temp += "피파2002\n"; // 이 부분을 빼야 삭제.
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
//			System.out.println("잘못된 경로입니다.");
//			e.printStackTrace();
//		} finally {
//			if (bufferedReader != null) {
//				bufferedReader.close();
//			}
//		}
	}
}
