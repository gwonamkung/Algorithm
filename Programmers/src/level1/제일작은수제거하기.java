package level1;

import java.util.ArrayList;
import java.util.List;

public class 제일작은수제거하기 {
    static int[] answer;
    public static void main(String[] args) {
        int[] a = {10};
        solution(a);
        for (int items:answer) System.out.println(items);
    }
    public static int[] solution(int[] arr) {
        int min = 1000000000;
        List<Integer> list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            min = Math.min(min,arr[i]);
        }

        if (list.size()>1) {
            list.remove(list.indexOf(min));
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i).intValue();
            }
            return answer;
        } else {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
    }
}
