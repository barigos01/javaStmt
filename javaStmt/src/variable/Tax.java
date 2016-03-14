package variable;

public class Tax {
	private String name;
	private int money, output;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getOutput() {
		return output;
	}
	public void setOutput() {
		double tax = 0.1;
		this.output = (int) ((money * tax) / 12);
	}
	
	@Override
	public String toString() {
		return "이번달 세금 [이름=" + name + ", 연봉=" + money + "만원, 세금=" + output + "만원]";
	}
	
}
