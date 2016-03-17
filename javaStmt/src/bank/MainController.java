package bank;

import java.util.Scanner;

public class MainController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		AdminService admin = new AdminServiceImpl();
		BankService bank = new BankServiceImpl();
			
		System.out.println("[메뉴] 1.일반인 2.관리자");
		switch (s.nextInt()) {
		case 1:	
			while (true) {
				System.out.println("[메뉴] 1.계좌개설 2.목록 3.조회(계좌번호) 4.조회(이름) 5.계좌수 6.계좌해지 0.종료");
				
				switch (s.nextInt()) {
				case 1:
					System.out.println("이름, 비밀번호 입력");
					System.out.println(admin.openAccount(new AccountBean(s.next(), s.nextInt())));
					break;
				case 2:
					System.out.println(admin.getList());
					break;
				case 3:
					System.out.println("계좌번호 입력");
					System.out.println(admin.findAccountByAccountNo(s.nextInt()));
					break;
				case 4:
					System.out.println("이름 입력");
					System.out.println(admin.findAccountsByName(s.next()));
					break;
				case 5:
					System.out.println(admin.countAll() + "개");
					break;
				case 6:
					System.out.println("계좌번호 입력");
					System.out.println(admin.closeAccount(s.nextInt()));
					break;
				case 0:
					System.out.println("종료");
					return;

				default:
					System.out.println("잘못입력");
					return;
				}
			}
		case 2:	
			while (true) {
				System.out.println("[메뉴] 1.계좌개설 2.입금 3.출금 4.잔액조회 0.종료");
				
				switch (s.nextInt()) {
				case 1:	
					System.out.println("이름, 비밀번호 입력");
					System.out.println(bank.openAccount(new AccountBean(s.next(), s.nextInt()))); 
					break;
				case 2:	
					System.out.println("계좌번호, 입금액 입력");
					System.out.println(bank.deposit(s.nextInt(), s.nextInt())); 
					break;
					
				case 3:	
					System.out.println("계좌번호, 비밀번호, 출금액 입력");
					System.out.println(bank.withdraw(s.nextInt(), s.nextInt(), s.nextInt())); 
					break;
				case 4:
					System.out.println("계좌번호 입력");
					System.out.println(bank.findMoney(s.nextInt())); 
					break;
				case 0:	
					System.out.println("종료");
					return;
				default:
					System.out.println("잘못입력");
					return;
				}
			}
			
		default:
			System.out.println("잘못입력");
			return;
		}
		
		
	}
}
