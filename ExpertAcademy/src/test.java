import java.math.BigDecimal;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tcase=1; tcase<=t; tcase++) {
            BigDecimal a = new BigDecimal(sc.next());
            BigDecimal b = new BigDecimal(sc.next());
            System.out.println("#"+tcase+" "+a.add(b));
        }
    }
}
