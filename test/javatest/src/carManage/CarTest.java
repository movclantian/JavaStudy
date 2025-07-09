package carManage;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������?
		CarInfo[] arr = new CarInfo[3];

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			CarInfo c = new CarInfo();

			System.out.println("请输入品牌");
			String banrd = input.next();
			c.setBrand(banrd);

			System.out.println("请输入价格");
			int price = input.nextInt();
			c.setPrice(price);

			System.out.println("请输入颜色");
			String color = input.next();
			c.setColor(color);

			arr[i] = c;

		}

		for (CarInfo car : arr) {
			System.out.println(car);
		}

	}

}
