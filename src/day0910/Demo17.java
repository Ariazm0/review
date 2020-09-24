package day0910;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-22
 * Time: 19:58
 */
public class Demo17 {
    public int thirdMax (int[] nums) {
        // write code here
        if (nums.length < 3) {
            return nums[nums.length-1];
        }
        Arrays.sort(nums);
        int count = 0;
        int i = nums.length-1;
        for (; i > 0; i--) {
            if (nums[i] > nums[i-1]) {
                count++;
                if (count == 3) {
                    break;
                }
            }
        }
        if (count == 3) {
            return nums[i];
        } else {
            return nums[nums.length-1];
        }
    }
    public int maxSubArray (int[] nums) {
        // write code here
        if (nums.length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = 0;
            for (int j = i; j < nums.length; j++) {
                tmp = tmp + nums[j];
                if (tmp > max) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Demo17 demo17 = new Demo17();
        int[] arr = new int[]{1,1,1,1,1};
        int ret = demo17.thirdMax(arr);
        System.out.println(ret);
    }
}
