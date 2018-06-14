package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(1223123123123215823L));
    }
    public static long solution(long n) {
        String a = "";
        List<Long> list = new ArrayList();
        while (true) {
            list.add(n%10);
            if (n<10) break;
            n /= 10;
        }
        Collections.sort(list, Comparator.reverseOrder());
        for(long items:list) a += String.valueOf(items);
        return Long.valueOf(a);
    }
}
