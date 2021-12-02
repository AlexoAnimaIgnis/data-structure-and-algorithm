package org.alexo.dsa.datastructure.stacks;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * stack implementation using queue
 *
 * push
 * pop
 * peek
 */
public class StacksUsingQueueImpl {

    public boolean push(int value) {
        Queue<Integer> queue = new ArrayDeque<>();
        return queue.offer(value);
    }
}
