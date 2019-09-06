package com.hx.test.basicSort;

/**
 * @param
 * @Author huxing
 * @Description 鸡尾酒排序
 * @Date 10:27 2019/9/5
 * @return
 **/
public class CocktailSort {
    public static void main(String[] args) {
        int[] demo = {6, 3, 5, 7, 1, 8, 9 };
        int[] result = sortSkip(demo);
        for (int i:result){
            System.out.println(i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    public static int[] sort(int[] arr) {
        if (arr.length == 0 || arr == null) return null;
        int left=0,right=arr.length-1;
        while (left<right)
        {
            for (int i = left; i < right; ++i)
            {
                if (arr[i + 1] < arr[i])
                {
                    swap(arr, i, i + 1);
                }
            }
            --right;
            for (int j = right; j > left; --j)
            {
                if (arr[j - 1] > arr[j])
                {
                    swap(arr, j - 1, j);
                }
            }
            ++left;
        }
        return arr;
    }

    public static int[] sortEarlyReturn(int[] arr) {
        if (arr.length == 0 || arr == null) return null;
        int left=0,right=arr.length-1;
        boolean swapped;
        while (left<right)
        {
            swapped=false;
            for (int i = left; i < right; ++i)
            {
                if (arr[i + 1] < arr[i])
                {
                    swap(arr, i, i + 1);
                    swapped=true;
                }
            }
            --right;
            for (int j = right; j > left; --j)
            {
                if (arr[j - 1] > arr[j])
                {
                    swap(arr, j - 1, j);
                    swapped=true;
                }
            }
            ++left;
            if (!swapped){
                return arr;
            }
        }
        return arr;
    }

    //缩短排序的数量，要是从左往右排序的时候，右边最后连续的几个没有做swap，就证明它是有序的，便不需要再排序了
    public static int[] sortSkip(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        int left = 0, right = arr.length - 1;
        int newLeft, newRight;

        while (left < right) {
            newRight = left;
            for (int i = left; i < right; ++i) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                    newRight = i;
                }
            }
            right = newRight;

            newLeft = right;
            for (int i = right; i > left; --i) {
                if (arr[i-1] > arr[i]) {
                    swap(arr, i-1, i);
                    newLeft = i;
                }
            }
            left = newLeft;
        }
        return arr;
    }

}
