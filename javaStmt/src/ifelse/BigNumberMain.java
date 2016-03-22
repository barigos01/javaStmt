package ifelse;

import java.util.Scanner;

/**
 * @file : BigNumber.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 입력된 3개 숫자에서 가장 큰 수
 */
public class BigNumberMain {
	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		BigNumber big = new BigNumber();
		
		System.out.println("가장 큰 수는 "
							+ big.getBigNumber(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
							+ "입니다.");
	}
}
