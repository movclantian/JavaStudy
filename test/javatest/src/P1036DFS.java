import java.util.*;

public class P1036DFS {
    static int k;
    static int count;
    static int n;
    static int a[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[100];
        k = sc.nextInt();
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }
        count = 0;
        dfs(0,0,0);
        System.out.println(count);
    }

    public static void dfs(int now, int sum, int sid) {
        if (now == k) {
            if (isprime(sum))
                ++count;
            return;
        }
        for (int i = sid; i <= n - k + now ; ++i)
            dfs(now + 1, sum + a[i], i + 1);
    }
    public static boolean isprime(int n) {
        if (n == 1) {
            return false;
        }
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}