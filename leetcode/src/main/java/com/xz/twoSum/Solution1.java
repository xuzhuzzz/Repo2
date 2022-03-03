package com.xz.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            //
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(target-nums[i])){
                    return new int[]{map.get(target - nums[i]), i};
                }
                map.put(nums[i],i);
            }
            short s = '\u0000';
            throw new RuntimeException("cannot find two numbers");
        }
}
