package whileloop;

import java.util.Scanner;

public class TrinomialMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Trinomial trinomial = new Trinomial();
		
		System.out.println("이름, 국어, 영어, 수학 점수 입력");
		trinomial.setName(scanner.next());
		trinomial.setScore(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		
		trinomial.setAvg(trinomial.getScore());
		trinomial.setResult(trinomial.getAvg());
		
		System.out.println(trinomial.toString());
		
	}
}
