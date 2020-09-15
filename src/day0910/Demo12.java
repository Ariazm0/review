package day0910;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-09-15
 * Time: 19:37
 */
public class Demo12 {
    static int[] primeFactorization(int num,int[] s,int[] sizes) {
        int[] ret = new int[50];
        int size = 0;
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                primeFactorization(num % i ,s,sizes);
            } else {
                ret[size] = i;
                s[sizes[0]] = i;
                sizes[0]++;
                size++;
                ret[size] = num/i;
                sizes[0]++;
                s[sizes[0]] = num/i;
                size++;
            }
        }
        if (ret[0] == 0) {
            ret[0] = num;
            return ret;
        }
        return ret;
    }
    /******************************结束写代码******************************/
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;
        int _num;
        _num = Integer.parseInt(in.nextLine().trim());
        int[] s = new int[100];
        int[] size = new int[1];
        Arrays.sort(s);
        res = primeFactorization(_num,s,size);
        for(int res_i=0; res_i < size[0]; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }
    }
}
