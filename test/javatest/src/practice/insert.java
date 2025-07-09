package practice;
import java.util.*;
public class insert {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b[]=new int[a];
		for (int i = 0; i < b.length; i++) {
			b[i]=scan.nextInt();
		}
		insertmethod(b,a);
		scan.close();
		
	}

	public static void insertmethod(int b[], int a) {
		for (int i = 1; i < b.length; i++) {
			int v=b[i];
			int j=i-1;
			while (j>=0&&b[j]>v) {
				b[j+1]=b[j];
				j--;
			}
			b[j+1]=v;
		}
		for (int i = 0; i < b.length; i++) {
			if(i>0) {
			System.out.print(" ");
			}
			System.out.print(b[i]);
		}
	}

}
