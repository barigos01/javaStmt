package algoSeries;
/**
 * @file: Factorial.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 5.팩토리얼 수열
 */
public class Factorial {

	public static void main(String[] args) {
		int i = 1, j = 1, k = 1;
		
		while (i < 11) {
			j *= i;
			k += j;
			
			i++;
		}
		
		System.out.println(k);

	}

}
