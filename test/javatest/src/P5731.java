import java.util.*;

public class P5731 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m[][]=new int [n+1][n+1];
        int k=1,x=1,y=0;
        while(k<=n*n){
            while(y<n&&0==(m[x][y+1])){
                m[x][++y]=k++;
            }
            while (x<n&&0==m[x+1][y]){
                m[++x][y]=k++;
            }
            while (y>1&&0==m[x][y-1]){
                m[x][--y]=k++;
            }
            while (x>1&&0==m[x-1][y]){
                m[--x][y]=k++;
            }
        }
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <=n; j++){
                System.out.printf("%3d", m[i][j]);

            }
            System.out.println();
        }
    }

}
