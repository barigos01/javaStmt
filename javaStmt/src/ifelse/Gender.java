package ifelse;

import java.util.Scanner;
/**
 * @file : Gender.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 주민번호를 가지고 성별 판별하는 로직
 */
public class Gender {
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		System.out.println("주민번호를 입력하세요.");
		String name = scanner.next(), ssn = scanner.next(), result = "";
		char flag = ssn.charAt(7);	
		/**
		 * 800101-1234567 일때
		 * charAt(인덱스값)은 해당 인덱스에 해당하는 한 글자를 반환
		 * 단, 인덱스는 0부터 시작함
		 * 1, 3이면 남자 if(flag=1 || flag=3)
		 * 2, 4이면 여자
		 * 5, 6이면 외국인
		 * 다른 값이면 잘못된 주민번호입니다.
		*/
		
		if (flag == '1' || flag == '3') {
			result = "남자";
		} else if (flag == '2' || flag == '4') {
			result = "여자";
		} else if (flag == '5' || flag == '6') {
			result = "외국인";
		} else{
			result = "잘못된 주민번호";
		}
		
		System.out.println(name+"은 "+result+"입니다.");
		
		
	}
}
