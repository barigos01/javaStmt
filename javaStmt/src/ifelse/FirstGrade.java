package ifelse;

import java.util.Scanner;

/**
 * @file : FirstGrade.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 3명의 학생 이름과 점수를 받아서 1등을 출력하는 프로그램
 */
public class FirstGrade {
	public static void main(String[] args) {
		System.out.println("3명의 이름과 점수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		String aName=scanner.next(), name="";
		int aScore=scanner.nextInt(), score=0;
		String bName=scanner.next();
		int bScore=scanner.nextInt();
		String cName=scanner.next();
		int cScore=scanner.nextInt();
		
		if (aScore>bScore) {
			if (aScore>cScore) {
				score = aScore;
				name = aName;
			} else {
				score = cScore;
				name = cName;
			}
		} else {
			if (bScore>cScore) {
				score = bScore;
				name = bName;
			} else {
				score = cScore;
				name = cName;
			}
		}
		
		System.out.println("1등은 "+name+", "+score+"점입니다.");
		
	}
}
