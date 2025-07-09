import java.util.*;

public class P1678pass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        long count = 0;
        int[] a = new int[m];
        int[] b = new int[n];
        for (int i = 0; i < m; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scan.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            int score = b[i];
            int l = 0;
            int r = m - 1;
            while (l < r) {
                int mid = (l + r) >> 1;
                if (score > a[mid]) {
                    l = mid + 1;
                } else if (score <=a[mid]) {
                    r = mid;
                }
            }
            if (score <= a[0]) {
                count += a[0] - score;
            } else if (score >= a[m - 1]) {
                count += score - a[m - 1];
            } else {
                count += Math.min(Math.abs(a[l] - score), Math.abs(a[l - 1] - score));
            }
        }
        System.out.println(count);
    }
}
