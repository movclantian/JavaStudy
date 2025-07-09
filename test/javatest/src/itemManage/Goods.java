package itemManage;

public class Goods {
	private String id;
	private String name;
	private double price;
	private int count;

	public Goods() {
		super();

	}

	public Goods(String id, String name, double price, int count) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPirce() {
		return price;
	}

	public void setPirce(double price) {
		this.price = price;
	}

	public int getConut() {
		return count;
	}

	public void setConut(int count) {
		this.count = count;
	}

	public void print() {
		System.out.println(id + ":" + name + "|" + price + "|" + count);
	}

}
