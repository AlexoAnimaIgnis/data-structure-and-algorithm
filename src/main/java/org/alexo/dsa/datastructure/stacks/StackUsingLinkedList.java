package org.alexo.dsa.datastructure.stacks;

import org.alexo.dsa.datastructure.StackNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Stack implementation using Queue(linkedlist)
 *
 * push
 * pop
 * peek
 */
public class StackUsingLinkedList {

    private StackNode top;

    public StackNode getTop() {
        return top;
    }

    public void push(int data) {
        StackNode newTop = new StackNode(data);
        newTop.next = top;
        top = newTop;
    }
}
