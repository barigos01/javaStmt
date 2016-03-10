package bank;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름과 비밀번호를 입력");
		AccountBean bean = new AccountBean(scanner.next(), scanner.nextInt());
		
		System.out.println(bean.toString());
		
	}
}
