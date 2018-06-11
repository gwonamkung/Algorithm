package level1;

import java.util.Calendar;
import java.util.Scanner;

class Cal_2016 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b) {
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a-1, b);
        int day = cal.get(Calendar.DAY_OF_WEEK);
        String answer = "";
        switch (day) {
            case 1:
                answer = "SUN";
                break;
            case 2:
                answer = "MON";
                break;
            case 3:
                answer = "TUE";
                break;
            case 4:
                answer = "WED";
                break;
            case 5:
                answer = "THU";
                break;
            case 6:
                answer = "FRI";
                break;
            case 7:
                answer = "SAT";
                break;
        }
        return answer;
    }
}