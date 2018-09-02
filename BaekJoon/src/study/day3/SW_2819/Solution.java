package study.day3.SW_2819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Solution {
    static int map[][];

    //중복된 값 저장 안되는 Set 자료구조 사용.
    static HashSet<Integer> list;
    static int[] x = {0, 1, 0, -1};
    static int[] y = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());

        for (int c = 1; c <= t; c++) {
            map = new int[5][5];
            list = new HashSet<>();

            for (int i = 1; i <= 4; i++) {
                StringTokenizer st = new StringTokenizer(in.readLine());
                for (int j = 1; j <= 4; j++) map[i][j] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= 4; j++) search(i, j, map[i][j], 1);
            }

            System.out.println("#" + c + " " + list.size());
        }
    }

    private static void search(int a, int b, int sum, int cnt) {
        if (cnt == 7) {
            list.add(sum);
            return;
        }

        for (int i = 1; i <= 4; i++) {
            int nextX = a + x[i - 1];
            int nextY = b + y[i - 1];

            if (nextX <= 4 && nextX >= 1 && nextY <= 4 && nextY >= 1)
                search(nextX, nextY, (sum * 10 + map[nextX][nextY]), cnt + 1);
        }
    }
}