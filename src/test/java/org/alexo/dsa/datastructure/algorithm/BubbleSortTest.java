package org.alexo.dsa.datastructure.algorithm;

import org.alexo.dsa.algorithm.BubbleSort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {
    private BubbleSort bubbleSort;

    @Before
    public void setup() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testBubbleSort() {
        int[] input = {6, 4, 3, 0, 1, 67, 33, 2, 5};
        int[] result = bubbleSort.bubbleSort(input);

        int[] expected = {0, 1, 2, 3, 4, 5, 6, 33, 67};

        Assert.assertArrayEquals(expected, result);
    }
}
