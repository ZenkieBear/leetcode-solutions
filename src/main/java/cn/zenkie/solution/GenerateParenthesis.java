package cn.zenkie.solution;

import java.util.LinkedList;
import java.util.List;

/**
 * Solution for leetcode-22: Generate Parenthesis
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> res = new LinkedList<>();
        backtrack("", res, n, n);
        return res;
    }

    public void backtrack(String sublist, List<String> res, int left, int right) {
        // Backtrack
        if (left == 0 && right == 0) {
            res.add(sublist);
        }

        // Invalid situation
        if (left > right) return;

        if (left > 0) backtrack(sublist + "(", res, left - 1, right);
        if (right > 0) backtrack(sublist + ")", res, left, right - 1);
    }

}
