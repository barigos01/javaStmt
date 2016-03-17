package product;

public class TV extends Product{
	protected String picture, screan;

	public void setTVInfo(String company, String name, String serialNo, String picture, String screan){
		super.setProductInfo(company, name, serialNo);
		this.picture = picture;
		this.screan = screan;
	}
	@Override
	public String display() {
		return "제조회사: " + super.company   
				+ "\n제품명: " + super.name
				+ "\n고유번호: " + super.serialNo
				+ "\n화소: " + this.picture
				+ "\n크기: " + this.screan;
	}

}
