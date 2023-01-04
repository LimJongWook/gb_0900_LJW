package job;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		PrimitiveMan pm = new PrimitiveMan();
		String msg1 = "종족을 선택해 주세요.\n1.원숭이\n2.원시인\n3.평범한 사람\n4.외계인\n5.종료";
		String errMsg = "다시 입력해주세요";
//		String famingMsg = "";
		int choice = 0;
		boolean flag1 = false;
		int[] rating = new int[10];
		int data = 0;

		while(true) {
			System.out.println(msg1);
			choice = sc.nextInt();
//			종족선택 (원숭이)
			if(choice == 1) {
				
				pm.identity = "원숭이";
				System.out.println(pm.identity + "입니다. -우끼끼-");				
				while(true) {
					
					System.out.println("성별을 골라주세요\n1.남\n2.여");
					choice = sc.nextInt();
//					성별 남자
					if(choice == 1) {
						pm.gender = "남";
						
						while(true) {
							System.out.println("1.채집 2.휴식 3.진화 4.내정보 5.종료");
							choice = sc.nextInt();
//							채집
							if(choice == 1 && pm.restCount > 0) {
								pm.faming();
//								famingMsg ="채집 중";
//								try {
//									System.out.print(famingMsg);
//									for (int i = 0; i < 2; i++) {
//										Thread.sleep(1500);
//										System.out.print("...");
//										famingMsg += "...";
//									}
//									System.out.println();
//								}catch(Exception e) {
//									System.out.println(e);
//								}
								data = 50;
								for (int i = 0; i < data / 10; i++) {
									rating[i] = 1;
								}
								
								if(rating[r.nextInt(10)] == 1) {
									pm.count++;
									pm.restCount--;
									System.out.println("바나나 채집 성공");
									System.out.println("바나나 갯수 : " + pm.count +"개");
								}else {
									pm.restCount--;
									System.out.println("채집 실패\n바나나 갯수 : " + pm.count + "개");
								}
//							휴식 
							}else if(choice == 2) {
								pm.rest();
								data = 50;
								for (int i = 0; i < data / 10; i++) {
									rating[i] = 1;
								}
								
								if(rating[r.nextInt(10)] == 1) {
									pm.restCount += 3;
									System.out.println("잠자기 성공 " + pm.restCount + " 생명력");
								}else {
									System.out.println("불면증");
									System.out.println("잠자기 실패 " + pm.restCount + " 생명력");
								}
								
							}else if(choice == 3) {
								
								if(pm.count(pm.count)) {
									
									pm.count -= 5;
									System.out.println("사실 진화란 없엇어... 바부야");
									flag1 = true;
								}else {
									
									System.out.println("5번의 사냥 성공을 이뤄내세요.");
								}
							}else if(choice == 4) {
								
								System.out.println("종족 : " + pm.identity + "\n성별 : " + pm.gender + "\n사냥성공횟수 : " + pm.count +"회" + "\n생명력 : " + pm.restCount);
							}else if(choice == 5){
								
								flag1 = true;
							}else if(pm.restCount == 0) {
								System.out.println("휴식을 먼저 해주세요");
							}else {
								
								System.out.println(errMsg);
							}
							if(flag1) {
								
								break;
							}
							
						}
//					성별이 여자일 경우
					}else if(choice == 2) {
							System.out.println("남잔거 다 알어 되돌아가");
					}
					if(flag1) {
						
						break;
					}
				}
				
//			원시인	
			}else if(choice == 2) {
				System.out.println("원시인은 될 줄 알앗어?");
			
//			평범한 사람
			}else if(choice == 3) {
				System.out.println("평범한 사람도 못됨 수고 ㅎ");

//			외계인
			}else if(choice == 4) {
				System.out.println("외계인이 어케 됨 ㅡㅡ;;");

//			종료
			}else if(choice == 5) {
				flag1 = true;
			}else {
				System.out.println("errMsg");
			}
			if(flag1) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
		}	
		
	}
}
