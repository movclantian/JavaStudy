package lanqiao;

import java.util.Scanner;

public class select {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b[] = new int[a];
		for (int i = 0; i < b.length; i++) {
			b[i] = scan.nextInt();
		}
		selectmethod(b, a);
		scan.close();
	}

	public static void selectmethod(int[] b, int a) {
		for (int i = 0; i < b.length-1; i++) {
			int min=i;
			
			for (int j=i; j < b.length; j++) {
				if (b[min] > b[j]) {
				min=j;
				}
			}
			int temp=b[i];
			b[i]=b[min];
			b[min]=temp;
		}
		for (int i = 0; i < b.length; i++) {
			if(i>0) {
			System.out.print(" ");
			}
			System.out.print(b[i]);
		}
	}
}
