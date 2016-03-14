package forloop;

import java.util.Scanner;

/**
 * @file : MaxIn.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 최고점, 최저점 구하기
 * [결과]
 * 학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다.
 * 단, 정원은 5명입니다. (배열사용)
 * 평균 점수를 입력하세요.
 * 최고점은 100점이고
 * 최저점은 30점입니다.
 */
public class MaxInMain {
	public static void main(String[] args) {
		System.out.println("학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다. "
							+"단, 정원은 5명입니다."
							+"평균 점수를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		MaxIn max = new MaxIn();
		int[] num = new int[5];
		
		for (int i = 0; i < 5; i++) {
			num[i] = scanner.nextInt();
		}
		
		max.setArr(num);
		System.out.println(max.toString());
	}
}
