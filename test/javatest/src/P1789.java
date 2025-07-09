import java.util.Scanner;

public class P1789 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] a = new int[n+4][n+4];
        int m = scan.nextInt();
        int k = scan.nextInt();
        for (int i = 0; i < m; i++) {
            int x = scan.nextInt()+1;
            int y = scan.nextInt()+1;
            for (int j = x - 2; j <= x + 2; j++) {
                a[j][y] = 1;
            }
            for (int j = y - 2; j <= y + 2; j++) {
                a[x][j] = 1;
            }
            a[x - 1][y - 1] = 1;
            a[x - 1][y + 1] = 1;
            a[x + 1][y - 1] = 1;
            a[x + 1][y + 1] = 1;
        }
        for (int i = 0; i < k; i++) {
            int x = scan.nextInt()+1;
            int y = scan.nextInt()+1;
            for (int j = x - 2; j <= x + 2; j++) {
                for (int l = y - 2; l <= y + 2; l++) {
                    a[j][l] = 1;
                }
            }
        }

        int ans = 0;
        for (int i = 2; i <= n + 1; i++) {
            for (int j = 2; j <= n + 1; j++) {
                if (a[i][j] == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}