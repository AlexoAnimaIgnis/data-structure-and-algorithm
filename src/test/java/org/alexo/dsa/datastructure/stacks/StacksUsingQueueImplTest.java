package org.alexo.dsa.datastructure.stacks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

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

    @Test
    public void pop() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);
        Assert.assertEquals(1, stacksUsingQueue.pop(queue));
        Assert.assertEquals(2, stacksUsingQueue.pop(queue));
        Assert.assertEquals(3, stacksUsingQueue.pop(queue));
        Assert.assertEquals(4, stacksUsingQueue.pop(queue));
        Assert.assertEquals(5, stacksUsingQueue.pop(queue));
        Assert.assertEquals(-1, stacksUsingQueue.pop(queue));
    }

    @Test
    public void peek() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);
        Assert.assertEquals(1, stacksUsingQueue.peek(queue));
        Assert.assertEquals(1, stacksUsingQueue.peek(queue));
    }

    @Test
    public void peekOne() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        Assert.assertEquals(3, stacksUsingQueue.peek(queue));
    }

    @Test
    public void peekTwo() {
        Queue<Integer> queue = new ArrayDeque<>();
        Assert.assertEquals(-1, stacksUsingQueue.peek(queue));
    }
}
