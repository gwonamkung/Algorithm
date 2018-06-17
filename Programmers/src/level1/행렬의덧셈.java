package level1;

public class 행렬의덧셈 {
    static int[][] r;
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        solution(arr1, arr2);
        for (int i=0; i<r.length; i++) {
            for (int j=0; j<r[i].length; j++) {
                System.out.println(r[i][j]);
            }
        }
    }
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        r = new int[arr1.length][arr1[1].length];
        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr1[i].length; j++) {
                r[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return r;
    }
}
