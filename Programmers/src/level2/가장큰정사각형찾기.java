package level2;

import java.util.Arrays;

public class 가장큰정사각형찾기 {
    static int[][] arr;
    public static void main(String[] args) {
//        int[][] arr = {{0, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {0, 0, 1, 0}};
        int[][] arr = {{0, 0, 1, 1}, {1,1,0,1}};
        System.out.println(solution(arr));
    }

    public static int solution(int[][] board) {
        int answer = 0;
        int oneCnt = 0;
        int rowCnt = 0;
        int max = 0;
        int[] arrCnt = new int[board.length];
        String[] start = new String[board.length];
        Arrays.fill(start, "a");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    oneCnt++;
                    if (start[i].equals("a")) start[i] = String.valueOf(j);
                }
                if (j + 1 == board[i].length && max < oneCnt) max = oneCnt;
            }
            arrCnt[i] = oneCnt;
            oneCnt = 0;
        }
        int i = 0;
        while (max != rowCnt) {
            System.out.println("i: " + i);
            System.out.println("max: " + max);
            System.out.println("rowCnt: " + rowCnt);

            if (arrCnt[i] >= max) {
                System.out.println("!@!@!#@!@#!#@");
                if (rowCnt == 0) {
                    rowCnt++;
                    System.out.println("0000rowCnt: " + rowCnt);
                } else if (arrCnt[i - 1] >= max && arrCnt[i] >= max) {
                    if (arrCnt[i-1] == max || arrCnt[i] == max) {
                        if (!start[i-1].equals("a") && start[i-1].equals(start[i])) rowCnt++;
                        else if (arrCnt[i-1] < arrCnt[i])
                    } else rowCnt++;
                    System.out.println("++++++rowCnt: " + rowCnt);
                }

            }
            if (max == rowCnt) {
                answer = max * max;
                break;
            }
            i++;
            if (i == board.length) {
                max -= 1;
                rowCnt = 0;
                i = 0;
                System.out.println("ASASDDAS");
            }


        }
        return answer;
    }
}
