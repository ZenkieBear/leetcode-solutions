package cn.zenkie.solution;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Solution for LeetCode-300: Length of Longest Increasing Subsequence
 */
public class LengthOfLIS {

    /**
     * Dynamic Programming solution
     */
    public int lengthOfLIS(int[] nums) {
        // f(0) = 0
        // f(1) = 1
        if (nums.length <= 1) {
            return nums.length;
        }

        int[] dp = new int[nums.length];
        int res = 1;

        // Travel the array
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    // Because there could be multi-subsequences, we choose the longer one.
                    // .e.g [7,8,2,3,5,10] has [7,8,10] and [2,3,5,10]
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            // Refresh the longest length
            res = Math.max(res, dp[i]);
        }

        return res;
    }

}
