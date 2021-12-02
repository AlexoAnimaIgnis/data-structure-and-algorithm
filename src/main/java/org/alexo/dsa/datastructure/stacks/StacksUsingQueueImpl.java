package org.alexo.dsa.datastructure.stacks;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * stack implementation using queue
 * <p>
 * push
 * pop
 * peek
 */
public class StacksUsingQueueImpl {

    public boolean push(int value) {
        Queue<Integer> queue = new ArrayDeque<>();
        return queue.offer(value);
    }

    public int pop(Queue<Integer> queue) {
        int i = 0;
        if(queue.size() == 0){
            return -1;
        }
        while(i < queue.size()-1) {
            queue.offer(queue.poll());
            i++;
        }
        return queue.poll();
    }
}
