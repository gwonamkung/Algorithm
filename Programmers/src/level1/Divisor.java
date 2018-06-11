package level1;

import java.util.*;

class Divisor {
    public static void main(String[] args) {
        int[] arr = {2,10,1,5,7,128,56,121};
        for (int items:solution(arr,1)) System.out.println(items);
    }

    public static int[] solution(int[] arr, int divisor) {
        int length = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray().length;
        if ( length == 0) {
            int[] r = new int[1];
            Arrays.fill(r, -1);
            return r;
        } else if (length == arr.length) {
            Arrays.sort(arr);
            return arr;
        } else {
            return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        }
    }
}
