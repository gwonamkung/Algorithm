package graph.topological.BOJ_2252_Sort;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

class Main {
    private static Vector<Integer>[] ve;
    private static Queue<Integer> result;
    private static int[] inDegree;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        inDegree = new int[N+1];

        ve = new Vector[N+1];
        result = new LinkedList();

        for (int i = 0; i < ve.length; i++) ve[i] = new Vector<>();
        for (int i=1; i<= M ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ve[x].add(y);
            inDegree[y]++;
        }
        topological_sort();
    }

    public static void topological_sort() {
        //진입차선이 0인것을 result 큐에 삽입
        for (int i=1; i<ve.length; i++) if(inDegree[i] == 0) result.add(i);

        while(!result.isEmpty()) {
            System.out.print(result.peek() + " ");
            int v = result.poll();

            //노드의 진출차선 제거
            for (int i=1; i<= ve[v].size(); i++) {
                System.out.println("v: " + v + ", i: " + i);
                int next = ve[v].get(i-1);
                inDegree[next]--;
                if (inDegree[next] == 0) result.add(next);
            }
        }
    }
}
