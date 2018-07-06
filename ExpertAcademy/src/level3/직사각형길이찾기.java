package level3;

import java.util.Scanner;

public class 직사각형길이찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            int[] arr = new int[101];
            int o1, o2, o3;
            o1 = sc.nextInt();
            o2 = sc.nextInt();
            o3 = sc.nextInt();
            arr[o1]++;
            arr[o2]++;
            arr[o3]++;
            if (arr[o1] == 1 || arr[o1] == 3) System.out.println("#" + tcase + " " + o1);
            else if (arr[o2] == 1) System.out.println("#" + tcase + " " + o2);
            else if (arr[o3] == 1) System.out.println("#" + tcase + " " + o3);
        }
    }
}
