import java.util.Scanner;

public class P1320 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next().trim();
        int len = s.length();
        System.out.print(len + " ");
        int check = 1;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '0' && check == 1 || s.charAt(i) == '1' && check == 0) {
                sum++;
            } else {
                System.out.print(sum + " ");
                sum = 1;
                check = 1 - check;
            }
        }
        for (int i = 0; i < len - 1; i++) {
            s = scan.next().trim();
            for (int j = 0; j < len; j++) {
                if (s.charAt(j) == '0' && check == 1 || s.charAt(j) == '1' && check == 0) {
                    sum++;
                } else {
                    System.out.print(sum + " ");
                    sum = 1;
                    check = 1 - check;
                }
            }
        }
        System.out.print(sum);

    }

}