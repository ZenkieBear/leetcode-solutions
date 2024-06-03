package cn.zenkie.solution;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DistributeCandies2Test {

    private final DistributeCandies2 solution = new DistributeCandies2();

    @Test
    public void distributeCandies() {
        System.out.println(Arrays.toString(solution.distributeCandies(7, 4)));
        System.out.println(Arrays.toString(solution.distributeCandies(10, 4)));
        System.out.println(Arrays.toString(solution.distributeCandies(20, 4)));
    }
}