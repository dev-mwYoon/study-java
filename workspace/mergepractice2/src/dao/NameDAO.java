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
//	병합 할 때 girls와 boys를 사용하고
//	랭킹 업데이트 할 때에도 girls와 boys를 사용하는데
//	같은 girls와 boys를 사용하기도 하고 merge에서 return이 불가능하므로
//	전역변수로 선언 후 new까지 해서 같은 객체를 사용.
	
//	boy.txt, girl.txt, 두개 합쳐둘 txt에 경로를 받음.
	public void merge(String path1, String path2, String path3) throws IOException {
//		boy.txt를 읽어오고
//		girl.txt를 읽어오고
//		선언부에 덮어쓸 writer를 null로 선언해두고
		
//		setObject를 사용하기위해 선언해주고
		
//		덮어쓸거니까 null로 선언, temp는 누적연산해줄꺼니까 공백으로 선언
		
//		boy.txt를 한줄씩 일어온 것을 line에 담고
//			DAO에서 한줄을 필드에 하나씩 담는 메소드인 setObject를 사용.
//			읽어온 한줄과 줄넘김까지 한번에 temp에 누적연산.
//		읽어오는 boy메모장 닫기
		
//		girl도 boy와 같음.
		
		
//		path3경로에 덮어쓸 파일 열고
//		temp를 path3경로에 덮어쓰고
//		다 덮어쓴 path3을 닫고
	}
	
//	업데이트랭킹은 map으로 하나의 필드만으로 재정의하여 인티저타입의 리스트에 담고
//	그걸 HashSet으로 중복 제거 후 다시 어레이리스트에 정렬해서 담아줍니다.
//	그렇게 담긴 인구수를 기존 어레이리스트와 비교하여
//	같으면 기존 어레이리스트에 담아주며 랭킹은 새로 부여해줍니다.
//	추가로, 여기서 담을 때 자식이 boy인지 girl인지 검사 후
//	gender를 추가해줍니다.

//		덮어쓸 path를 받아서 메모장을 킵니다.
//		VO들을 하나로 묶은 부모 Name클래스 타입의 어레이리스트를 선언
//		하나의 필드만 담을 인티저 타입의 리스트를 담아줄거니까 null로 선언.
//		중복제거할 인티저 타입의 HashSet을 담을거를 null로 선언.
		
//		새로 담을 랭킹을 선언하고, 중복된 랭킹만큼 증가할 카운트를 선언
//		누적연산해줄 temp선언
		
//		names객체에 girls와 boys에 들어있는 모든 것을 담음.
		
//		스트림은 컬렉션(배열 포함)의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자
//		중복 제거용 HashSet에 names를 담는데 stream을 사용하여
//		map함수로 객체에서 인구수 필드만 뽑아옴.
//		근데 참조 변수를 사용할 때 클래스타입 혹은 static타입은 클래스명 혹은 대문자로 사용하고 사용하려는 메소드를 작성.
//		그리고 콜렉트 자료구조에서 toList메소드를 사용해서 리스트타입으로 담는다.
//		그것을 HashSet인 populationSet에 담는다.
		
//		컬렉션즈(static으로 정의된 메소드를 모아둔 클래스)
//		콜렉터는 자료구조를 사용하여 담기 위해 씀
		
//		HashSet인 populationSet을 다시 인티저타입의 어레이리스트로 변형하는데 sorted메소드를 사용해서
//		정렬하는데 컬렉션즈(static으로 정의된 메소드를 모아둔 클래스)의 내림차순 정렬메소드를 사용하고,
//		콜렉터 자료구조로 리스트 타입으로 변환하여 담는다.
		
//		인티저 타입의 populations의 수 만큼 for문 반복
//			비교할 names객체의 수 만큼 반복
//				근데 만약 names의 인구수와 populations의 인구수가 같다면
//					새로운 nameDTO 객체를 생성하고
//					다운캐스팅한 nameVO객체가 BoyVO와 같다면 B 아니면 G를 gender필드에 추가.
					
//					중복된 경우를 대비해 count증가

//			만약 중복된 경우가 1초과(2이상)이면
//				기존 랭킹에 중복된 횟수만큼 더해줌.
//				이렇게 될 경우 랭킹은 이미 중복된 수만큼 늘어났기 때문에 +1안해주기 위해 continue
//			중복횟수가 2이상이 아니라면 +1
		
//		재정의한 toString을 줄넘김까지 넣어서 temp에 담은거를 메모장에 추가 
//		메모장 닫기
	
//	자리수 3개마다 콤마 넣어주는 메소드
// 	매개 변수로 정수형 숫자
	public static String insertComma(int number) { 
// 		정수형 숫자를 temp의 문자열로 변경
		String temp = String.valueOf(number);
// 		누적 연산을 위한 빈 문자열 생성
		String result = "";
		
//		즉, temp의 길이만큼 for문 반복
		for (int i = 0; i < temp.length(); i++) {
// 			i가 0이 아니면서 i를 3으로 나눴을 때 나머지가 0
			
//				즉, 세자리수마다 콤마 작성
			
//			temp.length() -1 => 인덱스 맞춰주려고 기존 result 누적연산
//			temp길이에서 temp를 문자 하나씩 쪼갠거의 인덱스와 result를 더하고 그걸 다시 result에 담음 
		}
		
//		result를 리턴해준다.
		return null;
	}
}














