package dao;

import domain.BoyVO;

public class BoyDAO {
//	setObject�޼ҵ�� txt���Ͽ��� ���پ� �о�� ���� line�� ��´�.
	public BoyVO setObject(String line) {
//		line�� ���� ���� ���� ���������� ��Ʈ�� �迭�� ��´�.
		String[] datas = line.split("\t");
//		���ο� boyVO ��ü ����
		BoyVO boyVO = new BoyVO();
//		�ε��� ��� i ����
		int i = 0;
//		boyVO�� ��Ʈ�� �迭 0��° �ε����� ��� �̸��� ���� set�ؼ� ����. 
		boyVO.setName(datas[i++]);
//		boyVO�� ��Ʈ�� �迭 1��° �ε����� ��� ��ŷ�� replaceAll�޼ҵ带 ����ؼ� �޸��� ���� �� ������ ����ȯ�ؼ� ����. 
		boyVO.setRanking(Integer.parseInt(datas[i++].replaceAll(",", "")));
//		boyVO�� ��Ʈ�� �迭 2��° �ε����� ��� �α����� replaceAll�޼ҵ带 ����ؼ� �޸��� ���� �� ������ ����ȯ�ؼ� ����. 
		boyVO.setPopulation(Integer.parseInt(datas[i++].replaceAll(",", "")));
		
		return boyVO;
	}
}
