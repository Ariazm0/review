package day0910;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-29
 * Time: 21:00
 */
public class Demo22 {
    public static int result(long n) {
        int tmp = 0;
        if (n < 5) {
            return 0;
        }
        for (int i = 5; i <= n; i += 5) {
                tmp++;
        }
        return tmp;
    }
    public static long re(long n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * re(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            long n = in.nextLong();
            int ret = result(n);
            long re = re(n);
            System.out.println(ret);
            System.out.println(re);
        }
    }
}
