package cn.zenkie.solution;

/**
 * Solution for leetcode-1103: Distribute Candies to People
 */
public class DistributeCandies2 {

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];

        distribute(candies, result, 1, 0);
        return result;
    }

    private void distribute(int candies, int[] result, int need, int who) {
        int nextOne = who == result.length - 1 ? 0 : who + 1;

        if (candies < need) {
            result[who] += candies;
            return;
        }

        result[who] += need;
        distribute(candies - need, result, need + 1, nextOne);
    }

}
