package variable;

import java.util.Scanner;

/**
 * @file : Tax.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 
 * 이름과 연봉을 입력받아서
 * 다음과 같은 결과물이 나오도록 출력하시오
 * 세율은 10%
 * [결과]
 * 연봉 ***원을 받으시는 **님께서
 * 이번달 납부할 세금은 *** 만원입니다.
 */
public class TaxMain {
	public static void main(String[] args) {
		System.out.println("이름과 연봉을 입력받아서 결과물이 나오도록 출력하시오. 세율은 10%");
		
		Scanner scanner = new Scanner(System.in);
		Tax tax = new Tax();
		
		tax.setName(scanner.next());
		tax.setMoney(scanner.nextInt());
		tax.setOutput();
		
		System.out.println(tax.toString());
	}
}
