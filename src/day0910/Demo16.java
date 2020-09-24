package day0910;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-20
 * Time: 21:15
 */
public class Demo16 {
    public static boolean time(String[] strs) {
        int j = 0;
        for (int i = 3; i < strs.length; i += 3) {
            j = i;
        }
        for (int i = 0; i < strs.length; i++) {
            int count = 3;
            for (int k = 1; k <strs.length ; k++) {
                for (int l = 0; l < 3; l++) {
                    char ch = strs[i].charAt(l);
                    char ch2 = strs[k].charAt(l);
                    if (ch == ch2) {
                        count--;
                        if (count >= 2) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = in.nextLine();
            }
            boolean b = time(strings);
            System.out.println(b);
        }
    }
}
