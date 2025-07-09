package itemManage;

public class GoodTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Goods[] arr = new Goods[3];
		Goods g1 = new Goods("001", "mate40", 5999, 100);
		Goods g2 = new Goods("002", "iqoo12", 4999, 80);
		Goods g3 = new Goods("003", "oneplus13", 3999, 60);

		arr[0] = g1;
		arr[1] = g2;
		arr[2] = g3;

		for (Goods item : arr) {
			item.print();
		}

	}

}
