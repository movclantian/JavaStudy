import java.util.*;

public class P3741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        @SuppressWarnings("unused")
        int n = sc.nextInt();
        sc.nextLine(); // 忽略换行符
        String s = sc.nextLine();
        int ans = 0;
        StringBuilder a = new StringBuilder(s); // 假设这是你的字符串
        for (int i = 0; i < a.length() - 1; i++) { // 注意这里是a.length() - 1
            if (a.charAt(i) == 'V' && a.charAt(i + 1) == 'K') {
                ans++;
                a.setCharAt(i, 'X'); // 使用setCharAt来修改字符
                a.setCharAt(i + 1, 'X');
            }
        }
        for (int i = 0; i < a.length()-1; i++) {
            if (a.charAt(i) != 'X' && a.charAt(i)==a.charAt(i + 1)) {
                ans++;
                break;
            }
        }
        System.out.println(ans);
    }
}
