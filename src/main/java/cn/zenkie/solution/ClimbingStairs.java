package cn.zenkie.solution;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    private final Map<Integer, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        }

        return memo.get(n);
    }

    /**
     * Dynamic Programming Situation
     * @param n Steps
     * @return How many distinct ways can be climbed to the top.
     */
    public int climbStairsDP(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int temp = 0, a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }

        return temp;
    }
}
