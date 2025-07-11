package Summer;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[] { 78, 352, 3210, 241, 246, 1, 98, 32 };
		int t = scanner.nextInt();
		Arrays.sort(a);
		System.out.println(binarySearch01(a, t));
	}

	public static int binarySearch01(int[] a, int target) {
		int l = 0, r = a.length - 1;
		while (l <= r) {
//			int m = (l + r) / 2; 如果数组长度非常大会超过int范围,我们一般使用
//			三个>符号,为无符号右移>>>来解决
			int m = (l + r) >>> 1;
			if (target < a[m]) {
				r = m - 1;
			} else if (target > a[m]) {
				l = m + 1;
			} else {
				return m;
			}
		}
		return -1;
	}

	/*
	 * 为什么是l<=r? 当l=r时候,直接退出循环了,从而漏掉了一次循环
	 */
	public static int binarySearchAdoc(int[] a, int target) {
		int l = 0, r = a.length; //
		while (l < r) { //
			int m = (l + r) >>> 1;
			if (target < a[m]) {
				r = m; //
			} else if (target > a[m]) {
				l = m + 1;
			} else {
				return m;
			}
		}
		return -1;
	}

}