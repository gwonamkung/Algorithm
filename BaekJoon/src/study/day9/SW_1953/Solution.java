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
        int cnt;

        private Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }

    private static int N, M, R, C, L, map[][];
    private static int[] nx = {0, 1, 0, -1};
    private static int[] ny = {1, 0, -1, 0};
    private static boolean[][] visited;
    private static Queue<Node> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tcase = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();

        for (int c = 1; c <= tcase; c++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(in.readLine());
                for (int j = 0; j < M; j++) map[i][j] = Integer.parseInt(st.nextToken());
            }

            sb.append("#" + c + " " + bfs(R, C) + "\n");
        }

        System.out.println(sb.toString());
        in.close();
    }

    private static int bfs(int x, int y) {
        int cnt = 1;
        q.add(new Node(x, y, 1));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Node node = q.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = node.x + nx[i];
                int nextY = node.y + ny[i];

                if (node.cnt == L) break;
                if (nextX < 0 || nextY < 0 || nextX > N - 1 || nextY > M - 1) continue;

                if (map[nextX][nextY] > 0 && !visited[nextX][nextY]) {
                    if (check(node.x, node.y, nextX, nextY)) {
                        q.add(new Node(nextX, nextY, node.cnt + 1));
                        visited[nextX][nextY] = true;
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

    private static boolean check(int x, int y, int n_x, int n_y) {
        int now = map[x][y];
        int next = map[n_x][n_y];

        switch (now) {
            case 1:
                if (n_y > y) {
                    if (next == 2 || next == 4 || next == 5) return false;
                } else if (n_x > x) {
                    if (next == 3 || next == 5 || next == 6) return false;
                } else if (n_y < y) {
                    if (next == 2 || next == 6 || next == 7) return false;
                } else {
                    if (next == 3 || next == 4 || next == 7) return false;
                }
                break;

            case 2:
                if (n_x > x) {
                    if (next == 3 || next == 5 || next == 6) return false;
                } else if (n_x < x){
                    if (next == 3 || next == 4 || next == 7) return false;
                } else return false;
                break;

            case 3:
                if (n_y > y) {
                    if (next == 2 || next == 4 || next == 5) return false;
                } else if (n_y < y) {
                    if (next == 2 || next == 6 || next == 7) return false;
                } else return false;
                break;

            case 4:
                if (n_x < x) {
                    if (next == 3 || next == 4 || next == 7) return false;
                } else if (n_y > y) {
                    if (next == 2 || next == 4 || next == 5) return false;
                } else return false;
                break;

            case 5:
                if (n_y > y) {
                    if (next == 2 || next == 4 || next == 5) return false;
                } else if (n_x > x) {
                    if (next == 3 || next == 5 || next == 6) return false;
                } else return false;
                break;

            case 6:
                if (n_y < y) {
                    if (next == 2 || next == 6 || next == 7) return false;
                } else if (n_x > x) {
                    if (next == 3 || next == 5 || next == 6) return false;
                } else return false;
                break;

            case 7:
                if (n_y < y) {
                    if (next == 2 || next == 6 || next == 7) return false;
                } else if (n_x < x) {
                    if (next == 3 || next == 4 || next == 7) return false;
                } else return false;
                break;
        }

        return true;
    }
}