package lanqiao;
import java.util.Scanner;
public class quickly {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b[] = new int[a];
		for (int i = 0; i < b.length; i++) {
			b[i] = scan.nextInt();
		}
		b=quickmethod(b, 0, a-1);
		for (int i = 0; i < b.length; i++) {
			if(i>0) {
			System.out.print(" ");
			}
			System.out.print(b[i]);
		}
		scan.close();
	}
	public static int[] quickmethod(int[] arr, int left,int right) {
		if(left<right) {
			int p=partition(arr,left,right);
			quickmethod(arr,left,p-1);
			quickmethod(arr,p+1,right);
		}
		return arr;
	}
	public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left]; // 选择left位置的元素作为基准值
        int index = left + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < pivot) {
                swap(arr, index, i);
                index++;
            }
        }
        swap(arr, left, index - 1); // 将基准值交换到正确的位置
        return index - 1;
    }
	private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
