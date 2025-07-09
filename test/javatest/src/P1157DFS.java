import java.util.*;
public class P1157DFS {
    static int n;
    static int r;
    static int a[];
    static int v[];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n= scanner.nextInt();
        r= scanner.nextInt();
        a=new int[n+1];
        v=new int [n+1];
        dfs(1);
    }
    public static void dfs(int x){
        if(x>r){
            for (int i=1;i<=r;i++){
                System.out.printf("%3d",a[i]);
            }
            System.out.println();
            return;
        }
        for (int i=1+a[x-1];i<=n;i++){
            if(v[i]==0){
                v[i]=1;
                a[x]=i;
                dfs(x+1);
                a[x]=0;
                v[i]=0;
            }
        }
    }
}