package day0910;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-20
 * Time: 20:33
 */
public class Demo15 {
    public static int min(String a, String b) {
        int count = 0;
        if (a == null || b == null) {
            return 0;
        }
        HashMap<Character,Integer> hashb = new HashMap();
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (hashb.containsKey(ch)) {
                hashb.put(ch,hashb.get(ch) + 1);
            }else {
                hashb.put(ch,1);
            }
        }
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (hashb.containsKey(ch)) {
                int tmp = hashb.get(ch);
                if (tmp == 0) {
                    continue;
                }
                hashb.put(ch,hashb.get(ch)-1);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String a = in.nextLine();
            String b = in.nextLine();
            int ret = min(a,b);
            System.out.println(ret);
        }
    }
}
