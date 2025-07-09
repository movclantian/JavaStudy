import java.util.*;
import java.io.*;

public class P1102pass {
    public static void main(String[] args) throws Exception {
        Read1 sc = new Read1();
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long count = 0;
        Arrays.sort(a);
        for (int i = n - 1; i >= 1; i--) {
            int l = 0;
            int r = 1;
            int x = Arrays.binarySearch(a, a[i] - c);
            if(a[i]<c){
                break;
            }
            if (x >= 0) {
                int x1=x;
                int x2=x;
                while (a[x1] == a[x1 + 1]) {
                    r++;
                    x1++;
                }
                while (x2 > 0 && a[x2 - 1] == a[x2]) {
                    x2--;
                    l--;
                }
            }else {
                continue;
            }
            count += r +(-l);
        }
        System.out.println(count);
    }
}

class Read1 {
    StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    public int nextInt() throws Exception {
        st.nextToken();
        return (int) st.nval;
    }
}
