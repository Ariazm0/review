package day0910;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-15
 * Time: 14:52
 */
public class Demo9 {
    public static void main(String[] args) {
        Demo9 demo9 = new Demo9();
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        arr = demo9.pushIntArray(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public int[] pushIntArray (int[] arr, int pushOffset) {
        // write code here
        Stack<Integer> stack = new Stack<>();
        Deque<Integer> deque1 = new LinkedList<>();
        for (int i = 0; i < pushOffset; i++) {
            stack.add(arr[arr.length-i-1]);
        }
        for (int i = 0; i < arr.length-pushOffset; i++) {
            deque1.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                if (deque1.isEmpty()) {
                    break;
                }
                arr[i] = deque1.poll();
            } else {
                arr[i] = stack.pop();
            }
        }
        return arr;
    }
}
