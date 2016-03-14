package ifelse;

import java.util.Scanner;

/**
 * @file : LeapYear.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 윤년 프로그램
 * 연도를 4로 나눈 값이 0이라면 윤년일 수 있다.
 * 그러나 해당 년도가 100으로 나눠 떨어지면 평년이다.
 * 그 중 100으로 나눠 떨어지더라도 400으로 나눠 떨어지면 윤년이다.
 * 예를 들면 1000년은 평년, 2000년은 윤년, 2016년은 윤년입니다.
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("판별하려는 년도를 입력");
		int year = scanner.nextInt();
		String yearStr = "";
		
		yearStr = ((year % 4 == 0) || (year % 400 == 0)) ? "윤년" : "평년";
		
		/*
		if (year % 4 == 0) {
			if (year % 100 == 0) {		// 100으로 나눠 떨어진다
				if (year % 400 == 0) {
					yearStr = "윤년";
				} else {
					yearStr = "평년";
				}	
			} else {
				yearStr = "윤년";
			}
		} else {
				yearStr = "평년";
		}
		*/
		System.out.println(year+"는 "+yearStr+" 입니다.");
	}
}
