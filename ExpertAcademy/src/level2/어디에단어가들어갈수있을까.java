package level2;

import java.util.Scanner;

public class 어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int test_case=0; test_case<n; test_case++) {
			int size = sc.nextInt();
			int len = sc.nextInt();
			int[][] arr = new int[size][size];
			for (int i=0; i<size; i++) {
				for (int j=0; j<size; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
		}
	}
}
