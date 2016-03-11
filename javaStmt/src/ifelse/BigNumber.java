package ifelse;

import java.util.Scanner;

/**
 * @file : BigNumber.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 입력된 3개 숫자에서 가장 큰 수
 */
public class BigNumber {
	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt(), b=scanner.nextInt(), c=scanner.nextInt();
		int big=0;
		
		if (a>b) {
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
			
		}
		
		System.out.println("가장 큰 수는 "+big+"입니다.");
		
	}
}
