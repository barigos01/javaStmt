package forloop;

import java.util.Scanner;

import sun.print.resources.serviceui;

/**
 * @file : PactorOf5.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 5의 배수의 개수와 합
 */
public class FactorOfMain {
	/**
	 * [결과]
	 * 1에서 100까지 정수까지
	 * 5 배수의 갯수는 20이고
	 * 5 배수의 합은 1050이다
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FactorOf5 f = new FactorOf5();
		
		System.out.println("리미트값 입력");
		f.setEndNum(scanner.nextInt());
		f.setSum(f.getEndNum());
		
		System.out.println(f.toString());
	}
}
