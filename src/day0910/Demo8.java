package day0910;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-14
 * Time: 20:58
 */
public class Demo8 {
    public static int findMax(String money) {
        int max = 0;
        money = money.substring(1,money.length()-1);
        String[] strs = money.split(",");
        int[] m = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            m[i] = Integer.parseInt(strs[i]);
        }
        if (money.length() <= 5) {
            for (int x: m) {
                max += x;
            }
        }
        int start = 0;
        int end = m.length-1;
        for (int i = 0; i < 6; i++) {
            if (m[start] < m[end]) {
                max += m[end];
                end--;
            }else {
                max += m[start];
                start++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String money = in.nextLine();
            int ret = findMax(money);
            System.out.println(ret);
        }
    }
}
