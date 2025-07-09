package moneyZH;
import java.util.Scanner;
public class Moneytest {
	public static void main(String[] args) {
		int money = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("请输入金额:");
			money = in.nextInt();
			if (money >= 0 && money <= 9999999) {
				break;
			} else {
				System.out.println("输入有误");
			}
		}
		String moneySt = "";
		while (true) {
			int ge = money % 10;
			String getZH=getCapital(ge);
			moneySt=getZH+moneySt;
			
			money /= 10;
			if (money == 0) {
				break;
			}
		}
		int count=7-moneySt.length();
		for (int i = 0; i < count; i++) {
			moneySt="零"+moneySt;
		}
		String ret="";
		String arr[] = { "佰", "拾", "万", "仟", "佰", "拾", "元"};
		for (int i = 0; i < moneySt.length(); i++) {
			char c=moneySt.charAt(i);
//			System.out.print(c);
//			System.out.print(arr[i]);
			ret=ret+c+arr[i];
		}
		System.out.println(ret);
		in.close();
	}
	public static String getCapital(int number) {
		String arr[] = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
		return arr[number];
	}
}
