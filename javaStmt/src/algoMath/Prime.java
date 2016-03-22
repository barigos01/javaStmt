package algoMath;

import java.util.Scanner;

/**
 * @file: Prime.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 7.소수 판별
 */
public class Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소수판별할 정수 입력");
		
		int A = scanner.nextInt(), i = A-1, J = 2;
		
		if (J <= i) {
			if ((A % J) == 0) {
				System.out.println(A + ": 소수가 아니다");
			} else {
				System.out.println(A + ": 소수다");
			}
		} else {
			System.out.println(A + ": 소수다");
		}
		
	}

}
