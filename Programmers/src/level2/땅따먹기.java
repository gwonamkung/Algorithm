package level2;

public class 땅따먹기 {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3,5}, {5,6,7,8}, {4,3,2,1000}};
//		[1,2,3,5],[5,6,7,8],[4,3,2,1]
		System.out.println(solution(arr));
	}
	
	public static int solution(int[][] land) {
		int max = 0;
		int[][] sum = new int[land.length][4];
		sum[0][0] = land[0][0];
		sum[0][1] = land[0][1];
		sum[0][2] = land[0][2];
		sum[0][3] = land[0][3];
		for(int i=1; i<land.length; i++) {
			sum[i][0] = Math.max(Math.max(sum[i-1][1], sum[i-1][2]), sum[i-1][3]) + land[i][0];
			sum[i][1] = Math.max(Math.max(sum[i-1][0], sum[i-1][2]), sum[i-1][3]) + land[i][1];
			sum[i][2] = Math.max(Math.max(sum[i-1][0], sum[i-1][1]), sum[i-1][3]) + land[i][2];
			sum[i][3] = Math.max(Math.max(sum[i-1][0], sum[i-1][1]), sum[i-1][2]) + land[i][3];
		}
		for(int i=0; i<4; i++) max = Math.max(max, sum[land.length-1][i]);
        return max;
    }
}
