package mycastingTest;

import java.util.Scanner;

//	넷플릭스
//	애니메이션, 영화, 드라마 클래스 선언
//	사용자가 선택한 영상이
//	애니메이션이라면 "자막지원" 기능 지원
//	영화라면 "4D"기능 사용
//	드라마라면 "굿즈" 기능 사용


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
