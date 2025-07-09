import java.util.*;
public class P1706DFS {
    static int n;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int a[]=new int[n+1];
        int v[]=new int[n+1];
        dfs(1,a,v);
    }
    public static void dfs(int x,int a[],int v[]){
        if(x==n+1){
            for (int i = 1; i < n+1; i++) {
                System.out.print("    "+a[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <n+1 ; i++) {

            if(v[i]==0){
                v[i]=1;
                a[x]=i;
                dfs(x+1,a,v);
                v[i]=0;
            }
        }
    }
}
