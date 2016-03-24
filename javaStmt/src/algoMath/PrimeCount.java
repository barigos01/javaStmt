package algoMath;
/**
 * @file: PrimeCount.java
 * @author: eunji
 * @date: 2016. 3. 18.
 * @story 9.소수의 개수 구하기
 */
public class PrimeCount {

	public static void main(String[] args) {
		int[] A = new int[99];
		int K = 1, i = 0, J = 0, M = 0;
		
		while (K >= 100) {
			K = K+1;
			A[K-1] += K;
			
			i = i+1;
			
			if (i > 99) {
				if (A[i] == 0) {
					J++;
					M = i;
				}
			} else {

			}
			
			K++;
		}

	}

}
