package org.alexo.dsa.datastructure.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Queue;

public class QueueImplTest {

    private QueueImpl queueImpl;

    @Before
    public void setup(){
        queueImpl = new QueueImpl();
    }

    @Test
    public void testAddToQueue() {
        boolean result = queueImpl.enqueue(8);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testAddToQueueOffer() {
        boolean result = queueImpl.enqueueOffer(8);
        Assert.assertEquals(true, result);
    }

    @Test
    public void testRemoveFromQueue() {
        int result = queueImpl.dequeue();
        Assert.assertEquals(1, result);
    }

    @Test
    public void testRemoveFromQueuePoll() {
        int result = queueImpl.dequeuePoll();
        Assert.assertEquals(1, result);
    }
}
