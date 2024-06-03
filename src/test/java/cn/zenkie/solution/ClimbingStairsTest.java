package cn.zenkie.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {

    private final ClimbingStairs solution = new ClimbingStairs();

    @Test
    public void climbStairs() {
        System.out.println(solution.climbStairs(45));
    }

    @Test
    public void climbStairsDP() {
        System.out.println(solution.climbStairsDP(45));
    }
}