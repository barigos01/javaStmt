package array;
/**
 * @file : MaxMinMain.java
 * @author eunji
 * @date 2016. 3. 14.
 * @story 배열의 최대값, 최소값 구하기
 */
public class MaxMinMain {
	public static void main(String[] args) {
		int[] arr= {100, 80, 60, 58, 76, 43, 88, 54, 63};
		MaxMin maxMin = new MaxMin();
		maxMin.setMaxMin(arr);
		
		System.out.println(maxMin.toString());
	}
}
