package ifalse;

import java.util.Scanner;

import javax.xml.transform.Source;

/**
 * @file : Kaup.java
 * @author eunji
 * @date 2016. 3. 10.
 * @story 카우푸 지수 구하기
 * 몸무게를 키의 제곱으로 구한 후 10000을 곱하면 지수가 생성된다.
 * 이를 카우푸 지수라고 한다.
 * 카우푸 지수
 * 30 초과면 비만
 * 24 이상이면 과체중
 * 20 이상이면 정상
 * 15 이상이면 저체중
 * 13 이상이면 마름
 * 10 이상이면 영양실조
 * 10 이하면 소모증 으로 판별된다.
 * 이름과 키와 몸무게를 입력하면
 * 홍길동님은 비만입니다. 라고 출력하는 프로그램을 작성하시오
 */
public class KaupMain {
	public static void main(String[] args) {
		// 지역변수 영역
		int kaup=0;
		double weight=0.0, height=0.0;
		String result="", name="";								// "" 리터럴이라고 명명하겠음.
		
		System.out.println("이름, 키, 몸무게 입력");
		Kaup k = new Kaup();
		Scanner scanner = new Scanner(System.in);
		k.setName(scanner.next());
		k.setWeight(scanner.nextInt());
		k.setHeight(scanner.nextInt());	
		k.setKaup();

		result = k.getResult();
		
		System.out.println(k.getName() + "님은 " + result + "입니다.");
	}
	
}