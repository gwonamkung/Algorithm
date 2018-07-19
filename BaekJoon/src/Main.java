import java.util.*;

public class Main {
    private static Scanner sc;
    private static Deque<Integer> q;
    private static List<Integer> indexList;
    private static int M;

    public static void main(String[] args) {
        q = new ArrayDeque<>();
        sc = new Scanner(System.in);
        int N = sc.nextInt();
        M = sc.nextInt();
        int cntL = 0, cntR = 0;
        for (int i = 1; i <= N; i++) q.add(i);
        setIndexList();
        while (!indexList.isEmpty()) {
            N = q.size();
            int pos = getIndex(indexList.get(0));
            int lLen = pos - 0;
            int rLen = N - pos;
            if (lLen <= rLen) {
                for (int j = 0; j < lLen; j++) {
                    int pF = q.pollFirst();
                    q.addLast(pF);
                    cntL++;
                }
                q.pollFirst();
            } else {
                for (int j = 0; j < rLen; j++) {
                    int pL = q.pollLast();
                    q.addFirst(pL);
                    cntR++;
                }
                q.pollFirst();
            }
            indexList.remove(0);
        }
        System.out.println(cntL + cntR);
    }

    public static void setIndexList() {
        indexList = new ArrayList<>();
        for (int i = 0; i < M; i++) indexList.add(sc.nextInt());
    }

    public static int getIndex(int element) {
        Deque<Integer> temp = new ArrayDeque<>(q);
        int cnt = -1;
        int poll = 0;
        while (poll != element) {
            poll = temp.pop();
            cnt++;
        }
        return cnt;
    }
}