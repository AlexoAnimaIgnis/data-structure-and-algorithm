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

    public int pop() {
        if(top == null) {
            return -1;
        }

        int res = top.value;

        StackNode toRemove = top;
        top = toRemove.next;
        toRemove.next = null;
        return res;
    }
}
