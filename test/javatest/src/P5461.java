import java.util.*;

public class P5461 {
    static int[][] map;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int length = (1 << n) + 1;
        map = new int[length][length];
        for (int i = 1; i < length; i++) {
            Arrays.fill(map[i], 1);
        }
        solve(map, 1,length-1,1,length-1,n);
        //快速输出,因为输出量很大，所以不能用System.out.println()
        //快速输出,因为输出量很大，所以不能用System.out.println()
        //快速输出,因为输出量很大，所以不能用System.out.println()
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < length; i++) {
            for (int j = 1; j < length; j++) {
                sb.append(map[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }


    public static void solve(int[][] map, int a, int b, int c, int d,int n) {
        if(n==0)
            return;
        for (int i=a;i<=(a+b)/2;i++){
            for (int j=c;j<=(c+d)/2;j++){
                map[i][j]=0;
            }
        }
        solve(map,a,(a+b)/2,c,(c+d)/2,n-1);
        solve(map,a,(a+b)/2,(c+d)/2+1,d,n-1);
        solve(map,(a+b)/2+1,b,(c+d)/2+1,d,n-1);
        solve(map,(a+b)/2+1,b,c,(c+d)/2,n-1);
    }
}
