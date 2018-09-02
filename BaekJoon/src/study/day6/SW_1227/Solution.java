package study.day6.SW_1227;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static int cnt, map[][];
    private static int[] nextX = {0, 1, 0, -1};
    private static int[] nextY = {1, 0, -1, 0};


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= 10; t++) {
            map = new int[101][101];
            int n = Integer.parseInt(in.readLine());

            for (int i = 0; i < 100; i++) {
                String str = in.readLine();
                for (int j = 0; j < 100; j++) map[i][j] = str.charAt(j);
            }

            cnt = 0;
            dfs(1, 1);
            sb.append("#" + t + " " + cnt + "\n");
        }
        System.out.println(sb.toString());
        in.close();
    }

    private static void dfs(int x, int y) {
        map[x][y] = 1;

        for (int i = 0; i <= 3; i++) {
            int X = x + nextX[i];
            int Y = y + nextY[i];

            if (map[X][Y] == '0') dfs(X, Y);
            else if (map[X][Y] == '3') {
                cnt = 1;
                break;
            }
        }
//        map[x][y] = 0;
    }
}