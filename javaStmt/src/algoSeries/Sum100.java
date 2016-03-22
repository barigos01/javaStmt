package algoSeries;
/**
 * @file: Sum100.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 1.수열 1 ~ 100까지 합계
 */
public class Sum100 {

	public static void main(String[] args) {
		int i = 0, j = 0;
		
		while (i<101) {
			j += i;
			i++;
		}
		
		System.out.println("수열 1 ~ 100까지 합계: " + j);

	}

}
