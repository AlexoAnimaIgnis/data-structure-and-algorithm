package org.alexo.dsa.datastructure.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Queue Implementation
 *
 */
public class QueueImpl {

    public Queue<Integer> addItemInQueue(int valueToAdd) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.add(valueToAdd);
        return queue;
    }
}
