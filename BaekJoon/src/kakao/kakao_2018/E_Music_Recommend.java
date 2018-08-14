package kakao.kakao_2018;

import java.util.*;

public class E_Music_Recommend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //5번 음악 추천
        int N = sc.nextInt();   //총 곡 수
        int K = sc.nextInt();   //추천 데이터 수
        int J = sc.nextInt();   //목표 점수
        int[] singer_songs = new int[N + 1];   //가수가 보유한 곡 수
        int[] singer = new int[N + 1];  //곡 별 가수
        int[] singer_value = new int[N + 1];
        int[] over_time = new int[N + 1];

        List<Integer>[] tree = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) tree[i] = new ArrayList<>();

        //root 초기화
        for (int i = 2; i <= N; i++) {
            int in = sc.nextInt();
            tree[in].add(i);
        }

        for (int i = 1; i <= N; i++) {
            int singer_num = sc.nextInt();
            singer[i] = singer_num;
            singer_songs[singer_num]++;
        }

        for (int i = 1; i <= K; i++) {
            int time = sc.nextInt();
            int root = sc.nextInt();
            int value = sc.nextInt();
            int cnt = 1;
            Queue<Integer> q = new LinkedList<>();
            List<Integer> result = new ArrayList<>();
            q.add(root);
            result.add(root);

            while (!q.isEmpty()) {
                int x = q.poll();
                for (int j = 0; j < tree[x].size(); j++) {
                    q.add(tree[x].get(j));
                    result.add(tree[x].get(j));
                    cnt++;
                }
            }

            int each = value / cnt;
//            System.out.println("each: " + each);
            for (int j = 0; j < result.size(); j++) {
                int k = result.get(j);
//                System.out.println("k: " + k);
//                System.out.println("singer[k]: " + singer[k]);
                singer_value[singer[k]] += each;
                int n = singer_songs[singer[k]];
                for (int items : singer_value) System.out.print(items + " ");
                System.out.println();

                if (n > 0 && singer_value[singer[k]] / n > J && over_time[singer[k]] == 0) over_time[singer[k]] = time;
                for (int items : over_time) System.out.print(items + " ");
                System.out.println();
                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            }
            System.out.println("########################");
        }
        for (int i = 1; i <= N; i++) {
            if (over_time[singer[i]] == 0) System.out.println("-1");
            else System.out.println(over_time[singer[i]]);
        }
    }
}