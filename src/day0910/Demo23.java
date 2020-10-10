package day0910;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-10-10
 * Time: 19:05
 */
public class Demo23 {
    public static int numOf(int n,int k) {
        if (n == 0) {
            return 0;
        }
        if (n < k) {
            return 0;
        }
        int x = 0;
        int count = 1;
        while (k > x) {
            n = n-1;
            if (n != 0) {
                count++;
            }
            x = 0;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int k = in.nextInt();
            int ret = numOf(n,k);
            System.out.println(ret);
        }
    }
}
