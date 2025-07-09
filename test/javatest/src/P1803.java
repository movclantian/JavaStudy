import java.util.*;

public class P1803 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Games[] games=new Games[n];

        for (int i = 0; i <n ; i++) {
            int s=sc.nextInt();
            int t=sc.nextInt();
            games[i]=new Games(s,t);
        }
        Arrays.sort(games,( t1, t2)->(t1.t- t2.t));
        int count=0;
        int tt=0;
         for (int i = 0; i < n; i++) {
            if (tt<=games[i].s){
                count++;
                tt=games[i].t;
            }
        }
        System.out.println(count);
    }
}
class Games{
    public int s;//开始时间
    public int t;//结束时间
    public Games(int s, int t) {
        this.s=s;
        this.t=t;
    }
}