package methodTest;

public class Test {
	void change(int[] data) {
		data[0] = 20; // 3��
	}
	
	public static void main(String[] args) {
		int[] data = {10}; // 1��
		new Test().change(data); // 2��
		System.out.println(data[0]); // 4��
	}
}





















