package org.alexo.dsa.datastructure.stacks;

import org.alexo.dsa.datastructure.StackNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackUsingLinkedListTest {

    private StackUsingLinkedList stackUsingLinkedList;

    @Before
    public void setup() {
        stackUsingLinkedList = new StackUsingLinkedList();
    }

    @Test
    public void testCasePush() {
        stackUsingLinkedList.push(1);
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.push(3);
        stackUsingLinkedList.push(4);
        stackUsingLinkedList.push(5);

        StackNode top = stackUsingLinkedList.getTop();

        while (top != null) {
            System.out.print(top.value + "->");
            top = top.next;
        }

    }

    @Test
    public void testCasePopEmpty() {
        int res = stackUsingLinkedList.pop();
        Assert.assertEquals(-1, res);
    }

    @Test
    public void testCasePop() {
        stackUsingLinkedList.push(1);
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.push(3);
        stackUsingLinkedList.push(4);
        stackUsingLinkedList.push(5);
        int res1 = stackUsingLinkedList.pop();
        Assert.assertEquals(5, res1);
        int res2 = stackUsingLinkedList.pop();
        Assert.assertEquals(4, res2);
    }
}
