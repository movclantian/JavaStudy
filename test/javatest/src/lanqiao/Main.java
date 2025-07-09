package lanqiao;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            long b = scanner.nextLong();
            int count = 0;
            long index = -1;
            int[] bases = {2, 4, 8, 16};
            for (int base : bases) {
                long value = convertToValue(a, base);
                if (value != -1) {
                    if (value < b) {
                        count++;
                        index = value;
                    }
                }
            }

            if (count == 1) {
                System.out.println(index);
            } else {
                System.out.println(-1);
            }
        }
    }

    private static long convertToValue(String str, int base) {
        try {
            return Long.parseLong(str, base);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}