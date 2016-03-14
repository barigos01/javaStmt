package forloop;

import java.util.Scanner;

/**
 * @file : InputSum.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 1부터 입력된 수까지의 정수의 합 구하기
 * 10을 입력하면 콘솔에는 1부터 10까지의 합은 55입니다.
 */
public class InputSumMain {
	public static void main(String[] args) {
		System.out.println("1부터 입력된 수까지의 정수의 합 구하기");
		Scanner scanner = new Scanner(System.in);
		InputSum sum = new  InputSum();
		
		sum.setNum(scanner.nextInt());
		sum.setSum();
		
		System.out.println(sum.toString());
	}
}
