package forloop;

public class InputSum {
	private int num, sum;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getSum() {
		return sum;
	}

	public void setSum() {
		for(int i=1; i<=num; i++){
			sum += i;
		}
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "InputSum [입력값=" + num + ", 합=" + sum + "]";
	}
}
