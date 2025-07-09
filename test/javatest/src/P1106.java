import java.util.*;

public class P1106 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.next() + "");
        int n = scan.nextInt();
        if (n <= 0) {
            return;
        }
        int j = 0;
        for (int k = 0; k < n; k++) {
            for (j = 0; j < sb.length() - 1 && sb.charAt(j) <= sb.charAt(j + 1); j++) {
            }
            sb.deleteCharAt(j);
        }
        if (sb.length() == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(Integer.parseInt(sb.toString()));
    }
}
