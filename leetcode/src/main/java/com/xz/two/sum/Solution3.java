package com.xz.two.sum;

import java.util.Arrays;

public class Solution3 {

    /**
     * 切割点满足 i+j = k （即i+j = m+n+1-i-j）
     * 默认 i=(m+1)/2, j=k-i
     * 数值满足条件： A[i-] < B[j] && A[i] > B[j-1]
     * 分情况讨论
     * 1） n=i=0 直接返回 (double) (B[m/2]+B[(m+1)/2]) /2
     * 2)  判断是否满足数值条件
     * 3） 满足条件，偶数返回 ( max{A[i-1],B[i-1]} + min{A[i],B[i]} )/2
     * 奇数返回  max{A[i-1],B[i-1]}
     * 4)  不满足数值条件移 切割点
     * 1.  如果  A[i-1] > B[j]   i-- , j=k-i
     * 如果i>0    执行步骤（2）
     * 如果i<=0  奇数取 B[j-1] 偶数取 (double) (B[j-1]+B[j]) /2
     * 2.  如果  A[i] < B[j-1]   i=i+1  j=k-i
     * 如果i>n  奇数取 B[j-1] 偶数取 (double) (B[j-1]+B[j]) /2
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0d;
        // 保证m<n
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;

        if (nums1.length == 0) {
            return n % 2 == 0 ? ((double) (nums2[n / 2] + nums2[(n / 2 - 1)])) / 2 : nums2[n / 2];
        }
        if (m == n && m == 1) {
            return ((double) (nums1[0] + nums2[0])) / 2;
        }
        // 默认切割点 k = (m+n+1)/2, m+n可能会导致int类型溢出，可以写成 m+(n-m+1)/2
        int k = m + (n - m + 1) / 2;
        int i = (m + 1) / 2;
        int j = k - i;
        boolean odd = (m % 2 + n % 2) % 2 == 0 ? true : false;
        if (nums1[i - 1] > nums2[j]) {
            while (nums1[i - 1] > nums2[j]) {
                if (i - 1 == 0) {
                    if (odd) {
                        if(j+1<n){
                            return (double) (Math.min(nums1[i - 1],nums2[j+1]) + nums2[j]) / 2;
                        }else{
                            return ((double) (nums1[i - 1]+ nums2[j]))/ 2;
                        }
                    } else {
                        return (double) nums2[j];
                    }
                } else {
                    i--;
                    j++;
                }
            }
        } else if ( i<m && nums1[i] < nums2[j - 1]) {
            while (nums1[i] < nums2[j - 1]) {
                if (i + 1 < m) {
                    i++;
                    j--;
                } else if(i+1==m) {
                    if(odd) {
                        if(j-2>=0){
                            return (double) (Math.max(nums1[i],nums2[j-2]) + nums2[j-1]) / 2;
                        }else{
                            return ((double) (nums1[i]+ nums2[j-1]))/ 2;
                        }
                    } else {
                        return Math.max(nums2[j-2],nums1[i]);
                    }
                }
            }
        }
        if (odd) {
            if (i < m) {
                result = ((double) (Math.max(nums1[i - 1], nums2[j - 1]) + Math.min(nums1[i], nums2[j]))) / 2;
            } else {
                result = ((double) (Math.max(nums1[i - 1], nums2[j - 1]) + nums2[j])) / 2;
            }
        } else {
            result = Math.max(nums1[i - 1], nums2[j - 1]);
        }
        return result;
    }
}
