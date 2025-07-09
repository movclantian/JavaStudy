import java.util.Scanner;

public class P4924pass {
    static int n;
    static int m;
    static int[][] a;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        a = new int[n][n];
        int t = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                a[i][j] = ++t;
            }
        }
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int r = scanner.nextInt();
            int z = scanner.nextInt();
            solve(x - 1, y - 1, r, z);
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s.append(a[i][j]).append(" ");
            }
            s.append('\n');
        }
        s.deleteCharAt(s.length() - 1);
        System.out.println(s);
    }

    public static void solve(int cx, int cy, int r, int z) {
        int L = 2 * r + 1;
        int startRow = cx - r;
        int startCol = cy - r;
        // 复制子矩阵到临时数组 c
        int[][] c = new int[L][L];
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < L; j++) {
                c[i][j] = a[startRow + i][startCol + j];
            }
        }

        int[][] rotated = new int[L][L];
        if (z == 0) { // 顺时针旋转 90°: rotated[i][j] = c[L-1-j][i]
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < L; j++) {
                    rotated[i][j] = c[L - 1 - j][i];
                }
            }
        } else { // 逆时针旋转 90°: rotated[i][j] = c[j][L-1-i]
            for (int i = 0; i < L; i++) {
                for (int j = 0; j < L; j++) {
                    rotated[i][j] = c[j][L - 1 - i];
                }
            }
        }
        // 将旋转后的子矩阵复制回原矩阵 a 的对应位置
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < L; j++) {
                a[startRow + i][startCol + j] = rotated[i][j];
            }
        }
    }

}