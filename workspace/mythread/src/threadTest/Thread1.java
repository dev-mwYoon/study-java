package threadTest;

public class Thread1 extends Thread {
	public String data;
	
	public Thread1() {;}

	public Thread1(String data) {
		super();
		this.data = data;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(data);
			
//			try {thread.sleep(1000);} catch (InterruptedException e) {;}
//			������ �θ��ʵ� �����Ƿ� sleep�� �ۼ��ص� ����.
			try {sleep(1000);} catch (InterruptedException e) {;}
		}
	}
}
