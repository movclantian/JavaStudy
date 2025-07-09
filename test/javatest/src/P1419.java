import java.util.*;
import java.util.LinkedList;

public class P1419 {
    static double[] a;
    static double[] sum;
    static int s;
    static int t;
    static int n;
    static double maxv = Integer.MIN_VALUE;
    static double minv = Integer.MAX_VALUE;

    public static boolean check(double mid) {
        sum[0] = 0;
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + a[i] - mid;
        }
        LinkedList<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i >= s) {
                while (!q.isEmpty() && sum[i - s] < sum[q.getLast()]) {
                    q.removeLast();
                }
                q.addLast(i - s);
            }
            if (!q.isEmpty() && q.getFirst() < i - t) {
                q.removeFirst();
            }
            if (!q.isEmpty() && sum[i] - sum[q.getFirst()] >= 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        s = scanner.nextInt();
        t = scanner.nextInt();
        a = new double[n + 1];
        sum = new double[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextDouble();
            maxv = Math.max(maxv, a[i]);
            minv = Math.min(minv, a[i]);
        }
        double left = minv;
        double right = maxv;
        while (right - left > 1e-4) {
            double mid = (right + left) / 2;
            if (check(mid)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        System.out.printf("%.3f", left);
    }
}