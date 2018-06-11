package level1;

import java.util.*;

class Divisor {
    public static void main(String[] args) {
        int[] arr = {2, 10, 1, 5, 7, 128, 56, 121};
        for (int items : solution(arr, 2)) System.out.println(items);
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];

        if (list.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        for(int i=0; i<list.size();i++) answer[i] = list.get(i);
        Arrays.sort(answer);
        return answer;
    }
}
