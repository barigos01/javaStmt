package forloop;

import java.util.Scanner;

import sun.print.resources.serviceui;

/**
 * @file : PactorOf5.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 5의 배수의 개수와 합
 */
public class PactorOf5 {
	/**
	 * [결과]
	 * 1에서 100까지 정수까지
	 * 5 배수의 갯수는 20이고
	 * 5 배수의 합은 1050이다
	 * */
	public static void main(String[] args) {
		int endNum = 0, count = 0, sum=0, i=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("리미트값 입력");
		endNum = scanner.nextInt();
		
		for (i = 0; i < endNum; i++) {
			if (i%5 == 0) {
				sum += i;
				count++;
			}
		}
		
		System.out.println("1에서 "+endNum+"까지 정수까지,"
				+" 5 배수의 갯수는 "+count+"이고"
				+" 5 배수의 합은 "+sum+"이다.");
	}
}
