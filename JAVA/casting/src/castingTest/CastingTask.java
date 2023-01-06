package castingTest;

import java.util.Scanner;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스 선언
// 사용자가 선택,한 영상이 
// 애니메이션이라면 "자막 지원"기능 사용
// 영화라면 "4D"기능 사용
// 드라마라면 "굿즈"기능


public class CastingTask {
	
	void CheckCategory(Video video) {
		
		if(video instanceof Animation) {
			Animation animation = (Animation) video;
			animation.printVideo();
		}else if(video instanceof Drama) {
			Film film = (Film) video;
			film.printVideo();
		}else {
			Drama drama = (Drama) video;
			drama.printVideo();
		}
	}	
	
	public static void main(String[] args) {
		CastingTask c = new CastingTask();
		Video[] video = {
				new Animation(),
				new Film(),
				new Drama()
		};
		
		for (int i = 0; i < video.length; i++) {
			c.CheckCategory(video[i]);
		}
		
	}
}
