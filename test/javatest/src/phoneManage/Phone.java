package phoneManage;

public class Phone {
	private String brand;
	private int price;
	private String color;
	public Phone() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Phone(String brand, int price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void print() {
		System.err.println(brand+"价格是"+price+",是"+color+"颜色");
	}
	
	
	
	
}
