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
//      10~1까지 ArrayList에 담고 출력
		ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(0, 9).forEach(data -> datas.add(10 - data));
//      System.out.println(datas);

//      1~10까지 ArrayList에 담고 출력
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      System.out.println(datas);

//      ABCDEF를 각 문자별로 출력
//      "ABCDEF".chars().forEach(c -> System.out.print((char)c));
//      IntStream.rangeClosed('A', 'F').forEach(c -> System.out.print((char)c));

//      1~100까지 중 홀수만 ArrayList에 담고 출력
//      IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(datas::add);
//      System.out.println(datas);

//      A~F까지 중 D제외하고 ArrayList에 담고 출력
//      IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> System.out.print((char)c));

//      5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yellow, PINk), toLowerCase()
		ArrayList<String> strings = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yellow", "PINk"));
//		strings.stream().map(c -> c.toLowerCase()).forEach(System.out::println);
//		strings.stream().map(String::toLowerCase).forEach(System.out::println);

//		filter
//      1~100까지 중 홀수만 ArrayList에 담고 출력
		IntStream.range(1, 101).filter(c -> c % 2 == 1).forEach(datas::add);
		datas.forEach(System.out::println);

//      Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
		ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
		fruits.stream().filter(data -> data.charAt(0) >= 'A').filter(data -> data.charAt(0) <= 'Z')
				.forEach(System.out::println);

//      한글을 정수로 변경
//		ArrayList<String> hangles = new ArrayList<String>(Arrays.asList("공일이삼사오육칠팔구"));
//		Scanner sc = new Scanner(System.in);
//		ArrayList<String> temp = new ArrayList<String>();

		
		
//		ArrayList.indexOf("A")
//		IntStream.range(0, str.length()).filter(c -> hangles.indexOf(str.charAt(c))).forEach(null);
//		String hangle = "공일이삼사오육칠팔구";
//		String str = "공일이삼";
//		str.chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
//		str.chars().map(hangle::indexOf).forEach(System.out::print);

//      정수를 한글로 변경
//		String number = "1234";
//		String hangle = "공일이삼사오육칠팔구";
//		StreamTask streamTask = new StreamTask();
//		number.chars().map(streamTask::change).forEach(i -> System.out.print(hangle.charAt(i)));

	}
}
