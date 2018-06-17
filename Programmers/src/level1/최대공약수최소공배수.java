package level1;

import java.util.ArrayList;
import java.util.List;

public class 최대공약수최소공배수 {
    static int[] answer = new int[2];

    public static void main(String[] args) {
        solution(1, 1);
        for (int items : answer) System.out.print(items + " ");
    }

    public static int[] solution(int x, int y) {
        int tempX = x, tempY = y, max = 0, min = 1;
        List<Integer> bigList = new ArrayList<>((x > y) ? nums(x) : nums(y));
        if ((x > y) ? bigList.contains(y) : bigList.contains(x)) {
            answer[0] = (x > y) ? y : x;
            answer[1] = (x > y) ? x : y;
        } else {
            for (int i = 1; i < x; i++) {
                if (tempX%i == 0 && tempY%i ==0) {
                    tempX /= i;
                    tempY /= i;
                    min *= i;
                    max = min * tempX * tempY;
                }
            }
            answer[0] = min;
            answer[1] = max;
        }
        return answer;
    }

    public static List<Integer> nums(int x) {
        List list = new ArrayList<>();
        for (int i = 1; i <= x / 2; i++) {
            if (x / i * i == x) list.add(i);
        }
        list.add(x);
        return list;
    }
}
