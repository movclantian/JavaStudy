import java.util.*;

public class P1217 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        if (a % 2 == 0) {
            a += 1;
        }
        long b = scan.nextInt();

        for (long i = a; i <=b; i += 2) {
            if(i>=10000000)		// 如果一个回文素数的位数是偶数，则它的奇数位上的数字和与偶数位上的数字和必然相等；
				break;
            if ( check2(i) == 1) {
                if ( check(i) == 1)
                    System.out.println(i);
            }
        }
    }
    public static int check(long m) {
        if (m % 2 == 0) {
            return 0;
        }
        long x = (int) Math.sqrt(m);
        for (long i = 3; i <= x; i+=2) {
            if (m % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int check2(long m) {
        String s = String.valueOf(m);
        StringBuffer b = new StringBuffer(s);
        if(s.equals(b.reverse().toString()))
        return 1;
        else return 0;
    }
}

