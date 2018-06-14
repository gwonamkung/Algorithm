package level1;

import java.util.ArrayList;
import java.util.List;

public class 최대공약수최소공배수 {
    static int[] answer = new int[2];

    public static void main(String[] args) {
        solution(3, 1);
        for (int items : answer) System.out.print(items + " ");
    }

    public static int[] solution(int x, int y) {
        List<Integer> bigList = new ArrayList<>((x > y) ? nums(x) : nums(y));
        List<Integer> smallList = new ArrayList<>((x < y) ? nums(x) : nums(y));
        if ((x > y) ? bigList.contains(y) : bigList.contains(x)) {
            answer[0] = (x > y) ? y : x;
            answer[1] = (x > y) ? x : y;
        } else {
            for (int i = bigList.size() - 1; i >= 0; i--) {
                System.out.println("big: " + bigList.get(i));
                for (int j = smallList.size() - 1; j >= 0; j--) {
                    if(bigList.get(i) == smallList.get(j)) if (bigList.get(i) > answer[0]) answer[0] = bigList.get(i);
                }
            }
            for (int i=1; i<=x*y; i++) {
                if (nums(i).contains(x) && nums(i).contains(y)) {
                    answer[1] = i;
                    break;
                }
            }
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
