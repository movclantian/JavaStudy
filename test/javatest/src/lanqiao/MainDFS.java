package lanqiao;

import java.util.*;

// 1:无需package
// 2: 类名必须Main, 不可修改
class MainDFS {
	static int ans=0;
	public static void main(String argv[]) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		char[][] c = new char[n][m];
		for (int i = 0; i < n; i++) {
			c[i] = scan.next().toCharArray();
		}
		@SuppressWarnings("unused")
		int check1=scan.nextInt();	//因为要输入两个0才能结束
		@SuppressWarnings("unused")
		int check2=scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (c[i][j] == '@') {
					dfs(i, j, c);
				}
			}
		}
		System.out.println(ans);
		scan.close();
	}

	private static void dfs(int x, int y, char[][] c) {
		ans++;
		c[x][y] = '#';
		int[] dx = { 1, -1, 0, 0 };
		int[] dy = { 0, 0, 1, -1 };
		for (int i = 0; i < 4; i++) {
			int x1=x+dx[i];
			int y1=y+dy[i];
			if(x1<0||x1>=c.length||y1<0||y1>=c[0].length||c[x1][y1]!='.') {
				continue;
			}
			dfs(x1,y1,c);
		}
	}
}
