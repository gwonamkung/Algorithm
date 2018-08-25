package bruteforce.BF_2309;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] height = new int[10];

        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }

        Arrays.sort(height);

        boolean flag = false;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i != j && height[i] + height[j] == sum-100) {
                    height[i] = height[j] = 0;
                    flag = true;
                    break;
                }
            }
            if (flag) break;
        }

        for (int i = 1; i <= 9; i++) if (height[i] > 0) System.out.println(height[i]);
    }
}