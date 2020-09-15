package day0910;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-15
 * Time: 15:41
 */
public class Demo10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Demo10 demo10 = new Demo10();
        while (in.hasNext()) {
            String ret = in.nextLine();
            System.out.println(demo10.sort(ret));
        }
    }
    public int sort (String inData) {
        // write code here
        if (inData.length() == 0) {
            return 0;
        }
        String[] strings = inData.split(" ");
        int[] arr = new int[strings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flg = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg = false;
                    count++;
                }
            }
            if (flg) {
                break;
            }
        }
        return count;
    }
}
