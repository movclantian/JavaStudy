package lanqiao;

import java.util.Scanner;

public class JinZhi {

	public static void main(String[] args) {

		StringBuilder s =new StringBuilder();
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();//要转换的数字

		int x=in.nextInt();//转x进制
		
		
		while(n>0) {
			s.append(n%x);
			n/=x;
		}
		s.reverse();
		System.out.println(s);
		in.close();
	}

}
