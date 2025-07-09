import java.util.*;
public class P5734 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder s = new StringBuilder(sc.next());
        for (int i = 0; i < n; i++){
            int x= sc.nextInt();
            switch (x){
                case 1:
                    System.out.println(s.append(sc.next()));
                    break;
                case 2:
                    int n1=sc.nextInt();//起
					int n2=sc.nextInt();//终
					int n3=n1+n2;
	 				StringBuilder abc=new StringBuilder();
					for(int j=n1;j<n3;j++) {
						abc.append(s.charAt(j));
					}
					s=abc;
					System.out.println(s);
                    break;
                case 3:
                    int insert= sc.nextInt();
                    String a=sc.next();
                    s.insert(insert,a);
                    System.out.println(s);
                    break;
                case 4:
                    String b=sc.next();
                    System.out.println(s.indexOf(b));
                    break;
            }
        }
    }
}
