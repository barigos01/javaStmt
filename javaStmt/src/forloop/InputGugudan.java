package forloop;

import java.util.Scanner;

public class InputGugudan {
	private int num, dan;

	public int getDan() {
		return num;
	}

	public void setDan(int num) {
		if (num<=0) {
			System.out.println("1 이상 정수값만 입력하시오");
			return;		// 이 메소드를 종료시켜라
		}
		for (int i=1; i<10; i++){
			dan = num * i;
			System.out.println(num+"*"+i+"="+dan);
		}
		
/**		
		if (num<=0) {
			System.out.println("1 이상 정수값만 입력하시오");
		} else{
			for (i=1; i<10; i++){
				dan = num * i;
				System.out.println(num+"*"+i+"="+dan);
			}
		}
*/
		this.num = num;
	}

	@Override
	public String toString() {
		return "책받침 구구단 [입력값=" + num + "]";
	}
	
	
}
