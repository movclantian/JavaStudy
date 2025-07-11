package lanqiao;

import java.util.Scanner;

public class bubble {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b[] = new int[a];
		for (int i = 0; i < b.length; i++) {
			b[i] = scan.nextInt();
		}
		bubblemethod(b, a);
		
		scan.close();

	}

	public static void bubblemethod(int[] b, int a) {
		for (int i = 1; i < b.length; i++) {
			for (int j = 0; j < b.length - i; j++) {
				if (b[j] > b[j + 1]) {
					int temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			if(i>0) {
			System.out.print(" ");
			}
			System.out.print(b[i]);
		}

	}
}
