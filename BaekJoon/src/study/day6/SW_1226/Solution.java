package study.day6.SW_1226;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static int cnt, map[][];
    private static int[] nx = {0, 1, 0, -1};
    private static int[] ny = {1, 0, -1, 0};


    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int t = 1; t <= 10; t++) {
            map = new int[17][17];
            int n = Integer.parseInt(in.readLine());

            //이차원 배열에 입력.
            for (int i = 0; i < 16; i++) {
                String str = in.readLine();
                for (int j = 0; j < 16; j++) map[i][j] = str.charAt(j);
            }

            cnt = 0;
            dfs(1, 1);
            sb.append("#" + t + " " + cnt + "\n");
        }
        System.out.println(sb.toString());
        in.close();
    }

    private static void dfs(int x, int y) {
        //이미 지나간 곳을 다시 돌아가지 않게 1로 벽 처리.
        map[x][y] = 1;
//        System.out.println("x: " + x + ", y: " + y);
        for (int i = 0; i <= 3; i++) {
            int nextX = x + nx[i];
            int nextY = y + ny[i];

            //다음 값이 0이면 dfs.
            if (map[nextX][nextY] == '0') {
                dfs(nextX, nextY);

            //다음 값이 3이면 break.
            } else if (map[nextX][nextY] == '3') {
                cnt = 1;
                break;
            }
        }
//        백트래킹 해야하는 경우.
//        map[x][y] = 0;
    }
}