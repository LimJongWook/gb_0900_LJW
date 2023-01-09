package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Bank[][] arrBank = new Bank[3][100];
		int[] arCount = new int[3];
		Bank[] arBank = null;
		String[] arBankName = null;
		
		final int ACCOUNT_LENGTH = 6;
		
		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4.나가기";
//		계좌개설, 입금하기, 출금하기, 잔액조회, 계좌번호 찾기(새로운 계좌발급, 핸드폰 번호로 서비스 이용가능), 나가기
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 다시 선택";
		Scanner sc = new Scanner(System.in);
		int index = 0, choice = 0, money = 0;
		String account = "", phoneNumber = null, password = null;
		Random random = new Random();
		Bank user = null, userCheck = null;
		
		while(true) {
//			은행을 선택한다.
			System.out.println(message);
			index = sc.nextInt();
			if(index == 4) {break;} // 나가기 눌렀을 때에는 while문 즉시 탈출!
			index--; // 인덱스로 쓸 거라서 1을 빼준다.
			
			while(true) {
				// menu 메세지 출력
				System.out.println(menu);
				// menu 중에 선택할 번호 클릭
				choice = sc.nextInt();
				// 6번 선택시 while문 탈출
				if(choice == 6) {break;}
				
				if(choice == 1) { // 계좌 개설
					// arBank배열에 3개의 생성자 담기
					arBank = new Bank[] {new Shinhan(), new Kookmin(), new KaKao()};
					arBankName = new String[] {"신한", "국민", "카카오"};
					
					while(true) {// 계좌번호 만들기 ACCOUNT_LENGTH 상수로 만들어서 사용
						for (int i = 0; i < ACCOUNT_LENGTH; i++) {
							// random 0~9 중에 숫자 랜덤으로 6개 뽑아서 합치기
							account += random.nextInt(10);
						}
						// userCheck에 Bank의 메소드를 사용해서 계좌번호 검사
						userCheck = Bank.checkAccount(arrBank, arCount, account);
						// 만약 userCheck가 null 이면 while문 탈출
						if(userCheck == null) {break;}
					}
					// user에 arBank[]에 담겨있는 생성자를 담아준다.
					user = arBank[index];
					// user.BankName에 담아주기
					user.setBankName(arBankName[index]);
					// 생성된 계좌번호를 유저의 계좌에 추가
					user.setAccount(account);
					// 생성된 계좌번호 초기화
					account = "";
					// 예금주 name을 받는 출력
					System.out.print("예금주: ");
					// name에 입력값 담아주기
					user.setName(sc.next());
					
					while(true) {// 핸드폰 번호
						// 핸드폰번호 입력받기 전 출력
						System.out.print("핸드폰 번호['-' 제외]: ");
						// 핸드폰번호 입력 받기
						phoneNumber = sc.next();
						// 핸드폰번호를 replaceAll을 써서 "-" 제거 후 다시 담아준다.
						phoneNumber = phoneNumber.replaceAll("-", "");
						// 핸드폰번호의 길이가 11이라면
						if(phoneNumber.length() == 11) {
							// 핸드폰번호의 시작이 010 부터라면
							if(phoneNumber.startsWith("010")) {
								// 핸드폰 중복검사 메소드 사용한다.
								userCheck = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
								// 값이 null이라면 while문 탈출
								if(userCheck == null) {
									break;
								}
							}
						}
						// 핸드폰 번호 잘못입력시 출력 ex) 12314151....
						System.out.println("잘못된 핸드폰 번호입니다.");
					}
					// 입력받은 핸드폰번호를 유저 핸드폰번호에 set해준다.
					user.setPhoneNumber(phoneNumber);
					
					while(true) {// 비밀번호 
						// 비밀번호 입력 전 출력
						System.out.print("비밀번호[4자리]: ");
						// 비밀번호 입력받기
						password = sc.next();
						// 비밀번호가 4자리라면 while문 탈출
						if(password.length() == 4) {
							break;
						}
						// 4자리가 넘으면 오류메세지 출력
						System.out.println("비밀번호는 4자리로 설정해주세요.");
					}
					// 입력받은 비밀번호를 담아주기
					user.setPassword(password);
					// arrBank[][]에 user = arBank[index]에 담긴 정보를 담아준다.
					arrBank[index][arCount[index]] = user;
					// 추가후 arCount[index]의 값을 1 증가 시킨다. 
					arCount[index]++;
					System.out.println("환영합니다 " + user.getName() +" 고객님, 계좌개설이 완료되었습니다.");
					System.out.println("계좌번호: " + user.getAccount());
					continue;
					
				}else if(choice == 5) { // 계좌번호 찾기
					System.out.print("핸드폰 번호: ");
					phoneNumber = sc.next();
					
					user = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
					
					if(user != null) {
						System.out.print("비밀번호: ");
						password = sc.next();
						
						if(user.getPassword().equals(password)) {
							while(true) {
								for (int i = 0; i < ACCOUNT_LENGTH; i++) {
									account += random.nextInt(10);
								}
								userCheck = Bank.checkAccount(arrBank, arCount, account);
								if(userCheck == null) {break;}
							}
							System.out.println("새로운 계좌번호로 변경되었습니다.");
							System.out.println("계좌번호: " + account);
							user.setAccount(account);
						}
					}else {
						System.out.println("없는 핸드폰 번호입니다.");
					}
					continue;
				}
				
				System.out.print("계좌번호: ");
				account = sc.next();
				
				System.out.print("비밀번호: ");
				password = sc.next();
				
				user = Bank.bankCheck(arrBank, arCount, account, password, arBankName[index]);
				
				switch(choice) {
				case 2: // 입금하기 (계좌를 개설한 은행에서만 입금 가능, 은행이름도 받아서)
					
					if(user != null ) {
						System.out.print("입금액: ");
						money = sc.nextInt();
						if(money > 0) {
							user.deposit(money);
							System.out.println(money + "원 입금 완료");
						}else {
							System.out.println("입금액을 다시 확인해주세요.");
						}
					}else {
						System.out.println("은행을 확인하세요.");
					}
					break;
					
				case 3: // 출금하기
					if(user != null) {
						System.out.print("출금액: ");
						money = sc.nextInt();
						if(money > 0) {
							if(user.getMoney() >= (user instanceof Kookmin ? money * 1.5 : money)) {
								user.withdraw(money);
							}else {
								System.out.println("출금액을 다시 확인해주세요.");
							}
						}
					}else {
						System.out.println("로그인 실패");
					}
					break;
				case 4: // 잔액 조회
					if(user != null) {
						System.out.println("현재 잔액: " + user.showBalance());
					}else {
						System.out.println("로그인 실패");
					}
					break;
				}
			}
		}
	}
}













