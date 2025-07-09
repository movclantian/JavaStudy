import java.util.*;

public class P1088DFSpass {
    static int a[];
    static int v[] = new int[10086];
    static int n;
    static int m;
    static int count = 0;
    static int flag = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scan.nextInt();
        }
        dfs(1);
    }

    public static void dfs(int x) {
        if (flag == 1) {
            return;
        }
        if (x > n) {
            count++;
            if (count == m + 1) {
                flag = 1;
                for (int i = 1; i <= n; i++) {
                    System.out.printf(a[i] + " ");
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (count == 0) {
                i = a[x];
            }
            if (v[i] == 0) {
                v[i] = 1;
                a[x] = i;
                dfs(x + 1);
                v[i] = 0;
            }
        }
    }
}