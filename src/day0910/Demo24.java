package day0910;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-10-10
 * Time: 19:24
 */
public class Demo24 {
    public static int reserch(String str,int n,String[] a) {
        if (str == null) {
            return 0;
        }
        if (n == 0) {
            return 0;
        }
        HashMap<String ,String> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            String[] sp = a[i].split("->");
            map.put(sp[0],sp[1]);
        }
        int count = 0;
        String tmp = str;
        while(map.get(str) != null ) {
            str = map.get(str);
            count++;
            if (str.equals(tmp)) {
                count--;
                break;
            }

        }
        return count-1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            int n = in.nextInt();
            String[] a = new String[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.next();
            }
            int ret = reserch(str,n,a);
            System.out.println(ret);
        }
    }
}
