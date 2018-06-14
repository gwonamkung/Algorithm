package level1;

import java.util.ArrayList;
import java.util.List;

public class 자연수뒤집어배열만들기 {
    static int[] answer;
    public static void main(String[] args) {
        solution(100000000000L);
        for (int items : answer) System.out.print(items);
    }
    public static int[] solution(long n) {
        List<Long> list = new ArrayList();
        while (true) {
            list.add(n%10);
            if (n<10) break;
            n /= 10;
        }
        answer = new int[list.size()];
        for (int i=0; i<answer.length;i++) {
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}
