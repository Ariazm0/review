package day0910;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-13
 * Time: 15:18
 */
public class Demo4 {
    public static int findNum(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i])+1);
            } else {
                map.put(nums[i],1);
            }
        }
        int tmp = 0;
        int ret = 0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (tmp < entry.getValue()) {
                tmp = entry.getValue();
                ret = entry.getKey();
            }
        }
        if (tmp <= nums.length/2) {
            return 0;
        }

        return ret;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();
            }
            int ret = findNum(nums);
            System.out.println(ret);
        }
    }
}
