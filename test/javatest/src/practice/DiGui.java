package practice;
import java.util.*;
public class DiGui {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(f(n));
		scan.close();
	}

	public static long f(int n) {
		if(n==1||n==2) {
			return 1;
		}
		long res=f(n-1)+f(n-2);
		res%=(long)1e9+7;
		return res;
	
}
} 
