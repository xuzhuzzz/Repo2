package com.xz.towSum;

import com.xz.two.sum.Solution3;
import org.junit.Test;

public class Solution3Test {

    @Test
    public void testSolution3(){
        int [] nums2 = {1,3};
        int [] nums1 = {2,7};
        Solution3 s3 = new Solution3();
        double result = s3.findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }
}
