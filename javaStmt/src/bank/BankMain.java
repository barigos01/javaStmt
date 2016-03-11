package bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		// 지역변수 영역
		Scanner scanner = new Scanner(System.in);
		AdminServiecImpl service = new AdminServiecImpl(100);
		BankServiecImpl bservice = new BankServiecImpl();
		
		// 연산영역
		System.out.println("이름, 비밀번호 입력");	
		System.out.println(service.openAccount(scanner.next(), scanner.nextInt()));
		
		System.out.println("조회");
		System.out.println(service.findAccountByAccountNo(scanner.nextInt()));
	}
}
