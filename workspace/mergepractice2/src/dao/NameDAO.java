package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import domain.BoyVO;
import domain.GirlVO;
import domain.Name;
import domain.NameDTO;

public class NameDAO {
//	���� �� �� girls�� boys�� ����ϰ�
//	��ŷ ������Ʈ �� ������ girls�� boys�� ����ϴµ�
//	���� girls�� boys�� ����ϱ⵵ �ϰ� merge���� return�� �Ұ����ϹǷ�
//	���������� ���� �� new���� �ؼ� ���� ��ü�� ���.
	
//	boy.txt, girl.txt, �ΰ� ���ĵ� txt�� ��θ� ����.
	public void merge(String path1, String path2, String path3) throws IOException {
//		boy.txt�� �о����
//		girl.txt�� �о����
//		����ο� ��� writer�� null�� �����صΰ�
		
//		setObject�� ����ϱ����� �������ְ�
		
//		����Ŵϱ� null�� ����, temp�� �����������ٲ��ϱ� �������� ����
		
//		boy.txt�� ���پ� �Ͼ�� ���� line�� ���
//			DAO���� ������ �ʵ忡 �ϳ��� ��� �޼ҵ��� setObject�� ���.
//			�о�� ���ٰ� �ٳѱ���� �ѹ��� temp�� ��������.
//		�о���� boy�޸��� �ݱ�
		
//		girl�� boy�� ����.
		
		
//		path3��ο� ��� ���� ����
//		temp�� path3��ο� �����
//		�� ��� path3�� �ݰ�
	}
	
//	������Ʈ��ŷ�� map���� �ϳ��� �ʵ常���� �������Ͽ� ��Ƽ��Ÿ���� ����Ʈ�� ���
//	�װ� HashSet���� �ߺ� ���� �� �ٽ� ��̸���Ʈ�� �����ؼ� ����ݴϴ�.
//	�׷��� ��� �α����� ���� ��̸���Ʈ�� ���Ͽ�
//	������ ���� ��̸���Ʈ�� ����ָ� ��ŷ�� ���� �ο����ݴϴ�.
//	�߰���, ���⼭ ���� �� �ڽ��� boy���� girl���� �˻� ��
//	gender�� �߰����ݴϴ�.

//		��� path�� �޾Ƽ� �޸����� ŵ�ϴ�.
//		VO���� �ϳ��� ���� �θ� NameŬ���� Ÿ���� ��̸���Ʈ�� ����
//		�ϳ��� �ʵ常 ���� ��Ƽ�� Ÿ���� ����Ʈ�� ����ٰŴϱ� null�� ����.
//		�ߺ������� ��Ƽ�� Ÿ���� HashSet�� �����Ÿ� null�� ����.
		
//		���� ���� ��ŷ�� �����ϰ�, �ߺ��� ��ŷ��ŭ ������ ī��Ʈ�� ����
//		������������ temp����
		
//		names��ü�� girls�� boys�� ����ִ� ��� ���� ����.
		
//		��Ʈ���� �÷���(�迭 ����)�� ���� ��Ҹ� �ϳ��� �����ؼ� ���ٽ����� ó���� �� �ֵ��� ���ִ� �ݺ���
//		�ߺ� ���ſ� HashSet�� names�� ��µ� stream�� ����Ͽ�
//		map�Լ��� ��ü���� �α��� �ʵ常 �̾ƿ�.
//		�ٵ� ���� ������ ����� �� Ŭ����Ÿ�� Ȥ�� staticŸ���� Ŭ������ Ȥ�� �빮�ڷ� ����ϰ� ����Ϸ��� �޼ҵ带 �ۼ�.
//		�׸��� �ݷ�Ʈ �ڷᱸ������ toList�޼ҵ带 ����ؼ� ����ƮŸ������ ��´�.
//		�װ��� HashSet�� populationSet�� ��´�.
		
//		�÷�����(static���� ���ǵ� �޼ҵ带 ��Ƶ� Ŭ����)
//		�ݷ��ʹ� �ڷᱸ���� ����Ͽ� ��� ���� ��
		
//		HashSet�� populationSet�� �ٽ� ��Ƽ��Ÿ���� ��̸���Ʈ�� �����ϴµ� sorted�޼ҵ带 ����ؼ�
//		�����ϴµ� �÷�����(static���� ���ǵ� �޼ҵ带 ��Ƶ� Ŭ����)�� �������� ���ĸ޼ҵ带 ����ϰ�,
//		�ݷ��� �ڷᱸ���� ����Ʈ Ÿ������ ��ȯ�Ͽ� ��´�.
		
//		��Ƽ�� Ÿ���� populations�� �� ��ŭ for�� �ݺ�
//			���� names��ü�� �� ��ŭ �ݺ�
//				�ٵ� ���� names�� �α����� populations�� �α����� ���ٸ�
//					���ο� nameDTO ��ü�� �����ϰ�
//					�ٿ�ĳ������ nameVO��ü�� BoyVO�� ���ٸ� B �ƴϸ� G�� gender�ʵ忡 �߰�.
					
//					�ߺ��� ��츦 ����� count����

//			���� �ߺ��� ��찡 1�ʰ�(2�̻�)�̸�
//				���� ��ŷ�� �ߺ��� Ƚ����ŭ ������.
//				�̷��� �� ��� ��ŷ�� �̹� �ߺ��� ����ŭ �þ�� ������ +1�����ֱ� ���� continue
//			�ߺ�Ƚ���� 2�̻��� �ƴ϶�� +1
		
//		�������� toString�� �ٳѱ���� �־ temp�� �����Ÿ� �޸��忡 �߰� 
//		�޸��� �ݱ�
	
//	�ڸ��� 3������ �޸� �־��ִ� �޼ҵ�
// 	�Ű� ������ ������ ����
	public static String insertComma(int number) { 
// 		������ ���ڸ� temp�� ���ڿ��� ����
		String temp = String.valueOf(number);
// 		���� ������ ���� �� ���ڿ� ����
		String result = "";
		
//		��, temp�� ���̸�ŭ for�� �ݺ�
		for (int i = 0; i < temp.length(); i++) {
// 			i�� 0�� �ƴϸ鼭 i�� 3���� ������ �� �������� 0
			
//				��, ���ڸ������� �޸� �ۼ�
			
//			temp.length() -1 => �ε��� �����ַ��� ���� result ��������
//			temp���̿��� temp�� ���� �ϳ��� �ɰ����� �ε����� result�� ���ϰ� �װ� �ٽ� result�� ���� 
		}
		
//		result�� �������ش�.
		return null;
	}
}














