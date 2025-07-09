import java.util.Scanner;

public class P1044 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][] arr =new int[20][20];
		for(int i=0;i<=n;i++) {
			arr[i][0]=1;
		}
		for (int i = 1; i <=n ; i++) {
			for (int j = 1; j <=i ; j++) {
				if (i == j) {
					arr[i][j] = arr[i][j - 1];
				} else {
					arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
				}
			}
		}
		System.out.println(arr[n][n]);
	}

}