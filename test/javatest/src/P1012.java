import java.util.*;
public class P1012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for (int i = 0; i < n; i++)
            s[i] = sc.next();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String s1 = s[i] + s[j];
                String s2 = s[j] + s[i];
                if ((s2.compareTo(s1)>0)) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) System.out.print(s[i]);
    }
}
