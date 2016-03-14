package forloop;

public class FactorOf5 {
	int endNum, sum, count;

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int endNum) {
		count = -1;
		
		for (int i = 0; i <= endNum; i++) {
			if (i%5 == 0) {
				sum += i;
				count++;
			}
		}
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "5의 배수 [입력값=" + endNum + ", 합=" + sum + ", 개수=" + count + "]";
	}
	
	
}
