package graph.dfs.BOJ_2667;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int[][] danji;
    static int inside_cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        danji = new int[X+2][X+2];

        for (int i = 1; i <= X; i++) {
            String v = sc.next();
            for (int j = 1; j <= X; j++) danji[i][j] = (int) v.charAt(j-1) - 48;
        }

        inside_cnt = 0;
        List<Integer> total_cnt = new ArrayList<>();
        for (int i = 1; i <= X; i++) {
            for (int j = 1; j <= X; j++) {
                if (danji[i][j] == 1) {
                    inside_cnt = 0;
                    dfs(i, j);
                    total_cnt.add(inside_cnt);
                }
            }
        }
        Collections.sort(total_cnt);
        System.out.println(total_cnt.size());
        for (int items : total_cnt) System.out.println(items);
        sc.close();
    }

    private static void dfs(int x, int y) {
        inside_cnt++;
        danji[x][y] = 0;

        if (danji[x][y + 1] == 1) dfs(x, y + 1);
        if (danji[x + 1][y] == 1) dfs(x + 1, y);
        if (danji[x][y - 1] == 1) dfs(x, y - 1);
        if (danji[x - 1][y] == 1) dfs(x - 1, y);
    }
}