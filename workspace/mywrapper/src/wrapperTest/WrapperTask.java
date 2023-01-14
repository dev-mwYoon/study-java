package wrapperTest;

import java.sql.Wrapper;

public class WrapperTask {
	public static void main(String[] args) {
//		1, 12.5, 86.6F, '2', "Hi", false
//		위 6개의 값을 6칸 배열에 담기
		Object[] arData = {Integer.valueOf(1), 12.5, 86.6F, '2', "Hi", false};
		
		for (int i = 0; i < arData.length; i++) {
			System.out.println(arData[i]);
		}
		
		
		
	}
}
