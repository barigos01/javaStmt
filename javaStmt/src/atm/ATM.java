package atm;

public class ATM {
	public synchronized void inchul(String name){
		System.out.println(name + "님이 인출요청");
		
		for (int i = 0; i < 10000000; i++) {
			if (i == 100000) {
				System.out.println(name + "님이 현금을 인출 중...");
			}
		}
		
		System.out.println(name + "님 인출완료");
	}
}
