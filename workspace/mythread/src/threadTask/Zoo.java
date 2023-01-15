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

public class Zoo {
	public static void main(String[] args) {

//		Thread1 thread = new Thread1();
//		
////		동물1 객체 생성
//		Thread t1 = new Thread(thread, "1번 동물");
////		동물2 객체 생성
//		Thread t2 = new Thread(thread, "2번 동물");
//		
////		1번 동물과 2번 동물 울기 시작.
//		t1.start();
//		t2.start();
//		try {
////			3번 동물인 메인 쓰레드보다 먼저 울기 위해 join() 메소드 사용.
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e1) {	// join()메소드 특성상 try catch문을 통해 해당 오류를 처리해주어야함.
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
////		3번 동물이 10번 우는 것.
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1 + ". 3번 동물이 운다.");
//		}

//		Thread1 target = new Thread1();
//		target객체를 업캐스팅하여 FunctionalInterface로 정의된 익명 메소드를 람다식으로 재정의.

////		==========================================================
//		Runnable target = () -> {
////			쓰레드마다 이름을 주기 위해 사용 및 name 문자열에 저장.
//			String name = Thread.currentThread().getName();
////			동물이 10번 울게 하기 위해 작성.
//			for (int i = 0; i < 10; i++) {
//				System.out.println(i + 1 + ". " + name + "이 운다.");
////				속도가 너무 빨라 동시 진행처럼 보이지 않을 수 있어서 sleep메소드 사용 및 try catch로 예외처리.
//				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//			}
//			
//		};
//		
////		동물1 객체 생성 시 Runnable 타입의 람다식으로 재정의한 target 객체를 받고 쓰레드명 지정.
//		Thread t1 = new Thread(target, "1번 동물");
////		동물2 객체 생성 시 Runnable 타입의 람다식으로 재정의한 target 객체를 받고 쓰레드명 지정.
//		Thread t2 = new Thread(target, "2번 동물");
//		
////		동물1,2 동시에 울기 시작
//		t1.start();
//		t2.start();
//		try {
////			동물3번 보다 먼저 울기 위해 join()메소드 사용.
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {;} //join() 메소드 사용 시 try catch문으로 예외처리 필요.
//		
////		3번 동물이 10번 우는 것.
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1 + ". 3번 동물이 운다.");
//		}

//		==========================================================
////		Animal animal = new Animal();
//		Runnable animal = () -> {
////			현재 스레드의 객체 생성 시 정의한 이름을 name에 담아둠. 
//			String name = Thread.currentThread().getName();
////			10번 우는 것 for문 10번 반복.
//			for (int i = 0; i < 10; i++) {
//				System.out.println(i + 1 + ". " + name + "이 운다.");
////				sleep으로 강제 중단시킨 경우 try catch를 통해 잡아두어야한다.
//				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//			}
//		};
//		String[] sounds = {"어흥", "메에", "야옹"};
//		Thread[] threads = new Thread[sounds.length];
//		
//		for (int i = 0; i < threads.length; i++) {
//			threads[i] = new Thread(animal, sounds[i]);
//		}
//		
//		for (int i = 0; i < threads.length; i++) {
//			threads[i].start();
//			if (i != 0) {
//				try {threads[i].join();} catch (InterruptedException e) {;}
//			}
//		}

//		===================================
		Runnable animal = () -> {
//		현재 스레드의 객체 생성 시 정의한 이름을 name에 담아둠. 
			String name = Thread.currentThread().getName();
//		10번 우는 것 for문 10번 반복.
			for (int i = 0; i < 10; i++) {
				System.out.println(i + 1 + ". " + name + "이 운다.");
//			sleep으로 강제 중단시킨 경우 try catch를 통해 잡아두어야한다.
				try {Thread.sleep(1000);
				} catch (InterruptedException e) {;}
			}
		};
		new Animal().makeSounds(animal);

	}
}
