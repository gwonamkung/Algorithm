package level1;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        System.out.println(solution("123123123"));
    }

    public static String solution(String phone_number) {
        int len = phone_number.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len - 4; i++) sb.append("*");
        sb.append(phone_number.substring(len-4));
        return sb.toString();
    }
}
