package anonymousTask;

public class Nike {

	void register(Form form) {
		String[] sellMenu = form.getMenu();
		for (int i = 0; i < sellMenu.length; i++) {
			System.out.println("판매 메뉴 : "+  sellMenu[i]);
		}
		
		if(form instanceof FormAdapter) {
			System.out.println("무료 나눔중 입니다.");
			return;
		}
		
		form.sell("신발");
	}
}
