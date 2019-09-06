package com.hx.test.basicSort;

/**
 * @param
 * @Author huxing
 * @Description 冒泡排序
 * @Date 9:40 2019/9/3
 * @return
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] demo = {6, 5, 9, 2, 4, 1, 0};
//        int[] demo = {0,1,2,3,4,5,6,7};
        int[] results = sortSkip(demo);

        for (int result : results)
        {
            System.out.println(result);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static int[] sortShort(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        int n = arr.length;
        for (int i = n - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
        return arr;
    }

    public static int[] sortEarlyReturn(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        int n = arr.length;
        boolean swapped;
        for (int end = n - 1; end > 0; --end)
        {
            swapped = false;
            for (int i = 0; i < end; ++i)
            {
                if (arr[i] > arr[i + 1])
                {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) return null;
        }
        return arr;
    }

    public static int[] sortSkip(int[] arr) {
        int n = arr.length;
        if (n == 0 || arr == null) return null;

        int newEnd;
        for (int end = n - 1; end > 0; )
        {
            newEnd = 0;
            for (int i = 0; i < end; ++i)
            {
                if (arr[i] > arr[i + 1])
                {
                    swap(arr, i, i + 1);
                    newEnd = i;
                }
            }
            end = newEnd;
        }
        return arr;
    }
}
