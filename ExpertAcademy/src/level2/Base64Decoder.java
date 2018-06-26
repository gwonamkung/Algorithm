package level2;

import java.util.Base64;
import java.util.Scanner;

public class Base64Decoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Base64.Decoder decoder = Base64.getDecoder();
        for (int tcase=1;tcase<=t;tcase++) {
            String str = sc.next();
            System.out.println("#"+tcase+" "+new String(decoder.decode(str)));
        }
    }
}
