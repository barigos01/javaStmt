package algoSeries;
/**
 * @file: Fraction.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 3.분수 수열
 */
public class Fraction {

	public static void main(String[] args) {
		int i = 1, J = 0;
		
		while (i < 101) {
			if ((i % 2) == 1) {
				J += -(i / i+1);
			} 
			if ((i % 2) == 0) {
				J += i / i+1;
			}
			
			i++;
		}
		
		System.out.println(J);
	}

}
