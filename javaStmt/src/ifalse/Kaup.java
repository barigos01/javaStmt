package ifalse;

public class Kaup {
	// 속성영역 : field
	private String name;
	private int kaup;
	private double height, weight;
	private String result;
	// kaup = (int) ((weight/(height*height))*10000);
	
	// Alt Shift S R
	
	// 기능영역 : area
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getKaup() {
		return kaup;
	}

	public void setKaup() {
		this.kaup = (int) ((weight/(height*height))*10000);
	}

	public String getResult() {
		return result;
	}

	public void setResult() {
		setKaup();					// this.setKaup(); this 생략 가능
		String temp = "";
		
		// 분기문 영역
		if(kaup>30) {
			temp = "비만";
		} else if(kaup>=24){
			temp = "과체중";
		} else if(kaup>=20){
			temp = "정상";
		} else if(kaup>=15){
			temp = "저체중";
		} else if(kaup>=13) {
			temp = "마름";
		} else if(kaup>=10) {
			temp = "영양실조";
		} else{
			temp = "소모증";
		}
		
		this.result = temp;
	}
	
	@Override
	public String toString() {
		return "Kaup 지수 [이름=" + name + ", 결과=" + result + "]";
	}
}
