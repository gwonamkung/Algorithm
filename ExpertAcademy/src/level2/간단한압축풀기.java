package level2;

import java.util.Scanner;

public class 간단한압축풀기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t=1; t<=T; t++) {
            int n = sc.nextInt();
            int cnt = 0;
            System.out.println("#"+t);
            for (int i=0;i<n;i++) {
                char a = sc.next().charAt(0);
                int c = sc.nextInt();
                for (int j=0; j<c; j++) {
                    System.out.print(a);
                    cnt ++;
                    if (cnt == 10) {
                        System.out.println();
                        cnt = 0;
                    }
                }
            }
            System.out.println();
        }
    }
}
