import java.util.*;
//很坑的题目
//很坑的题目
//很坑的题目
//很坑的题目
//很坑的题目
//很坑的题目
public class P1553SB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if ( s.charAt(i) == '/') {
                StringBuilder str1 = new StringBuilder(s.substring(0, i));
                for (int j = str1.length() - 1; j >= 0; j--) {
                    if (str1.charAt(j) == '0')
                        str1.deleteCharAt(j);
                    else
                        break;
                }
                StringBuilder str2 = new StringBuilder(s.substring(i + 1, n));
                for (int j = 0; j < str2.length(); j++) {
                    if (str2.charAt(j) == '0') {
                        str2.deleteCharAt(j);
                        j--;
                    } else
                        break;
                }
                for (int j = str2.length() - 1; j >= 0; j--) {
                    if (str2.charAt(j) == '0') {
                        str2.deleteCharAt(j);
                    } else
                        break;
                }
                for (int j = str1.length() - 1; j >= 0; j--) {
                    System.out.print(str1.charAt(j));
                }
                if (str1.length() == 0){
                    System.out.print("0");
                }
                System.out.print(s.charAt(i));
                for (int j = str2.length() - 1; j >= 0; j--) {
                    System.out.print(str2.charAt(j));
                }
                if (str2.length() == 0) {
                    System.out.print("0");
                }
                flag = 1;
                break;
            } else if (s.charAt(i) == '.' ) {
                StringBuilder str1 = new StringBuilder(s.substring(0, i));
                for (int j = str1.length() - 1; j >= 0; j--) {
                    if (str1.charAt(j) == '0')
                        str1.deleteCharAt(j);
                    else
                        break;
                }
                StringBuilder str2 = new StringBuilder(s.substring(i + 1, n));
                for (int j = 0; j < str2.length(); j++) {
                    if (str2.charAt(j) == '0') {
                        str2.deleteCharAt(j);
                        j--;
                    } else
                        break;
                }
                for (int j = str1.length() - 1; j >= 0; j--) {
                    System.out.print(str1.charAt(j));
                }
                if (str1.length() == 0){
                    System.out.print("0");
                }
                System.out.print(s.charAt(i));
                for (int j = str2.length() - 1; j >= 0; j--) {
                    System.out.print(str2.charAt(j));
                }
                if (str2.length() == 0) {
                    System.out.print("0");
                }
                flag = 1;
                break;

            } else if (s.charAt(i) == '%') {
                StringBuilder str1 = new StringBuilder(s.substring(0, i));
                for (int j = str1.length() - 1; j >= 0; j--) {
                    if (str1.charAt(j) == '0')
                        str1.deleteCharAt(j);
                    else
                        break;
                }
                for (int j = str1.length() - 1; j >= 0; j--) {
                    System.out.print(str1.charAt(j));
                }
                if(str1.length() == 0){
                    System.out.print("0");
                }
                flag = 1;
                System.out.print(s.charAt(i));
                break;
            }
        }
        if (flag == 0) {
            int note = n - 1;
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) != '0') {
                    note = i;
                    break;
                }
            }
            for (int i = note; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
