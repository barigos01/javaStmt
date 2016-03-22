package algoMath;

import java.util.Scanner;

/**
 * @file: PrimeSum.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 8.소수의 합
 */
public class PrimeSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력된 정수까지의 소수의 합을 구할 정수 입력");
		
		int A = scanner.nextInt(), i = A-1, J = 2, HAP = 0;
		
		while (J < A+1) {
			if (J <= i) {
				if ((A % J) != 0) {
					HAP += A;
				}
			} else {
				HAP += A;
			}
			
			J++;
		}
		
		System.out.println(A + "까지 소수들의 합: " + HAP);
	}

}
