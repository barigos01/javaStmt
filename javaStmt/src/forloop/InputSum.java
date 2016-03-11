package forloop;

import java.util.Scanner;

/**
 * @file : InputSum.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 1부터 입력된 수까지의 정수의 합 구하기
 * 10을 입력하면 콘솔에는 1부터 10까지의 합은 55입니다.
 */
public class InputSum {
	public static void main(String[] args) {
		System.out.println("1부터 입력된 수까지의 정수의 합 구하기");
		Scanner scanner = new Scanner(System.in);
		int i=0, num = 0, sum=0;
		num = scanner.nextInt();
		
		for(i=1; i<num+1; i++){
			sum += i;
		}
		
		System.out.println(num+"을 입력하면 1부터 "
							+num+"까지의 합은 "+sum+"입니다.");
	}
}
