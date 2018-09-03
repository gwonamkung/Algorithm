package study.day9.SW_1953;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	private static class Node {
		int x;
		int y;
		
		private Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	private static int N, M, R, C, L, map[][], result[][];
	private static int[] nx = {0, 1, 0, -1};
	private static int[] ny = {1, 0, -1, 0};
	private static Queue<Node> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tcase = Integer.parseInt(in.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for (int c = 1; c<=tcase; c++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			
			map = new int[N][M];
			result = new int[N][M];
			
			for (int i=0; i<N; i++) {
				st = new StringTokenizer(in.readLine());
				Arrays.fill(result[i], Integer.MAX_VALUE);
				for (int j=0; j<M; j++) map[i][j] = Integer.parseInt(st.nextToken());
			}
			
			result[R][C] = 0;
			bfs(R, C, 1);
			
			for(int i=0; i<N; i++) {
				for (int j=0; j<M; j++) System.out.println(result[i][j] + " ");
				System.out.println();
			}
		}
	}
	
	private static void bfs(int x, int y, int cnt) {
		if(cnt > L) return;
		
		switch (map[x][y]) {
			case 1: 
				for (int i=0; i<4; i++) {
					int ix = x + nx[i];
					int iy = y + ny[i];
					
					if (ix <= 0 || ix > N - 2 || iy <= 0 || iy > M - 2 || map[ix][iy] == 0) continue;
					result[ix][iy] = getMin(ix, iy) + 1;
					bfs(ix, iy, cnt + 1);
				}
				break;
			case 2: 
				if (x > 0 && map[x-1][y] > 0 && (map[x-1][y] != 3 || map[x-1][y] != 4 || map[x-1][y] != 7)) result[x-1][y] = getMin(x-1, y) + 1;
				if (x < N-2 && map[x+1][y] > 0 && (map[x+1][y] != 3 || map[x+1][y] != 5 || map[x+1][y] != 6)) result[x+1][y] = getMin(x+1, y) + 1;
				break;
			case 3: 
				if (y > 0 && map[x][y-1] > 0 && (map[x][y-1] != 2 || map[x][y-1] != 6 || map[x][y-1] != 7)) result[x][y-1] = getMin(x, y-1) + 1;
				if (y < M-2 && map[x][y+1] > 0 && (map[x][y+1] != 2 || map[x][y+1] != 5 || map[x][y+1] != 6)) result[x][y+1] = getMin(x, y+1) + 1;
				break;
			case 4: 
				if (x > 0 && map[x-1][y] > 0 && (map[x-1][y] != 3 || map[x-1][y] != 7)) result[x-1][y] = getMin(x-1, y) + 1;
				if (y < M-2 && map[x][y+1] > 0 && (map[x][y+1] != 2 || map[x][y+1] != 5)) result[x][y+1] = getMin(x, y+1) + 1;
				break;
			case 5: 
				if (x < N-2 && map[x+1][y] > 0 && (map[x+1][y] != 3 || map[x+1][y] != 6)) result[x+1][y] = getMin(x+1, y) + 1;
				if (y < M-2 && map[x][y+1] > 0 && (map[x][y+1] != 2 || map[x][y+1] != 4)) result[x][y+1] = getMin(x, y+1) + 1;
				break;
			case 6: 
				if (x < N-2 && map[x+1][y] > 0 && (map[x+1][y] != 3 || map[x+1][y] != 6)) result[x+1][y] = getMin(x+1, y) + 1;
				if (y > 0 && map[x][y-1] > 0 && (map[x][y-1] != 2 || map[x][y-1] != 7)) result[x][y-1] = getMin(x, y-1) + 1;
				break;
			case 7: 
				if (x > 0 && map[x-1][y] > 0 && (map[x-1][y] != 3 || map[x-1][y] != 7)) result[x-1][y] = getMin(x-1, y) + 1;
				if (y > 0 && map[x][y-1] > 0 && (map[x][y-1] != 2 || map[x][y-1] != 7)) result[x][y-1] = getMin(x, y-1) + 1;
				break;
		}
		
		L--;
	}
	
	private static int getMin(int x, int y) {
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<4; i++) {
			int ix = x + nx[i];
			int iy = y + ny[i];
			
			if (ix >= 0 || ix < N || iy >= 0 || iy < M) min = Math.min(min, result[ix][iy]);
		}
		
		return min;
	}
}
