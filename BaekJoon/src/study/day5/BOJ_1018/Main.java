package study.day5.BOJ_1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int min, map[][];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String str = in.readLine();

            for (int j = 1; j <= M; j++) map[i][j] = str.charAt(j - 1);
        }

        min = Integer.MAX_VALUE;
        for (int i = 1; i <= N - 7; i++) {
            for (int j = 1; j <= M - 7; j++) bf(i, j);
        }

        if (min > 32) min = 64 - min;
        System.out.println(min);
        in.close();
    }

    //66: B, 87: W.
    private static void bf(int startX, int startY) {
        int cnt1 = 0;
        int cnt2 = 0;
        int s1 = map[startX][startY] == 'B' ? 'B' : 'W';
        int s2 = map[startX][startY] == 'B' ? 'W' : 'B';

        for (int i = startX; i <= startX + 7; i++) {
            for (int j = startY; j <= startY + 7; j++) {
                if ((j - startY) % 2 == 0 && (map[i][j] != ((i - startX) % 2 == 0 ? s1 : s2))) cnt1++;
                else if ((j - startY) % 2 == 1 && map[i][j] != ((i - startX) % 2 == 0? s2 : s1)) cnt1++;
            }
        }

        int t1 = s1 == 'B' ? 'W' : 'B';
        int t2 = s2 == 'B' ? 'W' : 'B';

        for (int i = startX; i <= startX + 7; i++) {
            for (int j = startY; j <= startY + 7; j++) {
                if ((j - startY) % 2 == 0 && (map[i][j] != ((i - startX) % 2 == 0 ? t1 : t2))) cnt2++;
                else if ((j - startY) % 2 == 1 && map[i][j] != ((i - startX) % 2 == 0? t2 : t1)) cnt2++;
            }
        }

        min = Math.min(min, Math.min(cnt1, cnt2));
    }
}