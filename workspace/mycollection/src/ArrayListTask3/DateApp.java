package ArrayListTask3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DateApp {
	ArrayList<Love> loveInfo = DBConnecter.loveInfo;
//	�̻��� �ߺ� �˻�
//	��ȣ, �̸�, ����
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
	
	
//	- ����ڰ� ���ϴ� ������ �̻��� ��� ��ȸ
	public ArrayList<Love> findLove(int age){
		ArrayList<Love> arAge = null;
		for (Love love : loveInfo) {
			if (love.getAge() == age) {
				arAge.add(love);
			}
		}
		return arAge;
	}
//	- �̻����� ���� ����
	public void changeAge(Love love) {
		for (Love realLove : loveInfo) {
			if (realLove.getNumber() == love.getNumber()) {
				realLove.setAge(love.getAge());
			}
		}
	}
	
	
//	- �̻��� ���� �� ����
	public void sortAge() {
		ArrayList<Love> sortAge = null;
		for (Love love : loveInfo) {
			
		}
		
//		Collections.sort((List<T>) loveInfo);
//		
//		Collections.sort(loveInfo, love.age);
	}
}
