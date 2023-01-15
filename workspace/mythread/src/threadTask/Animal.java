package threadTask;


//	[코테 실습]
//	동석이네 동물원에는 3마리의 동물이 있다.
//	각 동물은 울음소리가 다르고 2마리의 동물은 동시에 운다.
//	나머지 1마리 동물은 2마리 동물이 모두 울고 나서 마지막에 운다.
//	  
//	package 명은 threadTask로 만들고 클래스는 2개만 선언한다.
//	하나의 클래스에는 main 쓰레드가 있다.
//	Runnable 인터페이스로 멀티쓰레드를 구현하고 반드시 join()을 사용한다.
//	※ 각 동물은 10번씩만 운다.
//
//	주석을 작성하였는가
//	Thread의 name필드를 사용할 수 있는가
//	배열을 사용하였는가
//	클래스를 두 개 선언하였는가
//	가산점 : 람다식을 사용하였는가, main 쓰레드를 사용하였는가

// Runnable 함수형 인터페이스를 지정
public class Animal/* implements Runnable */{
////	익명메소드 run을 재정의
//	@Override
//	public void run() {
//		
////		현재 스레드의 객체 생성 시 정의한 이름을 name에 담아둠. 
//		String name = Thread.currentThread().getName();
////		10번 우는 것 for문 10번 반복.
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1 + ". " + name + "이 운다.");
////			sleep으로 강제 중단시킨 경우 try catch를 통해 잡아두어야한다.
//			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//		}
//	}
	
//	==========================================
	
	public void makeSounds(Runnable animal) {
		String[] sounds = {"어흥", "메에", "야옹"};
		Thread[] threads = new Thread[sounds.length];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(animal, sounds[i]);
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
			if (i != 0) {
				try {threads[i].join();} catch (InterruptedException e) {;}
			}
		}
	}
	
	
}
