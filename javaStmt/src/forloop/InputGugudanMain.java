package forloop;

import java.util.Scanner;

/**
 * @file : InputGugudan.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 입력받은 정수의 구구단 구하기
 * 예를 들면 2를 입력하면 2단 출력
 * 109을 입력하면 109*2 ~ 109*9까지 출력
 * 다만, 0과 음수를 입력하면 '1 이상 정수값만 입력하시오'라고 출력
 */
public class InputGugudanMain {
	public static void main(String[] args) {
		System.out.println("입력받은 정수의 구구단 구하기 > 정수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		InputGugudan gugudan = new InputGugudan();
		
		gugudan.setDan(scanner.nextInt());
	}
}
