package ArrayListTask3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DateApp {
	ArrayList<Love> loveInfo = DBConnecter.loveInfo;
//	이상형 중복 검사
//	번호, 이름, 나이
//	public Love checkLove(Love love) {
//		Love myLove = null;
//		for (Love temp : loveInfo) {
//			if (temp.)) {
//				
//			}
//		}
//		
//		return temp;
//	}
	
	
//	- 사용자가 원하는 나이의 이상형 목록 조회
	public ArrayList<Love> findLove(int age){
		ArrayList<Love> arAge = null;
		for (Love love : loveInfo) {
			if (love.getAge() == age) {
				arAge.add(love);
			}
		}
		return arAge;
	}
//	- 이상형의 나이 수정
	public void changeAge(Love love) {
		for (Love realLove : loveInfo) {
			if (realLove.getNumber() == love.getNumber()) {
				realLove.setAge(love.getAge());
			}
		}
	}
	
	
//	- 이상형 나이 순 정렬
	public void sortAge() {
		ArrayList<Love> sortAge = null;
		for (Love love : loveInfo) {
			
		}
		
//		Collections.sort((List<T>) loveInfo);
//		
//		Collections.sort(loveInfo, love.age);
	}
}
