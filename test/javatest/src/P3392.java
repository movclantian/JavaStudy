import java.util.*;
public class P3392 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int m= scan.nextInt();
        char [][]a=new char[n][m];
        for (int i = 0; i <n; i++) {
                a[i]=scan.next().toCharArray();
        }
        int min=99999;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                int count=0;
                for (int k = 0; k <=i ; k++) {
                    for (int l = 0; l < m; l++) {
                        if(a[k][l]!='W')
                            count++;
                    }
                }
                for (int k = i+1; k <=j; k++) {
                    for (int l = 0; l < m; l++) {
                        if(a[k][l]!='B')
                            count++;
                    }
                }
                for (int k = j+1; k < n ; k++) {
                    for (int l = 0; l < m; l++) {
                        if(a[k][l]!='R')
                            count++;
                    }
                }
                min=Math.min(count,min);
            }
        }
        System.out.println(min);
    }
}
