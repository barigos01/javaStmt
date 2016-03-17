package product;

public class ProductMain {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.setTVInfo("LG", "TV", "LG1234", "1000만화소", "IPS");
		
		Computer computer = new Computer();
		computer.setComputerInfo("삼성", "컴퓨터", "SM1234", "512GH", "8G", "1TB");
		
		SmartPhone phone = new SmartPhone();
		phone.setSmartPhoneInfo("삼성", "갤럭시", "GAL1234", "1000만화소", "6인치");
		
		// List<Product> list = new ArrayList<Product>();	Deep Copy
		Product[] cart = new Product[3];
		cart[0] = tv;
		cart[1] = computer;
		cart[2] = phone;
		
		for (Product product : cart) {
			System.out.println(product.display());
		}
		
		
	}
}
