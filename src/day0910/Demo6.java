package day0910;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-14
 * Time: 20:22
 */
public class Demo6 {
    public static void  findTimes(String str) {
        if (str == null) {
            return;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i),1);
            }
        }
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            System.out.print(entry.getKey()+ "=" + entry.getValue()+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            findTimes(str);
        }
    }
}
