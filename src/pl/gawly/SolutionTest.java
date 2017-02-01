package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testZero() {
        Assert.assertEquals(3, s.solution(new int[]{2, 1, 1, 2, 3, 1}));
    }
}
