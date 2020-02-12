package com.hx.test.leetcodeTopic;

/**
 * @author
 * @description 加一
 * @date
 */
public class PlusOne_66 {

    private static int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] temp=new int[digits.length+1];
        temp[0] =1;
        return temp;
    }

    public static void main(String[] args) {
        int[] a={0};
        int[] result=plusOne(a);
        for (int num: result) {
            System.out.println(num);
        }
    }

}
