import java.util.Scanner;

public class P10905LQB2024C {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            while (n-- > 0) {
                check(scan.next());
            }
        }
    }

    public static void check(String s) {
//        if (isPalindrome(s)) {
//            System.out.println("Yes");
//            return;
//        }
        // 若最后一个字符不属于特殊字符则直接输出 No
//        if (!isSpecial(s.charAt(s.length() - 1))) {
//            System.out.println("No");
//            return;
//        }
//        StringBuilder sb = new StringBuilder();
//         从字符串末尾提取连续的特殊字符
//         这里不行,入lclqb   bql+lclqb==bqllclqb
//         这里不行,入lclqb   bql+lclqb==bqllclqb
//         这里不行,入lclqb   bql+lclqb==bqllclqb
//        for (int i = s.length() - 1; i >= 0; i--) {
//            char c = s.charAt(i);
//            if (isSpecial(c)) {
//                sb.append(c);
//            } else {
//                break;
//            }
//        }
//        // 将提取的前缀与原字符串拼接
//        sb.append(s);
//        System.out.println(isPalindrome(sb.toString()) ? "Yes" : "No");
        // 统计末尾连续 allowed 字符（l, q, b）的数量
//        int m = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            char c = s.charAt(i);
//            if (c == 'l' || c == 'q' || c == 'b') {
//                m++;
//            } else {
//                break;
//            }
//        }
//        // 若末尾没有 allowed 字符，则无法构成回文
//        if (m == 0) {
//            System.out.println("No");
//            return;
//        }
//        // 枚举删除 1 到 m 个 allowed 字符，判断剩余部分是否为回文
//        for (int k = m; k >=0; k--) {
//            if (isPalindrome(s.substring(0, s.length()-m))) {
//                System.out.println("Yes");
//                return;
//            }
//        }
//        System.out.println("No");////以上代码会超时
        // 右指针处理：跳过末尾可添加字符
        int p2 = s.length();
        while (p2 > 0 && isSpecial(s.charAt(p2 - 1))) {
            p2--;
        }
        // 左指针处理：统计开头已存在的可添加字符
        int p1 = 0;
        while (p1 < s.length() && isSpecial(s.charAt(p1))) {
            p1++;
        }
        boolean flag = true;
        if (!isPalindrome(s, p1, p2 )) {
            flag = false;
        }
        if (flag) {
            int remain = s.length() - p2;
            if (p1 > remain) {
                flag = false;
            } else {
                for (int i = 0; i < p1; i++) {
                    if (s.charAt(p1 - 1 - i) != s.charAt(p2 + i)) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        System.out.println(flag ? "Yes" : "No");
    }

    public static boolean isPalindrome(String s, int p1, int p2) {
        int left = p1, right = p2 - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isSpecial(char c) {
        return c == 'l' || c == 'q' || c == 'b';
    }
}
