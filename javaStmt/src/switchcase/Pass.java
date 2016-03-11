package switchcase;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @file : Pass.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 과목 점수를 입력하면 총점과 평균이 나오고
 * 이를 통해 합격 여부를 통지하는 프로그램(스위치케이스 처리)
 * [결과]
 * ******************************************************************
 * 학생		JAVA	JSP		SQL		SPRING	총점		평균		합격여부
 * ------------------------------------------------------------------
 * 홍길동		80		50		60		70		260		65		합격
 * ******************************************************************
 * 합격 여부는 60점 이상이면 합격
 */
public class Pass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, JAVA, JSP, SQL, SPRING의 점수 입력");
		String name = scanner.next(), result = "";
		int java=scanner.nextInt(), jsp=scanner.nextInt(), sql=scanner.nextInt(), spring=scanner.nextInt(), total=0, avg=0;
		
		total = java + jsp + sql + spring;
		avg = total / 4;
		
		switch () {
		case value: result="합격"; break;
		case value: result="불합격"; break;

		default:
			System.out.println("잘 못 입력하셨습니다.");
			return;
		}
		
		System.out.println("******************************************************************");
		System.out.println("이름\t JAVA\t JSP\t SQL\t SPRING\t 총점\t 평균\t 합격여부\t");
		System.out.println("------------------------------------------------------------------");
		System.out.println(name+"\t"+java+"\t"+jsp+"\t"+sql+"\t"+spring+"\t"+total+"\t"+avg+"\t"+result);
		System.out.println("******************************************************************");
	}
}
