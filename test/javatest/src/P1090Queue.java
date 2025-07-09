import java.util.Arrays;
import java.util.Scanner;

public class P1090Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr); // 初始排序
        int ans = 0;

        while (arr.length > 1) {
            // 取出前两个最小的元素
            int x = arr[0];
            int y = arr[1];
            ans += x + y;

            // 创建一个新的数组，长度减1
            int[] newArr = new int[arr.length - 1];
            newArr[0] = x + y;
            // 将剩下的元素复制到新数组，并保持排序
            for (int i = 2; i < arr.length; ++i) {
                newArr[i - 1] = arr[i];
            }
            Arrays.sort(newArr);
            arr = newArr;
        }

        System.out.println(ans);
    }
}