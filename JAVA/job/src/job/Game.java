package job;

import java.util.Random;
import java.util.Scanner;

class PrimitiveMan {
//	종족
	String identity;
//	성별
	String gender;
//	사냥, 채집 성공 횟수
	int count;
//	생명력 
	int restCount;
	
	public PrimitiveMan() {;}

	public PrimitiveMan(String identity, int restCount) {
		this.identity = identity;
		this.restCount = restCount;
	}
	
//	채집
	boolean faming() {
		if(count < 5) {
			count++;
			return true;
		}
		return false;
	}
	
//	사냥
	boolean hunting() {
		if(count < 10) {
			count++;
			return true;
		}
		return false;
	}
	
//	생명력 차감
	boolean restCountMin() {
		if(restCount == 0) {
			return false;
		}else {
			restCount--;
			return true;
		}
	}
	
//	휴식 시 생명력 추가
	void restCountUp() {
		restCount += 3;
	}
	
//	확률 메소드
	boolean percent() {
		Random r = new Random();
		int[] rating = new int[10];
		int data = 50;
		
		for (int i = 0; i < data / 10; i++) {
			rating[i] = 1;
		}
		if(rating[r.nextInt(10)] == 1) {
			return true;
		}
		
		return false;
	}
	
//	원시인으로 진화
	boolean wonsi() {
		if(count == 5) {
			return true;
		}
		return false;
	}
	
//	원시인 -> 사람
	boolean human() {
		if(count == 10) {
			return true;
		}
		return false;
			
	}
	
}

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] menus = {"종족을 선택해 주세요.\n1.원숭이\n2.원시인\n3.평범한 사람\n4.외계인\n5.종료",
				"성별을 골라주세요.\n1.남\n2.여",
				"1.채집 2.잠자기 3.진화 4.내정보 5.종료",
				"1.사냥 2.먹기 3.진화 4.내정보 5.종료"
		};
		PrimitiveMan[] pm = new PrimitiveMan[2];
		pm[0] = new PrimitiveMan("원숭이", 10);
		pm[1] = new PrimitiveMan("원시인", 15);
		
		String errMsg = "다시 입력해주세요", famingMsg = "";
		int choice = 0, data = 0;
		boolean check = false, flag = false;

		while(true) {
			System.out.println(menus[0]);
			choice = sc.nextInt();
//			종족선택 (원숭이)
			if(choice == 1) {
				
				System.out.println(pm[0].identity + "입니다. -우끼끼-");				
				while(true) {
					
					System.out.println(menus[1]);
					choice = sc.nextInt();
//					성별 남자
					if(choice == 1) {
						pm[0].gender = "남";
						
						while(true) {
							System.out.println(menus[2]);
							choice = sc.nextInt();
//							바나나 채집
							if(choice == 1) {
//								채집량이 5개 보다 낮을 때
								if(pm[0].count < 5) {
									if(pm[0].restCount > 0) {
									
										famingMsg ="우끼끼";
//										스레드.sleep()를 써서 채집 시간을 만듬
										try {
											System.out.print(famingMsg);
											for (int i = 0; i < 2; i++) {
												Thread.sleep(500);
												System.out.print("...");
												famingMsg += "...";
											}
											System.out.println();
										}catch(Exception e) {
											System.out.println(e);
										}
										
										check = pm[0].percent();
//										바나나 채집 성공 시
										if(check) {
											pm[0].faming();
											pm[0].restCountMin();
											System.out.println("바나나 채집 성공");
											System.out.println("바나나 갯수 : " + pm[0].count +"개");
//									   채집 실패 시
										}else {
											pm[0].restCountMin();
											System.out.println("채집 실패\n바나나 갯수 : " + pm[0].count + "개");
										}
//									생명력이 0일 때
									}else {
										System.out.println("휴식을 취해야합니다.");
									}
//									채집량이 5개 일 때
								}else {
									System.out.println("채집은 최대 5개까지 가능합니다.");
								}
						
//							원숭이 휴식 
							}else if(choice == 2) {
								
								check = pm[0].percent();
								
								if(check) {
									pm[0].restCountUp();
									System.out.println("잠자기 성공 " + pm[0].restCount + " 생명력");
								}else {
									System.out.println("불면증");
									System.out.println("잠자기 실패 " + pm[0].restCount + " 생명력");
								}
//							3번 진화 선택 시
							}else if(choice == 3) {
//								바나나 채집량이 5개 일때
								if(pm[0].wonsi()) {
									pm[0].count -= 5;
									
									check = pm[0].percent();
									
									if(check) {
										pm[1].gender = pm[0].gender;
										System.out.println(pm[1].identity + "로 진화하셨습니다.");
										System.out.println("우가우가우가우~~~~가");
										System.out.println("생명력은 15로 초기화 됩니다.");
										while(true) {
											System.out.println(menus[3]);
											choice = sc.nextInt();
	//										원시인 사냥
											if(choice == 1) {
												if(pm[1].count < 10) {
													if(pm[1].restCount > 0){
														famingMsg ="우가우가...";
//														쓰레드.sleep()
														try {
															System.out.print(famingMsg);
															for (int i = 0; i < 2; i++) {
																Thread.sleep(500);
																System.out.print("...");
																famingMsg += "...";
															}
															System.out.println();
														}catch(Exception e) {
															System.out.println(e);
														}
														
														check = pm[1].percent();
														
														if(check) {
//															사냥 성공 시
															pm[1].hunting();
															pm[1].restCountMin();
															System.out.println("멧돼지 사냥 성공 -우가우가-");
															System.out.println("사냥 성공 횟수 : " + pm[1].count +"회");
//														사냥 실패 시
														}else {
															pm[1].restCountMin();
															System.out.println("사냥 실패\n사냥 성공 횟수 : " + pm[1].count + "회");
														}
													}else {
//														생명력이 0 일 때
														System.out.println("휴식이 필요합니다.");
													}
//												사냥 성공횟수가 10번 일 때
												}else {
													System.out.println("사냥은 10번 성공까지 가능합니다.");
												}
												
	//										원시인 휴식 
											}else if(choice == 2) {
												
												check = pm[1].percent();
												
												if(check) {
													pm[1].restCountUp();
													System.out.println("주서먹기 성공 " + pm[1].restCount + " 생명력");
												}else {
													System.out.println("독버섯...");
													System.out.println("주서먹기 실패 " + pm[1].restCount + " 생명력");
												}
//											사냥 성공 횟수가 10번 일 때
											}else if(choice == 3) {
												if(pm[1].human()) {
													pm[1].count -= 10;
													System.out.println("원시인에 만족해~");
													flag = true;
//											10번의 사냥을 성공을 못 채웟을때;
												}else {
													
													System.out.println("10번의 사냥 성공을 이뤄내세요.");
												}
//											원시인의 내정보
											}else if(choice == 4) {
												
												System.out.println("종족 : " + pm[1].identity + "\n성별 : " + pm[1].gender + "\n사냥성공횟수 : " + pm[1].count +"회" + "\n생명력 : " + pm[1].restCount);
//											종료 눌럿을 때
											}else if(choice == 5){

												flag = true;
//											1,2,3,4,5 외 다른 걸 선택했을 때
											}else {
												System.out.println(errMsg);
											}
											if(flag) {
												
												break;
											}
											
										}
										
									}else {
//										진화 선택 후 확률싸움에서 지면 진화 실패
										System.out.println("진화 실패");
									}
//									이미 5개의 채집량을 가지고 있다면
								}else {
									System.out.println("5개의 바나나를 채집하세요.");
								}
//							내정보
							}else if(choice == 4) {
								
								System.out.println("종족 : " + pm[0].identity + "\n성별 : " + pm[0].gender + "\n바나나 갯수 : " + pm[0].count +"개" + "\n생명력 : " + pm[0].restCount);
//							종료 선택시
							}else if(choice == 5){
								
								flag = true;
							}else {
								
								System.out.println(errMsg);
							}
							if(flag) {
								
								break;
							}
							
						}
//					성별이 여자일 경우
					}else if(choice == 2) {
							System.out.println("남잔거 다 알어 되돌아가");
					}
					if(flag) {
						
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
				flag = true;
			}else {
				System.out.println("errMsg");
			}
			if(flag) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
		}	
		
	}
}
