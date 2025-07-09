import java.util.*;

public class P1028DFS {
    static int []a=new int [10086];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dfs(n));
    }
    public static int dfs(int n){
        if(a[n]!=0){
            return a[n];
        }
        for (int i = 1; i <=n/2 ; i++) {
            if(a[i]==0){
                a[i]=dfs(i);
            }
            a[n]+=a[i];
        }
        a[n]++;
        return a[n];
    }
}
