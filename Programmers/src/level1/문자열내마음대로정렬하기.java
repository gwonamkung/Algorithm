package level1;


import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        for (String items : solution(strings, 2)) System.out.println(items);
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
                if ((int) o1.charAt(n) > o2.charAt(n)) return 1;
                else if ((int) o1.charAt(n) < o2.charAt(n)) return -1;
                return o1.compareTo(o2);
        });
        return strings;
    }
}
