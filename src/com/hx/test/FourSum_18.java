package com.hx.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//和18题的三数之和基本类似
public class FourSum_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();
        if (nums != null && nums.length > 2)
        {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 3; )
            {
                for (int j = i + 1; j < nums.length - 2; )
                {
                    int k = j + 1;
                    int m = nums.length - 1;
                    while (k < m)
                    {
                        if (nums[k] + nums[m] + nums[j] + nums[i] == target)
                        {
                            List<Integer> list = new ArrayList<>(4);
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[m]);
                            result.add(list);
                            k++;
                            m--;
                            while (k < m && nums[m] == nums[m + 1])
                            {
                                m--;
                            }
                            while (k < m && nums[k] == nums[k - 1])
                            {
                                k++;
                            }
                        }
                        else if (nums[k] + nums[m] + nums[j] + nums[i] < target)
                        {
                            k++;
                            while (k < m && nums[k] == nums[k - 1])
                            {
                                k++;
                            }
                        }
                        else
                        {
                            m--;
                            while (k < m && nums[m] == nums[m + 1])
                            {
                                m--;
                            }
                        }
                    }
                    j++;
                    while (j < nums.length - 2 && nums[j] == nums[j - 1])
                    {
                        j++;
                    }
                }
                i++;
                while (i < nums.length - 2 && nums[i] == nums[i - 1])
                {
                    i++;
                }
            }

        }
        return result;
    }
}