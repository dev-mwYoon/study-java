package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> : 제네릭(이름이 없는)
//		객체화 시 타입을 지정하는 기법.
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅을 할 필요가 없으며, 지정할 타입에 제한을 줄 수 있다.

//		나중에 어떤 타입을 사용할지 모르기 때문에
//		제네릭으로 선언하여 사용할 때 제네릭 부분을 변경하면 모두가 다 바뀜.
//		★★제네릭은 클래스 타입!★★
//		ArrayList를 사용하는 이유 : 의미 없는 데이터를 모아 관리하기 위해.

		ArrayList<Integer> datas = new ArrayList<>(); // 데이터를 넣은 만큼 칸 수가 늘어남.
//		System.out.println(datas.size());

		final int SIZE = 9;

//		C
		for (int i = 0; i < SIZE; i++) {
			if (i > 4) {
				datas.add((14 - i) * 10); // 5678 > 9876
				System.out.println(datas.size());
				continue;
			}
			datas.add((i + 1) * 10);
			System.out.println(datas.size());
		}

//		R
		for (int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i));
		}

//		주소 전달
		System.out.println("====================");
		Collections.sort(datas); // 오름차순 정렬
//		Collections.reverse(datas); // reverse는 가운데를 기준으로 거꾸로 바꿔주는 메소드
//		Collections.shuffle(datas);

		for (int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i));
		}

		System.out.println("====================");
//		추가(삽입)
//		50 뒤에 500 삽입

//		1. 데이터에 50이 있는지
//		2. 500을 추가하여 50 뒤로 정렬.

//		if (datas.contains(50)) {
//			datas.add(datas.indexOf(50) + 1, 500);
//		}

		System.out.println(datas.toString());

//      수정
//      90을 9로 수정
		int prev = 0;
		if (datas.contains(90)) {
			prev = datas.set(datas.indexOf(90), 9);
			System.out.println(prev + "이 9로 수정");
			System.out.println(datas);
		}

//      삭제
//      80 삭제
//      1. 인덱스로 삭제
		int removedData = 0;
		if (datas.contains(80)) {
			removedData = datas.remove(datas.indexOf(80));
			System.out.println(removedData + " 삭제");
			System.out.println(datas);
		}

//      2. 값으로 삭제
		if (datas.remove(Integer.valueOf(80))) {
			System.out.println("삭제 성공");
			System.out.println(datas);
		}

//		datas.add(10);
//		System.out.println(datas.size());
//		datas.add(20);
//		System.out.println(datas.size());
//		datas.add(30);
//		System.out.println(datas.size());
//		datas.add(40);
//		System.out.println(datas.size());
//		datas.add(50);
//		System.out.println(datas.size());
//		datas.add(90);
//		System.out.println(datas.size());
//		datas.add(80);
//		System.out.println(datas.size());
//		datas.add(70);
//		System.out.println(datas.size());
//		datas.add(60);
//		
//		System.out.println(datas.size());
	}
}
