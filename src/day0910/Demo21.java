package day0910;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-26
 * Time: 11:07
 */
public class Demo21 {
    static int maxsumofSubarray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int count = arr[0];
        int max = count;
        for (int i = 1; i < arr.length; i++) {
            if(count >= 0) {
                count += arr[i];
            } else {
                count = arr[i];
            }
            if (max < count) {
                max = count;
            }
        }
        return max;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String inputStr = null;
            inputStr = cin.next();

        int res;
        if(inputStr == null || "".equals(inputStr)) {
            res = maxsumofSubarray(null);
        } else {
            String[] split = inputStr.split(",");
            int[] inputInt = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                inputInt[i] = Integer.parseInt(split[i]);
            }
            res = maxsumofSubarray(inputInt);
        }

        System.out.println(res);
    }
}
