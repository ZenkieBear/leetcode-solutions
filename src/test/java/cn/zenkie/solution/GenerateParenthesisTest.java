package cn.zenkie.solution;

import org.junit.Test;

public class GenerateParenthesisTest {

    private final GenerateParenthesis solution = new GenerateParenthesis();
    @Test
    public void generateParenthesis() {
        System.out.println(solution.generateParenthesis(3));
    }
}