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
public class Tax {
	public static void main(String[] args) {
		System.out.println("이름과 연봉을 입력받아서 결과물이 나오도록 출력하시오. 세율은 10%");
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int money = 0;
		double tax = 0.1, output = 0.0;
		
		name = scanner.next();
		money = scanner.nextInt();
		
		output = (money * tax) / 12;
		
		System.out.println("연봉 "+money+"원을 받으시는 "+name+"님께서"
							+"이번달 납부할 세금은 "+output+" 만원입니다.");
	}
}
