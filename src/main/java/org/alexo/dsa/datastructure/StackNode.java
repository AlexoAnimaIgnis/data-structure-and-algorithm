package org.alexo.dsa.datastructure;

/**
 * node to be used by queue and stack implementation
 */
public class StackNode {
    public int value;
    public StackNode next;

    public StackNode(int value) {
        this.value = value;
    }
}
