package job;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		PrimitiveMan pm = new PrimitiveMan();
		String msg1 = "������ ������ �ּ���.\n1.������\n2.������\n3.����� ���\n4.�ܰ���\n5.����";
		String errMsg = "�ٽ� �Է����ּ���";
//		String famingMsg = "";
		int choice = 0;
		boolean flag1 = false;
		int[] rating = new int[10];
		int data = 0;

		while(true) {
			System.out.println(msg1);
			choice = sc.nextInt();
//			�������� (������)
			if(choice == 1) {
				
				pm.identity = "������";
				System.out.println(pm.identity + "�Դϴ�. -�쳢��-");				
				while(true) {
					
					System.out.println("������ ����ּ���\n1.��\n2.��");
					choice = sc.nextInt();
//					���� ����
					if(choice == 1) {
						pm.gender = "��";
						
						while(true) {
							System.out.println("1.ä�� 2.�޽� 3.��ȭ 4.������ 5.����");
							choice = sc.nextInt();
//							ä��
							if(choice == 1 && pm.restCount > 0) {
								pm.faming();
//								famingMsg ="ä�� ��";
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
									System.out.println("�ٳ��� ä�� ����");
									System.out.println("�ٳ��� ���� : " + pm.count +"��");
								}else {
									pm.restCount--;
									System.out.println("ä�� ����\n�ٳ��� ���� : " + pm.count + "��");
								}
//							�޽� 
							}else if(choice == 2) {
								pm.rest();
								data = 50;
								for (int i = 0; i < data / 10; i++) {
									rating[i] = 1;
								}
								
								if(rating[r.nextInt(10)] == 1) {
									pm.restCount += 3;
									System.out.println("���ڱ� ���� " + pm.restCount + " �����");
								}else {
									System.out.println("�Ҹ���");
									System.out.println("���ڱ� ���� " + pm.restCount + " �����");
								}
								
							}else if(choice == 3) {
								
								if(pm.count(pm.count)) {
									
									pm.count -= 5;
									System.out.println("��� ��ȭ�� ������... �ٺξ�");
									flag1 = true;
								}else {
									
									System.out.println("5���� ��� ������ �̷ﳻ����.");
								}
							}else if(choice == 4) {
								
								System.out.println("���� : " + pm.identity + "\n���� : " + pm.gender + "\n��ɼ���Ƚ�� : " + pm.count +"ȸ" + "\n����� : " + pm.restCount);
							}else if(choice == 5){
								
								flag1 = true;
							}else if(pm.restCount == 0) {
								System.out.println("�޽��� ���� ���ּ���");
							}else {
								
								System.out.println(errMsg);
							}
							if(flag1) {
								
								break;
							}
							
						}
//					������ ������ ���
					}else if(choice == 2) {
							System.out.println("���ܰ� �� �˾� �ǵ��ư�");
					}
					if(flag1) {
						
						break;
					}
				}
				
//			������	
			}else if(choice == 2) {
				System.out.println("�������� �� �� �˾Ѿ�?");
			
//			����� ���
			}else if(choice == 3) {
				System.out.println("����� ����� ���� ���� ��");

//			�ܰ���
			}else if(choice == 4) {
				System.out.println("�ܰ����� ���� �� �Ѥ�;;");

//			����
			}else if(choice == 5) {
				flag1 = true;
			}else {
				System.out.println("errMsg");
			}
			if(flag1) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			
		}	
		
	}
}
