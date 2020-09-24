package day0801;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-24
 * Time: 13:09
 */
public class Demo {
    public static int find(int[] arr,int k) {
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while(left <= right) {
            mid = (left+right)/2;
            if (arr[mid] < k) {
                left = mid + 1;
            } else if (arr[mid] > k) {
                right = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,10,11};
        int ret = find(arr,6);
        System.out.println(ret);
    }
}
