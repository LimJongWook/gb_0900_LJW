package collectionTask;

import java.util.Scanner;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserField userField = new UserField();
		User user = new User();

		String id = null, name = null, pw = null, phoneNumber = null, number = null, checkNumber = null,
				password = null;
		boolean flag1 = false, flag2 = false;
		int choice = 0;

		while (!flag2) {
			System.out.println("1.ȸ������ 2.�α��� 3.��й�ȣ ã�� 4.����");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				// ȸ������
				System.out.println("���̵� : ");
				id = sc.next();
				if (userField.idCheck(id)) {
					System.out.println("�ߺ��� ���̵� �Դϴ�.");
					continue;
				}

				System.out.println("��й�ȣ : ");
				pw = sc.next();

				System.out.println("�̸� :");
				name = sc.next();
				while (true) {
					System.out.println("�޴��� ��ȣ : ");
					phoneNumber = sc.next();
					if (userField.phoneNumberCheck(phoneNumber)) {
						System.out.println("�ߺ��� �ڵ��� ��ȣ�Դϴ�.");
					} else {
						break;
					}
				}
				userField.sign(name, id, pw, phoneNumber);
				for (int i = 0; i < userField.users.size(); i++) {
					if (i == 0) {
						System.out.println("=================");
					}
					System.out.println(userField.users.get(i).toString());
					System.out.println("=================");
				}
				break;

			// �α���
			case 2:
				System.out.println("���̵� : ");
				id = sc.next();
				System.out.println("��й�ȣ : ");
				pw = sc.next();
				// �α��� ���� ��
				if (userField.loginCheck(id, pw)) {
					user = userField.login(id, pw);
					System.out.println("�α��� ����");
					// �α��� �� �ݺ��� ����
					while (true) {
						System.out.println("1.��й�ȣ ���� 2. �α׾ƿ�");
						choice = sc.nextInt();
						if (choice == 1) {
							System.out.println("���� ��й�ȣ�� �Է����ּ���.");
							pw = sc.next();
							// ������ ��й�ȣ �Է� �ް� ����
							if (userField.pwCheck(user, pw)) {
								System.out.println("������ ��й�ȣ �Է����ּ���.");
								pw = sc.next();

								userField.pwChange(user, pw);

								System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
								System.out.println("�ٽ� �α��� ���ּ���.");
								flag1 = true;
							} else {
								System.out.println("���� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
							}
							// ����
						} else if (choice == 2) {
							break;
						}
						// ��й�ȣ ���� �� �ٽ� �α��� �ϱ� ���ؼ� while�� ������ ����
						if (flag1) {
							break;
						}
					}
				} else {
					System.out.println("�α��� ����");
				}
				break;
			case 3: // ��й�ȣ ã��
				System.out.println("���̵� �Է����ּ���.");
				id = sc.next();
				if (userField.idCheck(id)) {
					System.out.println("�ڵ��� ��ȣ�� �Է����ּ���.");
					phoneNumber = sc.next();
					checkNumber = userField.smsCheck(phoneNumber);
					System.out.println("������ ������ȣ�� �Է����ּ���.");
					number = sc.next();
					if (checkNumber.equals(number)) {
						password = userField.findPw(phoneNumber);
						System.out.println(password);
					}
				}
				break;
			case 4:
				System.out.println("�ý��� ����");
				flag2 = true;
				break;
			default:
				break;
			}
		}
	}
}
