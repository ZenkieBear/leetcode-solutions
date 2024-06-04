package cn.zenkie.solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLISTest {

    private final LengthOfLIS solution = new LengthOfLIS();

    @Test
    public void lengthOfLIS() {
        System.out.println(solution.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(solution.lengthOfLIS(new int[]{0,1,0,3,2,3}));
        System.out.println(solution.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }

}