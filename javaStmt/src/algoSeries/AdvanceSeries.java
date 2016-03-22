package algoSeries;
/**
 * @file: AdvanceSeries.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 4. 1+2+4+7+11+16+... 로 증가하는 수열
 */
public class AdvanceSeries {

	public static void main(String[] args) {
		int i = 0, j = 0, k = 0;
		
		while (i < 21) {
			k += i + j;
			i++;
			j++;
		}
		
		System.out.println(k);

	}

}
