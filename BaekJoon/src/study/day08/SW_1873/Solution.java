package study.day08.SW_1873;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    private static int H, W, x, y, dir;
    private static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());

        for (int c = 1; c <= t; c++) {
            StringTokenizer st = new StringTokenizer(in.readLine());

            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            map = new char[H][W];

            for (int i = 0; i < H; i++) {
                String str = in.readLine();

                for (int j = 0; j < W; j++) {
                    if (str.charAt(j) == '^' || str.charAt(j) == 'v' || str.charAt(j) == '<' || str.charAt(j) == '>') {
                        if (str.charAt(j) == '^') dir = 1;
                        else if (str.charAt(j) == '>') dir = 2;
                        else if (str.charAt(j) == 'v') dir = 3;
                        else dir = 4;
                        x = i;
                        y = j;
                    }
                    map[i][j] = str.charAt(j);
                }
            }
            map[x][y] = '.';

            int len = Integer.parseInt(in.readLine());
            String cmd = in.readLine();

            for (int i = 0; i < len; i++) {
                if (cmd.charAt(i) == 'U') {
                    dir = 1;
                    if (x > 0 && map[x - 1][y] == '.') x -= 1;
                } else if (cmd.charAt(i) == 'R') {
                    dir = 2;
                    if (y < W - 1 && map[x][y + 1] == '.') y += 1;
                } else if (cmd.charAt(i) == 'D') {
                    dir = 3;
                    if (x < H - 1 && map[x + 1][y] == '.') x += 1;
                } else if (cmd.charAt(i) == 'L') {
                    dir = 4;
                    if (y > 0 && map[x][y - 1] == '.') y -= 1;
                } else shoot(x, y);
            }

            if (dir == 1) map[x][y] = '^';
            else if (dir == 2) map[x][y] = '>';
            else if (dir == 3) map[x][y] = 'v';
            else map[x][y] = '<';

            StringBuilder sb = new StringBuilder();
            sb.append("#" + c + " ");

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) sb.append(map[i][j]);
                if (i < H - 1) sb.append("\n");
            }
            System.out.println(sb.toString());
        }
    }

    private static void shoot(int nowX, int nowY) {
        if (dir == 1) {
            while (nowX > 0 && !check(nowX - 1, y)) nowX--;
        } else if (dir == 2) {
            while (nowY < W - 1 && !check(x, nowY + 1)) nowY++;
        } else if (dir == 3) {
            while (nowX < H - 1 && !check(nowX + 1, y)) nowX++;
        } else {
            while (nowY > 0 && !check(x, nowY - 1)) nowY--;
        }
    }

    private static boolean check(int x, int y) {
        if (map[x][y] == '*') {
            map[x][y] = '.';
            return true;
        } else if (map[x][y] == '#') return true;

        return false;
    }
}
