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
        Queue<Integer> result = queueImpl.addItemInQueue(8);
        for(int i: result) {
            System.out.println(i);
        }
        Assert.assertEquals(1, (int) result.peek());
    }
}
