package day0910;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-10-10
 * Time: 19:56
 */
public class Demo25 {
    public static String parse(String str,int n, String dir) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' && str.charAt(str.length()-i) == '}') {
                count++;
            }
            stack.push(str.charAt(i));
        }
        if (n == 0){
            return str.substring(count+1,str.length()-count);
        }
        String[] strings = dir.split("->");
        HashMap<String,String> map = new HashMap<>();
        map.put(strings[0],strings[1]);
        return null;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            int n = in.nextInt();
            String dir = in.nextLine();
            String ret = parse(str,n,dir);
            System.out.println(ret);
        }

    }
}
