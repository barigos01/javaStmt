package forloop;
/**
 * @file : PrintOneToTen.java
 * @author eunji
 * @date 2016. 3. 11.
 * @story 1부터 10까지 정수값 출력(가로 출력, \t 입력)
 */
public class PrintOneToTen {
	public static void main(String[] args) {
		System.out.println("1부터 10까지 정수값 출력(가로 출력, \t 입력)");
		
		for(int i=1; i<11; i++){
			System.out.print(i+"\t");
		}
	}
}
