import java.util.*;
public class LanQiao3824KX {
    static long max=Long.MIN_VALUE,min=Long.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char []n = scan.next().toCharArray();
        int k= scan.nextInt();
        StringBuilder st=new StringBuilder();
        dfs(0,n,k,st);
        System.out.println(max-min);
    }
    public  static void dfs(int u,char []n,int k,StringBuilder st){
        if(u==n.length){
            if(k==0){
                String []s=st.toString().split("\\+");
                long res=0;
                for(String x:s){
                    res+=Long.parseLong(x);
                }
                max=Math.max(max,res);
                min=Math.min(min,res);
            }
            return;
        }
        st.append(n[u]);
        dfs(u+1,n,k,st);
        st.deleteCharAt(st.length()-1);
        if(k>0&&u<n.length-1){
            st.append(n[u]);
            st.append("+");
            dfs(u+1,n,k-1,st);
            st.deleteCharAt(st.length()-1);//要多减去加号
            st.deleteCharAt(st.length()-1);
        }
    }
}
