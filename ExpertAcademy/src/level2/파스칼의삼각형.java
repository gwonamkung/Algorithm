package level2;

import java.util.Scanner;

class 파스칼의삼각형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int test_case=1; test_case<=n; test_case++) {
			int x = sc.nextInt();
			int[][] val = new int[x][x];
			val[0][0] = 1;
			if (x>1) {
				val[1][0] = 1;
				val[1][1] = 1;
			}
			if (x>2) {
				for(int j=2; j<x; j++) {
					val[j][0] = 1;
					for(int k=1; k<=j; k++) {
						if (k==j) {
							val[j][k] = 1;
							break;
						}
						val[j][k] = val[j-1][k-1] + val[j-1][k];
					}
				}
			}
			System.out.println("#"+test_case);
			for(int l=0; l<val.length; l++) {
				for (int m=0; m<val[l].length; m++) {
					if (val[l][m] != 0) System.out.print(val[l][m] + " ");
					else break;
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
