package ifelse;

import java.util.Scanner;

/**
 * @file : TimeCalc.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 초를 입력하면 시간, 분, 초를 출력하는 프로그램
 * 10000초를 입력하면 7시간 47분 13초로 출력
 * 60초가 1분
 * 3600초가 1시간
 */
public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력");
		int second = scanner.nextInt(), minute = 0, hour = 0;
		
		if (second > 3600) {
			hour = second / 3600;
			minute = (second / 60) % 60 ;
			second = second % 60;
		} else if (second <= 3600) {
			hour = second / 3600;
			minute = (second / 60) % 60 ;
			second = second % 60;
		} else{
			System.out.println("잘 못 입력");
			return;
		}
		
		System.out.println(hour+"시간 "+minute+"분 "+second+"초");
		
	}
}
