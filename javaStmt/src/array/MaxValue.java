package array;
/**
 * @file : MaxValue.java
 * @author eunji
 * @date 2016. 3. 14.
 * @story 배열의 요소 중 가장 큰 값 출력
 */

public class MaxValue{
	int max;
	
	public int getMax(int[] arr) {
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}
