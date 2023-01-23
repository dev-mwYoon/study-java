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
	public ArrayList<GirlVO> girls = new ArrayList<GirlVO>();
	public ArrayList<BoyVO> boys = new ArrayList<BoyVO>();
	
//	boy.txt, girl.txt, �ΰ� ���ĵ� txt�� ��θ� ����.
	public void merge(String path1, String path2, String path3) throws IOException {
//		boy.txt�� �о����
		BufferedReader boyReader = DBConnecter.getReader(path1);
//		girl.txt�� �о����
		BufferedReader girlReader = DBConnecter.getReader(path2);
//		����ο� ��� writer�� null�� �����صΰ�
		BufferedWriter bufferedWriter = null;
		
//		setObject�� ����ϱ����� �������ְ�
		GirlDAO girlDAO = new GirlDAO();
		BoyDAO boyDAO = new BoyDAO();
		
//		����Ŵϱ� null�� ����, temp�� �����������ٲ��ϱ� �������� ����
		String line = null, temp = "";
		
//		boy.txt�� ���پ� �Ͼ�� ���� line�� ���
		while((line = boyReader.readLine()) != null) {
//			DAO���� ������ �ʵ忡 �ϳ��� ��� �޼ҵ��� setObject�� ���.
			boys.add(boyDAO.setObject(line));
//			�о�� ���ٰ� �ٳѱ���� �ѹ��� temp�� ��������.
			temp += line + "\n";
		}
//		�о���� boy�޸��� �ݱ�
		boyReader.close();
		
//		girl�� boy�� ����.
		while((line = girlReader.readLine()) != null) {
			girls.add(girlDAO.setObject(line));
			temp += line + "\n";
		}
		
		girlReader.close();
		
		
//		path3��ο� ��� ���� ����
		bufferedWriter = DBConnecter.getWriter(path3);
//		temp�� path3��ο� �����
		bufferedWriter.write(temp);
//		�� ��� path3�� �ݰ�
		bufferedWriter.close();
	}
	
//	������Ʈ��ŷ�� map���� �ϳ��� �ʵ常���� �������Ͽ� ��Ƽ��Ÿ���� ����Ʈ�� ���
//	�װ� HashSet���� �ߺ� ���� �� �ٽ� ��̸���Ʈ�� �����ؼ� ����ݴϴ�.
//	�׷��� ��� �α����� ���� ��̸���Ʈ�� ���Ͽ�
//	������ ���� ��̸���Ʈ�� ����ָ� ��ŷ�� ���� �ο����ݴϴ�.
//	�߰���, ���⼭ ���� �� �ڽ��� boy���� girl���� �˻� ��
//	gender�� �߰����ݴϴ�.
	public void updateRanking(String path) throws IOException {
//		��� path�� �޾Ƽ� �޸����� ŵ�ϴ�.
		BufferedWriter bufferedWriter = DBConnecter.getWriter(path);
//		VO���� �ϳ��� ���� �θ� NameŬ���� Ÿ���� ��̸���Ʈ�� ����
		ArrayList<Name> names = new ArrayList<Name>();
//		�ϳ��� �ʵ常 ���� ��Ƽ�� Ÿ���� ����Ʈ�� ����ٰŴϱ� null�� ����.
		List<Integer> populations = null;
//		�ߺ������� ��Ƽ�� Ÿ���� HashSet�� �����Ÿ� null�� ����.
		HashSet<Integer> populationSet = null;
		
//		���� ���� ��ŷ�� �����ϰ�, �ߺ��� ��ŷ��ŭ ������ ī��Ʈ�� ����
		int ranking = 1, count = 0;
//		������������ temp����
		String temp = "";
		
//		names��ü�� girls�� boys�� ����ִ� ��� ���� ����.
		names.addAll(girls);
		names.addAll(boys);
		
//		��Ʈ���� �÷���(�迭 ����)�� ���� ��Ҹ� �ϳ��� �����ؼ� ���ٽ����� ó���� �� �ֵ��� ���ִ� �ݺ���
//		�ߺ� ���ſ� HashSet�� names�� ��µ� stream�� ����Ͽ�
//		map�Լ��� ��ü���� �α��� �ʵ常 �̾ƿ�.
//		�ٵ� ���� ������ ����� �� Ŭ����Ÿ�� Ȥ�� staticŸ���� Ŭ������ Ȥ�� �빮�ڷ� ����ϰ� ����Ϸ��� �޼ҵ带 �ۼ�.
//		�׸��� �ݷ�Ʈ �ڷᱸ������ toList�޼ҵ带 ����ؼ� ����ƮŸ������ ��´�.
//		�װ��� HashSet�� populationSet�� ��´�.
		populationSet = new HashSet(names.stream()
				.map(Name::getPopulation).collect(Collectors.toList()));
		
//		�÷�����(static���� ���ǵ� �޼ҵ带 ��Ƶ� Ŭ����)
//		�ݷ��ʹ� �ڷᱸ���� ����Ͽ� ��� ���� ��
		
//		HashSet�� populationSet�� �ٽ� ��Ƽ��Ÿ���� ��̸���Ʈ�� �����ϴµ� sorted�޼ҵ带 ����ؼ�
//		�����ϴµ� �÷�����(static���� ���ǵ� �޼ҵ带 ��Ƶ� Ŭ����)�� �������� ���ĸ޼ҵ带 ����ϰ�,
//		�ݷ��� �ڷᱸ���� ����Ʈ Ÿ������ ��ȯ�Ͽ� ��´�.
		populations = new ArrayList<Integer>(populationSet).stream()
				.sorted(Collections.reverseOrder()).collect(Collectors.toList());
		
//		��Ƽ�� Ÿ���� populations�� �� ��ŭ for�� �ݺ�
		for (Integer population : populations) {
//			
			count = 0;
//			���� names��ü�� �� ��ŭ �ݺ�
			for (Name nameVO : names) {
//				�ٵ� ���� names�� �α����� populations�� �α����� ���ٸ�
				if(population == nameVO.getPopulation()) {
//					���ο� nameDTO ��ü�� �����ϰ�
					NameDTO nameDTO = new NameDTO();
//					�ٿ�ĳ������ nameVO��ü�� BoyVO�� ���ٸ� B �ƴϸ� G�� gender�ʵ忡 �߰�.
					nameDTO.setGender(nameVO instanceof BoyVO ? "B" : "G");
					nameDTO.setName(nameVO.getName());
					nameDTO.setRanking(ranking);
					nameDTO.setPopulation(nameVO.getPopulation());
					temp += nameDTO.toString() + "\n";
					
//					�ߺ��� ��츦 ����� count����
					count++;
				}
			}
//			���� �ߺ��� ��찡 1�ʰ�(2�̻�)�̸�
			if(count > 1) {
//				���� ��ŷ�� �ߺ��� Ƚ����ŭ ������.
				ranking += count;
//				�̷��� �� ��� ��ŷ�� �̹� �ߺ��� ����ŭ �þ�� ������ +1�����ֱ� ���� continue
				continue;
			}
//			�ߺ�Ƚ���� 2�̻��� �ƴ϶�� +1
			ranking ++;
		}
		
//		�������� toString�� �ٳѱ���� �־ temp�� �����Ÿ� �޸��忡 �߰� 
		bufferedWriter.write(temp);
//		�޸��� �ݱ�
		bufferedWriter.close();
	}
	
//	�ڸ��� 3������ �޸� �־��ִ� �޼ҵ�
	public static String insertComma(int number) { // �Ű� ������ ������ ����
		String temp = String.valueOf(number); // ������ ���ڸ� temp�� ���ڿ��� ����
		String result = ""; // ���� ������ ���� �� ���ڿ� ����
		
//		�Ű������� �޾ƿ� ������ �ڸ���
//		��, temp�� ���̸�ŭ for�� �ݺ�
		for (int i = 0; i < temp.length(); i++) {
			if(i != 0 && i % 3 == 0) { // i�� 0�� �ƴϸ鼭 i�� 3���� ������ �� �������� 0
//				��, ���ڸ������� �޸� �ۼ�
				result = "," + result;
			}
			
			result = temp.charAt
//					temp.length() -1 => �ε��� �����ַ���
					(temp.length() - 1 - i) 
//					���� result ��������
					+ result;
		}
		return result;
	}
}














