package anonymousTask;

public class Building {
   public static void main(String[] args) {
      StarBucks gangnam = new StarBucks();
      StarBucks jamsil = new StarBucks();
      
//      메뉴만 구성하면 되기 때문에 FormAdapter로 작성한다.
      jamsil.register(new FormAdapter() {
         
         @Override
         public String[] getMenu() {
            return new String[] {"물"};
         }
      });
      
//      양식 전체를 작성해야 하기 때문에 Form을 작성한다.
      gangnam.register(new Form() {
         
         @Override
         public void sell(String menu) {
            String[] menus = getMenu();
            for (int i = 0; i < menus.length; i++) {
               if(menus[i].equals(menu)) {
                  System.out.println(menu + " 판매 완료");
               }
            }
         }
         
         @Override
         public String[] getMenu() {
            return new String[] {"아메리카노", "카푸치노", "아포가토", "미니언 비행기"};
         }
      });
//      --------------------------------------------------------
      System.out.println("---------------------------------");
      Nike gangNam2 = new Nike();
      Nike jamsil2 = new Nike();

      System.out.println("-- 강남점 판매 목록 --");
      gangNam2.register(new FormAdapter() {
		@Override
		public String[] getMenu() {
			return new String[] {"신발","옷","패딩"};
		}
	});
      
      System.out.println("-- 잠실점 판매 목록 -- ");
      jamsil2.register(new Form() {
		
		@Override
		public void sell(String menu) {
			String[] sellMenus = getMenu();
			for (int i = 0; i < sellMenus.length; i++) {
				if(sellMenus[i].equals(menu)) {
					System.out.println(menu + " 판매");
				}else {
					System.out.println(menu + "은 매진 입니다.");
				}
			}
		}
		
		@Override
		public String[] getMenu() {
			return new String[] {"마스코트 인형"};
		}
	});
      
      
      
   }
}








