package dao;

import domain.GirlVO;

public class GirlDAO {
//	setObject�޼ҵ�� txt���Ͽ��� ���پ� �о�� ���� line�� ��´�.
	public GirlVO setObject(String line) {
//		line�� ���� ���� ���� ���������� ��Ʈ�� �迭�� ��´�.
		String[] datas = line.split("\t");
//		���ο� boyVO ��ü ����
		GirlVO girlVO = new GirlVO();
//		�ε��� ��� i ����
		int i = 0;
//		girlVO�� ��Ʈ�� �迭 0��° �ε����� ��� �̸��� ���� set�ؼ� ����. 
		girlVO.setName(datas[i++]);
//		girlVO�� ��Ʈ�� �迭 1��° �ε����� ��� ��ŷ�� replaceAll�޼ҵ带 ����ؼ� �޸��� ���� �� ������ ����ȯ�ؼ� ����. 
		girlVO.setRanking(Integer.parseInt(datas[i++].replaceAll(",", "")));
//		girlVO�� ��Ʈ�� �迭 2��° �ε����� ��� �α����� replaceAll�޼ҵ带 ����ؼ� �޸��� ���� �� ������ ����ȯ�ؼ� ����. 
		girlVO.setPopulation(Integer.parseInt(datas[i++].replaceAll(",", "")));
		
		return girlVO;
	}
}
