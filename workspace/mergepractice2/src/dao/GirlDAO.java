package dao;

import domain.BoyVO;
import domain.GirlVO;

public class GirlDAO {
//	setObject메소드는 txt파일에서 한줄씩 읽어온 것을 line에 담는다.
	public GirlVO setObject(String line) {
//		line에 담은 것을 탭을 구분점으로 스트링 배열에 담는다.
		String[] datas = line.split(",");
//		새로운 boyVO 객체 생성
		GirlVO girlVO = new GirlVO();
//		인덱스 대신 i 선언
		int i = 0;
//		girlVO에 스트링 배열 0번째 인덱스에 담긴 이름을 새로 set해서 담음.
		girlVO.setName(datas[i++]);
//		girlVO에 스트링 배열 1번째 인덱스에 담긴 랭킹을 replaceAll메소드를 사용해서 콤마를 제거 후 정수로 형변환해서 담음.
		girlVO.setRanking(Integer.parseInt(datas[i++].replaceAll(",", "")));
//		girlVO에 스트링 배열 2번째 인덱스에 담긴 인구수를 replaceAll메소드를 사용해서 콤마를 제거 후 정수로 형변환해서 담음. 
		girlVO.setPopulation(Integer.parseInt(datas[i++].replaceAll(",", "")));
		
		return girlVO;
	}
}
