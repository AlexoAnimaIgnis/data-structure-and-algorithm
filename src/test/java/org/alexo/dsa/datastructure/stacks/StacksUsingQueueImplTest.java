package org.alexo.dsa.datastructure.stacks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StacksUsingQueueImplTest {
    private StacksUsingQueueImpl stacksUsingQueue;

    @Before
    public void setup() {
        stacksUsingQueue = new StacksUsingQueueImpl();
    }

    @Test
    public void push() {
        Assert.assertTrue(stacksUsingQueue.push(7));
    }
}
