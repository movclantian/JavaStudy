import java.util.Scanner;
public class P1104SEC2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] name = new String[n];
        int[][] arr = new int[n][3];
        for(int i=0;i<n;i++) {
            name[i] = scanner.next();
            for(int j=0;j<3;j++) {
                arr[i][j] = scanner.nextInt(); //年，月，日
            }
        }
        
        int nian=0,yue=0,r=0; //
        String names=" ";                   
        for(int i=0;i<n-1;i++) {
          for(int j=i;j<n;j++)
            if(arr[i][0] > arr[j][0]) {
                //姓名
                names = name[j];
                name[j] = name[i];
                name[i] = names;
                //年
                nian = arr[i][0];
                arr[i][0] = arr[j][0];
                arr[j][0] = nian;
                //月
                yue = arr[i][1];
                arr[i][1] = arr[j][1];
                arr[j][1] = yue;
                //日
                r = arr[i][2];
                arr[i][2] = arr[j][2];
                arr[j][2] = r;
            }else if(arr[i][0] == arr[j][0] && i!=j) {
                if(arr[i][1] >  arr[j][1]) {
                    //姓名
                    names = name[j];
                    name[j] = name[i];
                    name[i] = names;
                    //年
                    nian = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = nian;
                    //月
                    yue = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = yue;
                    //日
                    r = arr[i][2];
                    arr[i][2] = arr[j][2];
                    arr[j][2] = r;
                }else if(arr[i][1] == arr[j][1]) {                   
                    if(arr[i][2] > arr[j][2]) {
                        //姓名
                        names = name[j];
                        name[j] = name[i];
                        name[i] = names;
                        //年
                        nian = arr[i][0];
                        arr[i][0] = arr[j][0];
                        arr[j][0] = nian;
                        //月
                        yue = arr[i][1];
                        arr[i][1] = arr[j][1];
                        arr[j][1] = yue;
                        //日
                        r = arr[i][2];
                        arr[i][2] = arr[j][2];
                        arr[j][2] = r;
                    }else if(arr[i][2] == arr[j][2]) {
                        //姓名
                        names = name[j];
                        name[j] = name[i];
                        name[i] = names;
                        //年
                        nian = arr[i][0];
                        arr[i][0] = arr[j][0];
                        arr[j][0] = nian;
                        //月
                        yue = arr[i][1];
                        arr[i][1] = arr[j][1];
                        arr[j][1] = yue;
                        //日
                        r = arr[i][2];
                        arr[i][2] = arr[j][2];
                        arr[j][2] = r;
                    }
                }
            }
        }
        for(int i=0;i<n;i++) {
            System.out.println(name[i]);
        }
       
        
    }
 
}