package day0910;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-20
 * Time: 15:21
 */
public class Demo14 {
    public static int getMax(String str) {
        if (str == null) {
            return 0;
        }
        String[] strs = str.split(",");
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            for (int j = 0; j < s.length(); j++) {
                list.add(s.charAt(j));
            }
        }
        Collections.sort(list);
        String ret = "";
        for (int i = list.size()-1; i >= 0; i--) {
            ret = ret + list.get(i);
        }
        return Integer.parseInt(ret);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            int ret = getMax(str);
            System.out.println(ret);
        }
    }
}
