package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> : ���׸�(�̸��� ����)
//		��üȭ �� Ÿ���� �����ϴ� ���.
//		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//		���� �ٿ� ĳ������ �� �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ִ�.

//		���߿� � Ÿ���� ������� �𸣱� ������
//		���׸����� �����Ͽ� ����� �� ���׸� �κ��� �����ϸ� ��ΰ� �� �ٲ�.
//		�ڡ����׸��� Ŭ���� Ÿ��!�ڡ�
//		ArrayList�� ����ϴ� ���� : �ǹ� ���� �����͸� ��� �����ϱ� ����.

		ArrayList<Integer> datas = new ArrayList<>(); // �����͸� ���� ��ŭ ĭ ���� �þ.
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

//		�ּ� ����
		System.out.println("====================");
		Collections.sort(datas); // �������� ����
//		Collections.reverse(datas); // reverse�� ����� �������� �Ųٷ� �ٲ��ִ� �޼ҵ�
//		Collections.shuffle(datas);

		for (int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i));
		}

		System.out.println("====================");
//		�߰�(����)
//		50 �ڿ� 500 ����

//		1. �����Ϳ� 50�� �ִ���
//		2. 500�� �߰��Ͽ� 50 �ڷ� ����.

//		if (datas.contains(50)) {
//			datas.add(datas.indexOf(50) + 1, 500);
//		}

		System.out.println(datas.toString());

//      ����
//      90�� 9�� ����
		int prev = 0;
		if (datas.contains(90)) {
			prev = datas.set(datas.indexOf(90), 9);
			System.out.println(prev + "�� 9�� ����");
			System.out.println(datas);
		}

//      ����
//      80 ����
//      1. �ε����� ����
		int removedData = 0;
		if (datas.contains(80)) {
			removedData = datas.remove(datas.indexOf(80));
			System.out.println(removedData + " ����");
			System.out.println(datas);
		}

//      2. ������ ����
		if (datas.remove(Integer.valueOf(80))) {
			System.out.println("���� ����");
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
