package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread1클래스랑 연관된 부분
//		Thread1 t1 = new Thread1("♥");
//		Thread1 t2 = new Thread1("★");
//		
//		t1.start();
//		t2.start();
		
//		t1.run();
//		t2.run();
//		================================
		

//		Runnable thread = new Thread2(); // 업캐스팅
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
//							 구현된 필드의 주소값
//		Thread t1 = new Thread(run() -> {}, "?");
//		Thread t1 = new Thread(() -> {}, "?");
//		Thread t1 = new Thread(target, "?");
//		Thread t2 = new Thread(target, "!");
		
		
		
//		t1.start();
//		try {t1.join();} catch (InterruptedException e) {;}	//	t1 먼저 다 실행하고 싶을 때
//		t2.start();
		
//		t1.start();
//		System.out.println("안녕!");	// 메인 메소드, 즉, 우선순위가 메인메소드부터 시작. 그러나 속도가 워낙 빠르기 때문에 메인메소드가 나중에 시작될 때가 있다.
//		try {t1.join();} catch (InterruptedException e) {;}	//	먼저 실행할 메소드의 join() 메소드 사용.
//		t2.start();
		
	}
}

