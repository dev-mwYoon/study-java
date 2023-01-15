package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamTask {

	public int change(int number) {
		return number - 48;
	}

	public static void main(String[] args) {
//      10~1���� ArrayList�� ��� ���
		ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(0, 9).forEach(data -> datas.add(10 - data));
//      System.out.println(datas);

//      1~10���� ArrayList�� ��� ���
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      System.out.println(datas);

//      ABCDEF�� �� ���ں��� ���
//      "ABCDEF".chars().forEach(c -> System.out.print((char)c));
//      IntStream.rangeClosed('A', 'F').forEach(c -> System.out.print((char)c));

//      1~100���� �� Ȧ���� ArrayList�� ��� ���
//      IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(datas::add);
//      System.out.println(datas);

//      A~F���� �� D�����ϰ� ArrayList�� ��� ���
//      IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> System.out.print((char)c));

//      5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yellow, PINk), toLowerCase()
		ArrayList<String> strings = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yellow", "PINk"));
//		strings.stream().map(c -> c.toLowerCase()).forEach(System.out::println);
//		strings.stream().map(String::toLowerCase).forEach(System.out::println);

//		filter
//      1~100���� �� Ȧ���� ArrayList�� ��� ���
		IntStream.range(1, 101).filter(c -> c % 2 == 1).forEach(datas::add);
		datas.forEach(System.out::println);

//      Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
		fruits.stream().filter(data -> data.charAt(0) >= 'A').filter(data -> data.charAt(0) <= 'Z')
				.forEach(System.out::println);

//      �ѱ��� ������ ����
//		ArrayList<String> hangles = new ArrayList<String>(Arrays.asList("�����̻�����ĥ�ȱ�"));
//		Scanner sc = new Scanner(System.in);
//		ArrayList<String> temp = new ArrayList<String>();

		
		
//		ArrayList.indexOf("A")
//		IntStream.range(0, str.length()).filter(c -> hangles.indexOf(str.charAt(c))).forEach(null);
//		String hangle = "�����̻�����ĥ�ȱ�";
//		String str = "�����̻�";
//		str.chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
//		str.chars().map(hangle::indexOf).forEach(System.out::print);

//      ������ �ѱ۷� ����
//		String number = "1234";
//		String hangle = "�����̻�����ĥ�ȱ�";
//		StreamTask streamTask = new StreamTask();
//		number.chars().map(streamTask::change).forEach(i -> System.out.print(hangle.charAt(i)));

	}
}
