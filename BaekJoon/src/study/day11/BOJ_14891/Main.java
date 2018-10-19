package study.day11.BOJ_14891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int circle[][], move[], point[], answer;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        circle = new int[4][8];
        point = new int[4];

        for (int i = 0; i < 4; i++) {
            String str = in.readLine();

            for (int j = 0; j < 8; j++) {
                circle[i][j] = str.charAt(j) == '1' ? 1 : 0;
            }
        }

        int times = Integer.parseInt(in.readLine());

        for (int i = 1; i <= times; i++) {
            st = new StringTokenizer(in.readLine());
            int place = Integer.parseInt(st.nextToken()) - 1;
            int dir = Integer.parseInt(st.nextToken());

            move = new int[4];
            move[place] = dir;
            checkCircle(place);
            moveCircle();
        }

        System.out.println(getAnswer());
        in.close();
    }

    private static void checkCircle(int place) {
        int tempPlace = place;

        do {
            int idx = point[tempPlace] + 2;
            if (idx > 7) idx = (idx % 7) - 1;
            int right = circle[tempPlace][idx];

            tempPlace++;
            if (tempPlace > 3) break;

            idx =  point[tempPlace] + 6;
            if (idx > 7) idx = (idx % 7) - 1;
            int RLeft = circle[tempPlace][idx];

            if (move[tempPlace - 1] == 0) break;
            if (right != RLeft) move[tempPlace] = move[tempPlace - 1] * (-1);
        } while (tempPlace < 3);

        tempPlace = place;

        do {
            int idx =  point[tempPlace] + 6;
            if (idx > 7) idx = (idx % 7) - 1;
            int left = circle[tempPlace][idx];

            tempPlace--;
            if (tempPlace < 0) break;

            idx = point[tempPlace] + 2;
            if (idx > 7) idx = (idx % 7) - 1;
            int LRight = circle[tempPlace][idx];

            if (move[tempPlace + 1] == 0) break;
            if (left != LRight) move[tempPlace] = move[tempPlace + 1] * (-1);
        } while (tempPlace > 0);
    }

    private static void moveCircle() {
        for (int i = 0; i < 4; i++) {
            if (move[i] == 1) {
                point[i]--;

                if (point[i] == -1) point[i] = 7;
            } else if (move[i] == -1) {
                point[i]++;

                if (point[i] == 8) point[i] = 0;
            }
        }
    }

    private static int getAnswer() {
        for (int i = 0; i < 4; i++) {
            if (circle[i][point[i]] == 1) answer += (int) Math.pow(2, i);
        }

        return answer;
    }
}