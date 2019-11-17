package com.hx.test.basicSort;

/**
 * @author
 * @description 选择排序
 * @date
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 3, 4, 2, 5, 8};
        int[] results = endSort(arr);
        for (int result : results) {
            System.out.println(result);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        if (i == j) return;
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    public static int[] sort(int[] arr) {
        if (arr.length == 0 || arr == null) {
            return null;
        }
        int n = arr.length;

        for (int j = 0; j < n; ++j) {
            //minvalue的作用是每一轮的遍历直到最后确定了最小值才进行swap操作，否则只用进行遍历就可以了
            //记得swap要在第一层for循环中，而不能是在第二层for 循环中
            int minValue = j;
            for (int i = j + 1; i < n; ++i) {
                if (arr[i] < arr[minValue]) {
                    minValue = i;
                }
            }
            swap(arr, j, minValue);
        }

        return arr;
    }

    public static int[] endSort(int[] arr){
        if (arr.length==0||arr==null) return null;

        int n=arr.length;
        for (int j=n-1;j>=0;--j){
            int maxValue=j;
            for (int i=0;i<j;++i){
                if (arr[i]>arr[maxValue]){
                    maxValue=i;
                }
            }
            swap(arr,j,maxValue);
        }
        return arr;
    }

}
