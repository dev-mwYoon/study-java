package methodTest;

public class Test {
	void change(int[] data) {
		data[0] = 20; // 3번
	}
	
	public static void main(String[] args) {
		int[] data = {10}; // 1번
		new Test().change(data); // 2번
		System.out.println(data[0]); // 4번
	}
}





















