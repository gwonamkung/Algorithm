package SWExpert_1206;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    private static int Answer, maxDummy_left, maxDummy_right;

    public static void main(String args[]) throws Exception {
//      String filename= "C:/Users/SANGWOO/IotProgramming/EclipseProjects/CodingTest/src/SWExpert_1206/input.txt";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      BufferedReader br = new BufferedReader(new FileReader(filename));

        for (int test_case = 1; test_case <= 10; test_case++) {
            int n = Integer.parseInt(br.readLine());   // 가로의 길이, 맨좌측과 맨우측 2칸은 0
            int[] h = new int[n];
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());

            int i = 0;
            while (tokenizer.hasMoreTokens()) {
                h[i] = Integer.parseInt(tokenizer.nextToken());
                i++;
            }

            Answer = 0;

            for (int j = 2; j < n - 2; j++) {
                // 1. 조망권 확인. 왼쪽, 오른쪽 1-2칸에 있는 빌딩이 h[i]보다 크면 조망권은 0
                if (h[j - 1] > h[j] || h[j - 2] > h[j] || h[j] < h[j + 1] || h[j] < h[j + 2]) {
                    continue;
                }
                // 2. 왼쪽 빌딩 2개, 오른쪽 빌딩 2개 중 가장 높은 빌딩 위로 조망권이 확보가 된다.
                else {
                    // 2.1 h[i]를 기준으로 왼쪽2개, 오른쪽 2개 빌딩의 높이의 최대값을 찾자.
                    maxDummy_left = Math.max(h[j - 1], h[j - 2]);
                    maxDummy_right = Math.max(h[j + 1], h[j + 2]);
                    // 2.2 선택된 빌딩에서 좌,우 빌딩중 가장 높은 빌딩을 빼면 조망권을 확보한 세대 수가 나옴.
                    Answer += h[j] - Math.max(maxDummy_left, maxDummy_right);
                }
            }
            System.out.println("#" + test_case + " " + Answer);
        }

    }
}