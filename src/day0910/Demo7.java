package day0910;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-14
 * Time: 20:30
 */
public class Demo7 {
    public static String findMax(String str) {
        int count = 0;
        int max = 0;
        String ret = "";
        HashMap<Integer,String> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '5' && ch <= '8') {
                count++;
                ret = ret + ch;
                if (max < count) {
                    max = count;
                }
                map.put(count,ret);
            } else {
                count = 0;
                ret = "";
            }
        }
        int tmp = 0;
        for (Map.Entry<Integer,String> entry: map.entrySet()) {
            if (tmp < entry.getKey()) {
                tmp = entry.getKey();
            }
        }
        return map.get(tmp);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            String ret = findMax(str);
            System.out.println(ret);
        }  
    }
}
