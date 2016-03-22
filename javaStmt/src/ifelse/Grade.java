package ifelse;

public class Grade {
	String name;
	String ssm;
	char flag;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSsm() {
		return ssm;
	}
	
	public void setSsm(String ssm) {
		this.ssm = ssm;
	}
	
	public char getFlag() {
		return flag;
	}
	
	public void setFlag(String name, String ssm) {
		String result = "";
		
		flag = ssm.charAt(7);
		
		if (flag == '1' || flag == '3') {
			result = "남자";
		} else if (flag == '2' || flag == '4') {
			result = "여자";
		} else if (flag == '5' || flag == '6') {
			result = "외국인";
		} else{
			result = "잘못된 주민번호";
		}
		
		this.name = name;
		this.ssm = ssm;
	}
	
}
