import java.util.*;

public class P1957 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            String[] s = new String[3];
            s[0] = scan.next();
            if (s[0].equals("a")) {
                flag = 1;
                s[1] = scan.next();
                s[2] = scan.next();
                System.out.println(s[1] + "+" + s[2] + "=" + (Integer.parseInt(s[1]) + Integer.parseInt(s[2])));
                StringBuilder sb = new StringBuilder();
                for (String str : s) {
                    sb.append(str); // 或者使用其他分隔符
                }
                sb.append((Integer.parseInt(s[1]) + Integer.parseInt(s[2])));
                System.out.println(sb.length() - 1 + 2);
                continue;
            }
            if (s[0].equals("b")) {
                flag = 2;
                s[1] = scan.next();
                s[2] = scan.next();
                System.out.println(s[1] + "-" + s[2] + "=" + (Integer.parseInt(s[1]) - Integer.parseInt(s[2])));
                StringBuilder sb = new StringBuilder();
                for (String str : s) {
                    sb.append(str); // 或者使用其他分隔符
                }
                sb.append((Integer.parseInt(s[1]) - Integer.parseInt(s[2])));
                System.out.println(sb.length() - 1 + 2);
                continue;
            }
            if (s[0].equals("c")) {
                flag = 3;
                s[1] = scan.next();
                s[2] = scan.next();
                System.out.println(s[1] + "*" + s[2] + "=" + (Integer.parseInt(s[1]) * Integer.parseInt(s[2])));
                StringBuilder sb = new StringBuilder();
                for (String str : s) {
                    sb.append(str); // 或者使用其他分隔符
                }
                sb.append((Integer.parseInt(s[1]) * Integer.parseInt(s[2])));
                System.out.println(sb.length() - 1 + 2);
                continue;
            }
            if (flag == 1) {
                s[1] = scan.next();
                System.out.println(s[0] + "+" + s[1] + "=" + (Integer.parseInt(s[0]) + Integer.parseInt(s[1])));
                StringBuilder sb = new StringBuilder();
                for (String str : s) {
                    sb.append(str); // 或者使用其他分隔符
                }
                sb.append((Integer.parseInt(s[1]) + Integer.parseInt(s[0])));
                System.out.println(sb.length() + 2-4);
                continue;
            }
            if (flag == 2) {
                s[1] = scan.next();
                System.out.println(s[0] + "-" + s[1] + "=" + (Integer.parseInt(s[0]) - Integer.parseInt(s[1])));
                StringBuilder sb = new StringBuilder();
                for (String str : s) {
                    sb.append(str); // 或者使用其他分隔符
                }
                sb.append((Integer.parseInt(s[0]) - Integer.parseInt(s[1])));
                System.out.println(sb.length() + 2-4);
                continue;
            }
            if (flag == 3) {
                s[1] = scan.next();
                System.out.println(s[0] + "*" + s[1] + "=" + (Integer.parseInt(s[0]) * Integer.parseInt(s[1])));
                StringBuilder sb = new StringBuilder();
                for (String str : s) {
                    sb.append(str); // 或者使用其他分隔符
                }
                sb.append((Integer.parseInt(s[1]) * Integer.parseInt(s[0])));
                System.out.println(sb.length() + 2-4);
                continue;
            }
        }
    }
}