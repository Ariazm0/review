package day0910;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-13
 * Time: 15:41
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            if (str == null) {
                return;
            }
            int tmp = 0;

            for (int i = 1; i < str.length(); i++) {
                int count = 0;
                for (int j = 0; j < str.length() - i; j++) {
                    char ch1 = str.charAt(j);
                    char ch2 = str.charAt(j+i);
                    if (ch1 != ch2) {
                        count++;
                    }else {
                        count = 0;
                    }
                    if (tmp < count) {
                        tmp = count;
                    }
                }
            }
            System.out.println(tmp - 1);
        }
    }
}
