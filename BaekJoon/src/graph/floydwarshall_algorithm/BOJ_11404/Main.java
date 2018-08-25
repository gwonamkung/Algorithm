package graph.floydwarshall_algorithm.BOJ_11404;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] map = new int[N][N];
        for (int inx = 0; inx < N; inx++) {
            Arrays.fill(map[inx], 987654321);
            map[inx][inx] = 0;
        }

        int M = Integer.parseInt(br.readLine());

        for (int inx = 0; inx < M; inx++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int tempSource = Integer.parseInt(st.nextToken()) - 1;
            int tempDesti = Integer.parseInt(st.nextToken()) - 1;
            int tempCost = Integer.parseInt(st.nextToken());

            map[tempSource][tempDesti] = Math.min(tempCost, map[tempSource][tempDesti]);

        }

        for (int knx = 0; knx < N; knx++) {
            for (int inx = 0; inx < N; inx++) {
                for (int jnx = 0; jnx < N; jnx++) {
                    if (map[inx][jnx] > map[inx][knx] + map[knx][jnx]) {
                        map[inx][jnx] = map[inx][knx] + map[knx][jnx];
                    }
                }
            }
        }

        for (int inx = 0; inx < N; inx++) {
            for (int jnx = 0; jnx < N; jnx++) {
                if (map[inx][jnx] == 987654321) {
                    bw.write(Integer.toString(0));
                } else {
                    bw.write(Integer.toString(map[inx][jnx]));
                }

                if (jnx < N - 1) {
                    bw.write(" ");
                } else {
                    bw.write("\n");
                }
            }
        }


        bw.flush();


    }
}