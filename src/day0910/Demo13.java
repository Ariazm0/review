package day0910;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-16
 * Time: 19:45
 */
public class Demo13 {
    public static String  swichChar(String str) {
        int i = 0;
        if (str == null) {
            return "0";
        }
        for (; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                break;
            }
        }
        str = str.substring(i);
        if (str == null) {
            return "0";
        }
        char ch = str.charAt(0);
        if ((ch < '0' || ch > '9') &&(ch != '-' && ch != '+')) {
            return "0";
        }
        StringBuilder builder = new StringBuilder();
        builder.append(str.charAt(0));
        for (int j = 1; j < str.length(); j++) {
            char s = str.charAt(j);
            if (s >='0' && s <='9') {
                builder.append(s);
            }else {
                break;
            }
        }
        String ret = builder.toString();
        return ret;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String ret = swichChar(str);
            System.out.println(ret);
        }
    }
}
