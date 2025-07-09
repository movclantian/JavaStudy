package phoneManage;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Phone arr[] = new Phone[3];

		Phone p1 = new Phone("redmi", 1999, "白色");
		Phone p2 = new Phone("meizu", 2999, "蓝色");
		Phone p3 = new Phone("oppo", 3098, "黑色");

		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].getPrice();
		}

		System.out.println("总价格是"+sum+",平均价格是"+sum*1.0/arr.length);
	}

}
