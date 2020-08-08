package MapAndSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-08-08
 * Time: 22:36
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (Character ch: S.toCharArray()) {
            if (J.contains(ch+"")) {
                count++;
            }
        }
    return count;
    }
    public int singleNumber(int[] nums) {
        int ret = 0;
        for (Integer x: nums) {
            ret = ret^x;
        }
        return ret;
    }
}
