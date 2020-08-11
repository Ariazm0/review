package day0801;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Ariazm
 * Date: 2020-08-07
 * Time: 16:12
 */
public class MySort {
    //交换
    public static void swap(int[] array,int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    //插入排序
    public static int[] insertSort (int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            for (;  j>= 0 && tmp < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = tmp;
        }
        return array;
    }
    //选择排序
    public static int[] selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    swap(array,i,j);
                }
            }
        }
        return array;
    }

    //冒泡排序
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array,j,j+1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        return array;
    }
    //快速排序
    public static int[] quickSort(int[] array) {
        quickSortHelper(array,0,array.length-1);
        return array;
    }
    public static void quickSortHelper(int[] array,int left,int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = partition(array,left,right);
        quickSortHelper(array,left,pivotIndex-1);
        quickSortHelper(array,pivotIndex+1,right);
    }
    public static int partition(int[] array,int left,int right) {
        int base = array[right];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && array[i] <= base) {
                i++;
            }
            while (i < j && array[j] >= base) {
                j--;
            }
            if (i < j) {
                swap(array,i,j);
            }
        }
        swap(array,i,right);
        return i;

    }

    public static int[] heapSort(int[] array) {
        create(array);
        for (int i = 0; i <= array.length - 1; i++) {
            swap(array,0,array.length-1-i);
            shiftDown(array,array.length-1-i,0);
        }
        return array;
    }

    public static void create(int[] array) {
        for (int i = (array.length - 1 - 1)/2; i >= 0; i--) {
            shiftDown(array,array.length,i);
        }
    }
    public static void shiftDown(int[] array,int size,int index) {
        int parent = index;
        int child = parent*2 + 1;
        while (child < size) {
            if (child + 1 < size && array[child + 1] > array[child]) {
                child = child + 1;
            }
            if (array[parent] < array[child]) {
                swap(array,parent,child);
            }else {
                break;
            }
            parent = child;
            child = parent*2 + 1;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{9,5,2,7,4,6,3,8,1};
        int[] ret = heapSort(array);
        System.out.println(Arrays.toString(ret));
    }

}
