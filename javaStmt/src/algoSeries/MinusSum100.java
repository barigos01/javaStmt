package algoSeries;
/**
 * @file: MinusSum100.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 2. 1-2+3-4+5...-100의 합계
 */
public class MinusSum100 {

	public static void main(String[] args) {
		int i = 0, j = 0, SW = 0;
		
		while (i < 101) {
			SW = i % 2;
			
			if (SW == 0) {
				j -= i;
			} 
			
			if (SW == 1) {
				j += i;
			}
			
			i++;
		}
		
		System.out.println(j);
	}

}
