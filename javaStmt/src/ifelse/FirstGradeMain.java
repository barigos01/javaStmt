package ifelse;

import java.util.Scanner;

/**
 * @file : FirstGrade.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 3명의 학생 이름과 점수를 받아서 1등을 출력하는 프로그램
 */
public class FirstGradeMain {
	public static void main(String[] args) {
		System.out.println("3명의 이름과 점수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		FirstGrade fg = new FirstGrade();
		
		fg.setScore(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt());

		System.out.println("1등은 "+ fg.name +", "+ fg.score +"점입니다.");		
	}
}
