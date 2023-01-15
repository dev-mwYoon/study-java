package threadTask;

//	[���� �ǽ�]
//	�����̳� ���������� 3������ ������ �ִ�.
//	�� ������ �����Ҹ��� �ٸ��� 2������ ������ ���ÿ� ���.
//	������ 1���� ������ 2���� ������ ��� ��� ���� �������� ���.
//	  
//	package ���� threadTask�� ����� Ŭ������ 2���� �����Ѵ�.
//	�ϳ��� Ŭ�������� main �����尡 �ִ�.
//	Runnable �������̽��� ��Ƽ�����带 �����ϰ� �ݵ�� join()�� ����Ѵ�.
//	�� �� ������ 10������ ���.
//	
//	�ּ��� �ۼ��Ͽ��°�
//	Thread�� name�ʵ带 ����� �� �ִ°�
//	�迭�� ����Ͽ��°�
//	Ŭ������ �� �� �����Ͽ��°�
//	������ : ���ٽ��� ����Ͽ��°�, main �����带 ����Ͽ��°�

public class Zoo {
	public static void main(String[] args) {

//		Thread1 thread = new Thread1();
//		
////		����1 ��ü ����
//		Thread t1 = new Thread(thread, "1�� ����");
////		����2 ��ü ����
//		Thread t2 = new Thread(thread, "2�� ����");
//		
////		1�� ������ 2�� ���� ��� ����.
//		t1.start();
//		t2.start();
//		try {
////			3�� ������ ���� �����庸�� ���� ��� ���� join() �޼ҵ� ���.
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e1) {	// join()�޼ҵ� Ư���� try catch���� ���� �ش� ������ ó�����־����.
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
////		3�� ������ 10�� ��� ��.
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1 + ". 3�� ������ ���.");
//		}

//		Thread1 target = new Thread1();
//		target��ü�� ��ĳ�����Ͽ� FunctionalInterface�� ���ǵ� �͸� �޼ҵ带 ���ٽ����� ������.

////		==========================================================
//		Runnable target = () -> {
////			�����帶�� �̸��� �ֱ� ���� ��� �� name ���ڿ��� ����.
//			String name = Thread.currentThread().getName();
////			������ 10�� ��� �ϱ� ���� �ۼ�.
//			for (int i = 0; i < 10; i++) {
//				System.out.println(i + 1 + ". " + name + "�� ���.");
////				�ӵ��� �ʹ� ���� ���� ����ó�� ������ ���� �� �־ sleep�޼ҵ� ��� �� try catch�� ����ó��.
//				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//			}
//			
//		};
//		
////		����1 ��ü ���� �� Runnable Ÿ���� ���ٽ����� �������� target ��ü�� �ް� ������� ����.
//		Thread t1 = new Thread(target, "1�� ����");
////		����2 ��ü ���� �� Runnable Ÿ���� ���ٽ����� �������� target ��ü�� �ް� ������� ����.
//		Thread t2 = new Thread(target, "2�� ����");
//		
////		����1,2 ���ÿ� ��� ����
//		t1.start();
//		t2.start();
//		try {
////			����3�� ���� ���� ��� ���� join()�޼ҵ� ���.
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {;} //join() �޼ҵ� ��� �� try catch������ ����ó�� �ʿ�.
//		
////		3�� ������ 10�� ��� ��.
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1 + ". 3�� ������ ���.");
//		}

//		==========================================================
////		Animal animal = new Animal();
//		Runnable animal = () -> {
////			���� �������� ��ü ���� �� ������ �̸��� name�� ��Ƶ�. 
//			String name = Thread.currentThread().getName();
////			10�� ��� �� for�� 10�� �ݺ�.
//			for (int i = 0; i < 10; i++) {
//				System.out.println(i + 1 + ". " + name + "�� ���.");
////				sleep���� ���� �ߴܽ�Ų ��� try catch�� ���� ��Ƶξ���Ѵ�.
//				try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//			}
//		};
//		String[] sounds = {"����", "�޿�", "�߿�"};
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
//		���� �������� ��ü ���� �� ������ �̸��� name�� ��Ƶ�. 
			String name = Thread.currentThread().getName();
//		10�� ��� �� for�� 10�� �ݺ�.
			for (int i = 0; i < 10; i++) {
				System.out.println(i + 1 + ". " + name + "�� ���.");
//			sleep���� ���� �ߴܽ�Ų ��� try catch�� ���� ��Ƶξ���Ѵ�.
				try {Thread.sleep(1000);
				} catch (InterruptedException e) {;}
			}
		};
		new Animal().makeSounds(animal);

	}
}
