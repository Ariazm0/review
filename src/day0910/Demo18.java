package day0910;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-23
 * Time: 20:19
 */
public class Demo18 {
    public static int  num(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return num(n-1) + num(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) {
                System.out.println(0);
                return;
            }
            int ret = num(n);
            System.out.println(ret);
        }
    }
}
