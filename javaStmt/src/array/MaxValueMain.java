package array;
/**
 * @file : MaxValue.java
 * @author eunji
 * @date 2016. 3. 14.
 * @story 배열의 요소 중 가장 큰 값 출력
 */
import java.util.Scanner;

public class MaxValueMain {
	public static void main(String[] args) {
		int[] arr = {32, 26, 76, 44, 66, 30};
		MaxValue mv = new MaxValue();

		System.out.println("배열 중에서 가장 큰 값은 "+mv.getMax(arr)+"입니다.");
				
	}
}

