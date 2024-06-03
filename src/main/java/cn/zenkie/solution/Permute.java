package cn.zenkie.solution;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The solution for leetcode-46 permutations
 */
public class Permute {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res, dst = new LinkedList<>();
        List<Integer> numList = arrayToList(nums);

        // Return condition
        if (nums.length <= 1) {
            dst.add(numList);
            return dst;
        }

        for (int i = 0; i < nums.length; i++) {
            // The element picked
            int num = nums[i];

            // Copy other elements to an independence set
            int[] set = new int[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                if (j == i) continue;
                if (j < i) set[j] = nums[j];
                else set[j - 1] = nums[j];
            }

            // Recursive
            res = permute(set);

            // Concat num and results
            for (int j = 0; j < res.size(); j++) {
                List<Integer> subPermute = res.get(j);
                subPermute.add(num);
                dst.add(subPermute);
            }
        }

        return dst;
    }

    public List<Integer> arrayToList(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
}
