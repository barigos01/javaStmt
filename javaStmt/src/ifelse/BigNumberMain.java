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

class BigNumber{
	
	// public BigNumber() {}
	
	public int getBigNumber(int a, int b, int c){
		int big = 0;
		
		if(a>b || a>c){
			big = a;
		} else if(b>c){
			big = b;
		} else{
			big = c;
		}
		
/*		if (a>b) {
			if (a>c) {
				big = a;
			} else{
				big = c;
			}
		} else {
			if(b>c){
				big = b;
			} else{
				big = c;
			}
			
		}*/
		
		return big;
	}
}
