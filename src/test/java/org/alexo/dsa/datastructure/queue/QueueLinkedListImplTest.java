package org.alexo.dsa.datastructure.queue;

import org.alexo.dsa.datastructure.StackNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueLinkedListImplTest {
    private QueueLinkedListImpl queueLinkedList;

    @Before
    public void before() {
        queueLinkedList = new QueueLinkedListImpl();
    }

    @Test
    public void testCaseAdd() {
        queueLinkedList.enqueue(1);
        queueLinkedList.enqueue(2);
        queueLinkedList.enqueue(3);
        queueLinkedList.enqueue(4);
        queueLinkedList.enqueue(5);
        StackNode result = queueLinkedList.enqueue(6);
        Assert.assertNotNull(result);
    }
}
