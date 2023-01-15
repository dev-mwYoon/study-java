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
//			어차피 부모필드 받으므로 sleep만 작성해도 무방.
			try {sleep(1000);} catch (InterruptedException e) {;}
		}
	}
}
