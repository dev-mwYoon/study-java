package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread1Ŭ������ ������ �κ�
//		Thread1 t1 = new Thread1("��");
//		Thread1 t2 = new Thread1("��");
//		
//		t1.start();
//		t2.start();
		
//		t1.run();
//		t2.run();
//		================================
		

//		Runnable thread = new Thread2(); // ��ĳ����
		Thread2 thread = new Thread2();
//		Runnable target = () -> {
//			for (int i = 0; i < 10; i++) {
//				
//				System.out.println(Thread.currentThread().getName());
//				try {
//					Thread.sleep(1000);
//				} catch (Exception e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		};
		
		
		
//		Thread t1 = new Thread(thread, "?");
//		Thread t2 = new Thread(thread, "!");
//							 ������ �ʵ��� �ּҰ�
//		Thread t1 = new Thread(run() -> {}, "?");
//		Thread t1 = new Thread(() -> {}, "?");
//		Thread t1 = new Thread(target, "?");
//		Thread t2 = new Thread(target, "!");
		
		
		
//		t1.start();
//		try {t1.join();} catch (InterruptedException e) {;}	//	t1 ���� �� �����ϰ� ���� ��
//		t2.start();
		
//		t1.start();
//		System.out.println("�ȳ�!");	// ���� �޼ҵ�, ��, �켱������ ���θ޼ҵ���� ����. �׷��� �ӵ��� ���� ������ ������ ���θ޼ҵ尡 ���߿� ���۵� ���� �ִ�.
//		try {t1.join();} catch (InterruptedException e) {;}	//	���� ������ �޼ҵ��� join() �޼ҵ� ���.
//		t2.start();
		
	}
}

