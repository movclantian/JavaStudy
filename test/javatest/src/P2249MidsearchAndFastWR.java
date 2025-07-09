import java.io.*;
public class P2249MidsearchAndFastWR {
    public static void main(String[] args) throws Exception {
        Read scan = new Read();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int x = scan.nextInt();
            int l = 0;
            int r = n - 1;
            while (l < r) {
                int mid = (l + r) >> 1;
                if (a[mid] < x) {
                    l = mid + 1;
                } else if(a[mid]>=x) {
                    r=mid;
                }
            }
            if(a[l]==x){
                s.append(l+1).append(" ");
            }else {
                s.append(-1+" ");
            }
        }
        System.out.println(s);
    }
}

class Read {
    StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public int nextInt() throws Exception {
        st.nextToken();
        return (int) st.nval;
    }
}

