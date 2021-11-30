package org.alexo.dsa.datastructure.queue;

import org.alexo.dsa.datastructure.StackNode;
import org.alexo.dsa.datastructure.list.ListNode;

import java.util.List;

/**
 * Queue Implementation using LinkedList
 * Queue is a First in- First Out data structure
 * <p>
 * enqueue - add
 * dequeue - remove
 * peek - view head
 */
public class QueueLinkedListImpl {

    private StackNode first = null;
    private StackNode last = null;

    /**
     * add item to the queue
     * @param valueToAdd
     * @return
     */
    public StackNode enqueue(int valueToAdd) {

        StackNode newNode = new StackNode(valueToAdd);
        if (this.last != null) {
            last.next = newNode;
        }
        this.last = newNode;
        if (this.first == null) {
            this.first = this.last;
        }

        return this.first;
    }

    /**
     * get first element without removing it
     * @return
     */
    public int peek() {
        if(this.first == null) {
            return -1;
        }

        return this.first.value;
    }

    /**
     * remove first element
     * @return
     */
    public int dequeue() {
        if(this.first == null) {
            return -1;
        }

        int toReturn = this.first.value;

        // move pointer
        this.first = this.first.next;
        if(this.first == null) {
            this.last = null;
        }
        return toReturn;
    }
}
