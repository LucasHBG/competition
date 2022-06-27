import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxScoreTest {
    MaxScore maxScore = new MaxScore();

    @Test
    public void arrTestCase1() {
        int[] arr = {1,79,80,1,1,1,200,1};

        assertEquals(202, maxScore
                .getMaxScoreSum(arr, 3));
    }

    @Test
    public void arrTestCase2() {
        int[] arr = {9,7,7,9,7,7,9};

        assertEquals(55, maxScore
                .getMaxScoreSum(arr, 7));
    }
}
