package level2;

import java.util.Scanner;

public class 새로운불면증치료법 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            int val = sc.nextInt();
            int[] arr = new int[10];
            boolean end = false;
            int index;
            int i = 1;
            while (!end) {
                index = val % 10;
                arr[index]++;
                if (val > 10) {
                    int temp = val;
                    while (true) {
                        temp /= 10;
                        index = temp % 10;
                        arr[index]++;
                        if (temp < 10) break;
                    }
                }
                for (int in = 0; in < 10; in++) {
                    if (arr[in] == 0) {
                        val = val / i * (i + 1);
                        i++;
                        break;
                    }
                    if (in == 9) end = true;
                }
            }
            if (end) System.out.println("#" + tcase + " " + val);
        }
        sc.close();
    }
}
