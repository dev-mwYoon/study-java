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

// Runnable �Լ��� �������̽��� ����
public class Animal/* implements Runnable */{
////	�͸�޼ҵ� run�� ������
//	@Override
//	public void run() {
//		
////		���� �������� ��ü ���� �� ������ �̸��� name�� ��Ƶ�. 
//		String name = Thread.currentThread().getName();
////		10�� ��� �� for�� 10�� �ݺ�.
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + 1 + ". " + name + "�� ���.");
////			sleep���� ���� �ߴܽ�Ų ��� try catch�� ���� ��Ƶξ���Ѵ�.
//			try {Thread.sleep(1000);} catch (InterruptedException e) {;}
//		}
//	}
	
//	==========================================
	
	public void makeSounds(Runnable animal) {
		String[] sounds = {"����", "�޿�", "�߿�"};
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
