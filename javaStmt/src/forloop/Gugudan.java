package forloop;
/**
 * @file : Gugudan.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 2단부터 9단까지 구구단 출력
 * 단, 책받침 구구단으로 출력
 */
public class Gugudan {
	public static void main(String[] args) {
		System.out.println("2단부터 9단까지 구구단 출력. "
							+"단, 책받침 구구단으로 출력");
		int i=0, j=0, dan=0;
		
		for (i = 1; i < 10; i++) {
			for (j = 2; j < 6; j++) {
				dan = i * j;
				System.out.print(j+"*"+i+"="+dan+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for (i = 1; i < 10; i++) {
			for (j = 6; j < 10; j++) {
				dan = i * j;
				System.out.print(j+"*"+i+"="+dan+"\t");
			}
			System.out.println();
		}
		
	}	

}
