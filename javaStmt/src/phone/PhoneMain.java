package phone;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=== 집전화기로 통화 ===");
		//usePhone(scanner);
		//useNokia(scanner);
		useIPhone(scanner);
		
	}

	public static void useIPhone(Scanner scanner) {
		IPhone iPhone = new IPhone();
		
		iPhone.setCompany("애플");
		System.out.println(iPhone.getCompany() + "를 사용");
		System.out.println("휴대폰으로 통화할 사람과 문자 전송");

		iPhone.setData(scanner.next(), scanner.next());
		System.out.println(iPhone.getCall());
	}

	public static void useNokia(Scanner scanner) {
		Phone nokia = new CelPhone();
		
		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany() + "를 사용");
		System.out.println("휴대폰으로 통화할 사람?");
		nokia.setCall(scanner.next());
		System.out.println(nokia.getCall());
	}

	public static void usePhone(Scanner scanner) {
		Phone phone = new Phone();
		phone.setCompany("삼성집전화기");
		System.out.println(phone.getCompany() + "를 사용합니다");
		System.out.println("통화할 사람?");
		phone.setCall(scanner.next());
		System.out.println(phone.getCall());
	}

}
