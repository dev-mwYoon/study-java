package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.IntStream;

import domain.NameVO;

public class TotalDAO {
	
	public ArrayList<NameVO> merge() throws FileNotFoundException, IOException {
		ArrayList<NameVO> results = new ArrayList<>();
		BoysDAO boy = new BoysDAO();
		GirlsDAO girl = new GirlsDAO();
		results.addAll(boy.setObject());
		results.addAll(girl.setObject());
		
		return results;
	}
	
	public ArrayList<NameVO> removeOverlap() throws FileNotFoundException, IOException {
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 20, 30, 30, 20, 50));
//		HashSet<Integer> dataSet = new HashSet<Integer>(datas);
//		datas = new ArrayList<Integer>(dataSet);
//		System.out.println(datas);
		
//		ArrayList<NameVO> datas = new ArrayList<NameVO>();
//		HashSet<NameVO> dataSet = new HashSet<NameVO>(merge());
//		datas = new ArrayList<NameVO>(dataSet);
		
		ArrayList<Integer> amounts = new ArrayList<Integer>();
		amounts = merge().stream().map(NameVO::getNameNumber).forEach(i -> (Object)merge().add(i));
		HashSet<Integer> amountSet = new HashSet<Integer>(amounts);
		
		
		
		
		
		
		return datas;
	}
	
	public void sort() {
		ArrayList<NameVO> results = new ArrayList<NameVO>();
//		ArrayList<NameVO> rankings = 
		
	}
	
////	�̻��� ���� �� ����
//	public void sort() {
////		DB�� �ִ� �̻������� ���� ������ ������ ���
//		ArrayList<Love> results = new ArrayList<Love>();
//		
////		�̻������� ���̸� ���� �ڷᱸ��
//		ArrayList<Integer> ages = new ArrayList<Integer>();
//		
////		loves���� ���̸� �����ͼ� ages�� �߰�
//		for (Love love : loves) {
//			ages.add(love.getAge());
//		}
//		
////		������������ ����
//		Collections.sort(ages);
//		
//		for (int age : ages) {
//			for (int i=0; i<loves.size(); i++) {
//				if(loves.get(i).getAge() == age) {
//					results.add(loves.get(i));
//					loves.remove(loves.get(i));
//				}
//			}
//		}
//		loves = results;
//	}
	
	
	
	
}
