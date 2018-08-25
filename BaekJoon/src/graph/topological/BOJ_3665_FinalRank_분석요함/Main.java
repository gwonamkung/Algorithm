package graph.topological.BOJ_3665_FinalRank_분석요함;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        //System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            int N = Integer.parseInt(br.readLine());
            int rank[] = new int[N + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                rank[i] = Integer.parseInt(st.nextToken());
            }

            // map 생성하기
            boolean map[][] = new boolean[N + 1][N + 1];
            int indegree[] = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                int a = rank[i];
                for (int j = 1; j < i; j++) {
                    int b = rank[j];
                    // a보다 순위가 높은 사람은 true
                    map[a][b] = true;
                    indegree[a]++;
                }
            }

            // 순위 바꾸기 
            int K = Integer.parseInt(br.readLine());
            for (int i = 1; i <= K; i++) {
                st = new StringTokenizer(br.readLine());
                int ch1 = Integer.parseInt(st.nextToken());
                int ch2 = Integer.parseInt(st.nextToken());


                // map(2, 4)가 true이면 기존에는 4가 2보다 순위가 높다는 의미
                if (map[ch1][ch2]) {
                    indegree[ch1]--;
                    indegree[ch2]++;
                } else {
                    indegree[ch2]--;
                    indegree[ch1]++;
                }

                map[ch1][ch2] = !map[ch1][ch2];
                map[ch2][ch1] = !map[ch2][ch1];
            }

            // 위상정렬 시작 
            Queue<Integer> q = new LinkedList<Integer>();
            for (int i = 1; i <= N; i++) {
                if (indegree[i] == 0) {
                    q.add(i);
                }
            }

            int cnt = 0;
            StringBuilder sb = new StringBuilder();
            while (!q.isEmpty()) {
                // 큐 상태 체크 (순위 데이터이기 때문에 큐에 데이터가 2개 이상 동시에 존재할 수 없다.)
                if (q.size() >= 2) break;

                cnt++;
                int poll = q.poll();
                sb.append(poll + " ");

                for (int i = 1; i <= N; i++) {
                    if (map[i][poll]) {
                        indegree[i]--;
                        if (indegree[i] == 0) {
                            q.add(i);
                        }
                    }
                }
            }

            if (cnt == N) {
                System.out.println(sb.toString());
            } else {
                System.out.println("IMPOSSIBLE");
            }
        }
    }
}
