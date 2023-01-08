package mycastingTest;

import java.util.Scanner;

//	���ø���
//	�ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
//	����ڰ� ������ ������
//	�ִϸ��̼��̶�� "�ڸ�����" ��� ����
//	��ȭ��� "4D"��� ���
//	��󸶶�� "����" ��� ���


public class MyCastingTask {
	
	public void checkVideo(MyVideo video) {
		if(video instanceof MyAnimation) {
			MyAnimation animation = (MyAnimation) video;
			animation.getSubTitle();
		}else if(video instanceof MyFilm) {
			MyFilm film = (MyFilm) video;
			film.moveChair();
		}else if(video instanceof MyDrama) {
			MyDrama drama = (MyDrama) video;
			drama.sellGoods();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		MyVideo[] videos = {
				new MyAnimation(),
				new MyFilm(),
				new MyDrama()
		};
		
		MyCastingTask castingTask = new MyCastingTask();
	      
	      for (int i = 0; i < videos.length; i++) {
	         castingTask.checkVideo(videos[i]);
	      }

		
		
		
	}
}
