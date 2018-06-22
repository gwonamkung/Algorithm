package level2;

import java.util.Scanner;

public class 파리퇴치 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int test_case=0; test_case<n; test_case++) {
			int size = sc.nextInt();
			int answerSize = sc.nextInt();
			int[][] arr = new int[size][size];
			for (int i=0; i<size; i++) {
				for(int j=0; j<size; j++) arr[i][j] = sc.nextInt();
			}
			int sum = 0;
			int max = 0;
			for (int i=0; i<=size-answerSize; i++) {
				for(int j=0; j<=size-answerSize; j++) {
					sum += arr[i][j];
					System.out.println("for sum: " + sum);
				}
			}
			System.out.println("sum: " + sum);
			System.out.println("max: " + max);
			max = Math.max(max, sum);
//			System.out.println("#"+test_case+1+" "+max);
			sum = 0; max = 0;
		}
	}
}
