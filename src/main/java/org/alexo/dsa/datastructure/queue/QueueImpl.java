package org.alexo.dsa.datastructure.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Queue Implementation
 *
 */
public class QueueImpl {

    /**
     * insert operation
     * @param valueToAdd
     * @return
     */
    public boolean enqueue(int valueToAdd) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        return queue.add(valueToAdd);
    }

    /**
     * insert operation using OFFER
     * @param valueToAdd
     * @return
     */
    public boolean enqueueOffer(int valueToAdd) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(5);

        return queue.offer(valueToAdd);
    }

    /**
     * remove using remove() method
     * @return
     */
    public int dequeue() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        return queue.remove();
    }

    /**
     * remove using remove() method
     * @return
     */
    public int dequeuePoll() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        return queue.poll();
    }

    public int getElement(){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(4);
        queue.add(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        return queue.element();
    }

    public int getElementPeek(){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(2);
        queue.add(3);
        queue.add(3);
        queue.add(3);
        return queue.peek();
    }
}
