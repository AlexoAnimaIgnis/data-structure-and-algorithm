package org.alexo.dsa.datastructure.stacks;

import org.alexo.dsa.datastructure.StackNode;
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

        while(top != null) {
            System.out.print(top.value + "->");
            top = top.next;
        }

    }
}
