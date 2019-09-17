package com.hx.test.basicSort;

public class Insertsort {
    public static void main(String[] args) {
        int[] demo = {6, 3, 5, 7, 1, 8, 9 };
        int[] result = sort(demo);
        for (int i:result){
            System.out.println(i);
        }
    }
    public static int[] sort(int[] arr) {
        if (arr.length==0||arr==null) return null;

        for(int i=0;i<arr.length;++i){
            int cur=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>cur){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=cur;
        }
        return arr;
    }

}
