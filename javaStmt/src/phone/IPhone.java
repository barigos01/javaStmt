package phone;

public class IPhone extends CelPhone{
	private String data;	
	public static String BRAND = "아이폰";	// static 바뀌지 않음
	public static boolean TRUE = true;		// 아이폰은 집전화기를 생산하지 않는다.
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	// 오버로딩
	public void setData(String data, String name) {
		this.data = data;
		super.
	}

}
