package mycollectionTask;

import java.util.Scanner;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserField userField = new UserField();
		User user = new User();

		String id = null, name = null, pw = null, phoneNumber = null, number = null, checkNumber = null,
				password = null;
		boolean flag1 = false, flag2 = false ,flag3 = false;
		int choice = 0;

		while (!flag2) {
			// 메뉴 메세지 
			System.out.println("1.회원가입 2.로그인 3.비밀번호 찾기 4.종료");
			// 번호 
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				// 회원가입
				System.out.println("아이디 : ");
				id = sc.next();
				// id가 중복이었을 때
				if (userField.idCheck(id).equals(id)) {
					System.out.println("중복된 아이디 입니다.");
					continue;
				}

				System.out.println("비밀번호 : ");
				pw = sc.next();

				System.out.println("이름 :");
				name = sc.next();
				while (true) {
					System.out.println("휴대폰 번호 : ");
					phoneNumber = sc.next();
					// 핸드폰번호 시작 010으로
					if(phoneNumber.startsWith("010")) {
						// 핸드폰 번호가 중복이었을 때
						if (userField.phoneNumberCheck(phoneNumber)) {
							System.out.println("중복된 핸드폰 번호입니다.");
						} else {
							break;
						}
					}else {
						System.out.println("핸드폰 번호는 010으로 시작해주세요.");
					}
				}
				// 회원가입 메소드
				userField.sign(name, id, pw, phoneNumber);
				for (int i = 0; i < userField.users.size(); i++) {
					if (i == 0) {
						System.out.println("=================");
					}
					System.out.println(userField.users.get(i).toString());
					System.out.println("=================");
				}
				break;

			// 로그인
			case 2:
				System.out.println("아이디 : ");
				id = sc.next();
				System.out.println("비밀번호 : ");
				pw = sc.next();
				// 로그인 성공 시
				if (userField.loginCheck(id, pw)) {
					user = userField.login(id, pw);
					System.out.println("로그인 성공");
					// 로그인 쪽 반복문 시작
					while (true) {
						System.out.println("1.비밀번호 변경 2. 로그아웃");
						choice = sc.nextInt();
						if (choice == 1) {
							System.out.println("현재 비밀번호를 입력해주세요.");
							pw = sc.next();
							// 현재 비밀번호가 입력된 비밀번호랑 같은지 확인하는 메소드
							if (userField.pwCheck(user, pw)) {
								System.out.println("변경할 비밀번호 입력해주세요.");
								pw = sc.next();
								// 변경할 비밀번호로 변경해주는 메소드
								userField.pwChange(user, pw);

								System.out.println("비밀번호 변경이 완료되었습니다.");
								System.out.println("다시 로그인 해주세요.");
								// 비밀번호 변경되면 로그인 하기전 페이지로 되돌아가기 위한 flag
								flag1 = true;
							} else { // 현재 비밀번호가 틀리면
								System.out.println("현재 비밀번호가 틀렸습니다.");
							}
							// 종료
						} else if (choice == 2) {
							break;
						}
						// 비밀번호 변경 후 다시 로그인 하기 위해서 while문 밖으로 나감
						if (flag1) {
							break;
						}
					}
				} else { // 로그인 실패 시 
					System.out.println("로그인 실패");
				}
				break;
			case 3: // 비밀번호 찾기
				System.out.println("아이디를 입력해주세요.");
				id = sc.next();
				// 비밀번호 찾기전 아이디가 있는 지 검사
				if (userField.idCheck(id).equals(id)) {
					while(true) {
						System.out.println("핸드폰 번호를 입력해주세요.");
						phoneNumber = sc.next();
						// 해당 아이디의 핸드폰번호와 일치하는 지 검사
						if(userField.phoneNumberCheck(phoneNumber,id)) {
							// 보낼 핸드폰 번호를 입력하고 sms로 쏴주는 메소드
							checkNumber = userField.smsCheck(phoneNumber);
							while(true) {
								System.out.println("받으신 인증번호를 입력해주세요.");
								number = sc.next();
								if (checkNumber.equals(number)) {
									password = userField.findPw(phoneNumber);
									System.out.println(password);
									flag3 = true;
								}else {
									System.out.println("인증번호가 틀렸습니다.");
								}
								if(flag3) {
									break;
								}
							}
						}else {
							System.out.println("해당 아이디의 핸드폰번호와 일치하지 않습니다.");
						}
						if(flag3) {
							break;
						}
					}
				}else {
					System.out.println("없는 아이디 입니다.");
				}
				break;
			case 4:
				System.out.println("시스템 종료");
				flag2 = true;
				break;
			default:
				break;
			}
		}
	}
}
