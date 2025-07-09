import java.util.*;

public class P1067 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuilder s = new StringBuilder();
        for (int i = n; i >=0 ; i--) {
            int x= scan.nextInt();
            if(x!=0){
                if(i!=n&&x>0){
                    s.append("+");
                }
                if(i!=0&&x==-1){
                    s.append("-");
                }
                if(Math.abs(x)>1||i==0){
                    s.append(x);
                }
                if(i>1){
                    s.append("x^").append(i);
                }
                if(1==i){
                    s.append('x');
                }
            }
        }
        System.out.println(s);
    }
}
