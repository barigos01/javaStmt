package whileloop;

import java.util.Scanner;

/**
 * @file : NumGolfMain.java
 * @author eunji
 * @date 2016. 3. 10.
 * @story 컴퓨터가 랜덤 생성한 숫자를 가장 빠른 횟수로 맞추는 게임
 */
public class NumGolfMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumGolfBean bean = new NumGolfBean();
		
		System.out.println("컴퓨터 랜덤 수 발생");
		bean.setCom();
		System.out.println("1부터 10까지 입력");
		bean.setPlayer(scanner.nextInt());
		
		while(true){
			bean.setCount();
			if (bean.getCom() == bean.getPlayer()) {
				System.out.println("일치");
				System.out.println(bean.getCount());
				bean.setFlag(true);
				break;
			} else{
				System.out.println("불일치");
				System.out.println(bean.getCount());
			}
			
		}

	}
}
