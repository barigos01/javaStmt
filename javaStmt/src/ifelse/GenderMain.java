package ifelse;

import java.util.Scanner;
/**
 * @file : Gender.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 주민번호를 가지고 성별 판별하는 로직
 * 800101-1234567 일때
 * charAt(인덱스값)은 해당 인덱스에 해당하는 한 글자를 반환
 * 단, 인덱스는 0부터 시작함
 * 1, 3이면 남자 if(flag=1 || flag=3)
 * 2, 4이면 여자
 * 5, 6이면 외국인
 * 다른 값이면 잘못된 주민번호입니다.
 */
public class GenderMain {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		Grade grade = new Grade();
		System.out.println("이름과 주민번호를 입력하세요.");
		
		grade.setFlag(scanner.next(), scanner.next());

		System.out.println(grade.getName() + "은 "+ grade.getFlag() + "입니다.");

	}
}
