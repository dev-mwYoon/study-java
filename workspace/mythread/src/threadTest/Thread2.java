package threadTest;

public class Thread2 implements Runnable {
	@Override
	public void run() {
		String a = Thread.currentThread().getName();
		System.out.println(a);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
