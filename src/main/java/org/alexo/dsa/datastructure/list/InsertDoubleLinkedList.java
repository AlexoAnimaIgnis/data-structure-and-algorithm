package org.alexo.dsa.datastructure.list;

/**
 * Insert operations on a Doubly Linked List
 *
 * Insert at Head
 * Insert at Middle
 * Insert at Last
 */
public class InsertDoubleLinkedList {

    /**
     * Method for inserting at the beginning of the Doubly Linked List
     * @param node
     * @param valueToInsert
     * @return
     */
    public DoubleListNode insertAtBeginning(DoubleListNode node, int valueToInsert) {
        // make sure we are at the start
        while(node.prev != null) {
            node = node.prev;
        }

        DoubleListNode nodeToInsert = new DoubleListNode(valueToInsert);
        nodeToInsert.prev = null;
        nodeToInsert.next = node;

        // update node's previous pointer to point to the new node
        node.prev = nodeToInsert;
        return nodeToInsert;
    }

    /**
     * Method for inserting at the End of the Doubly Linked List
     * @param node
     * @param valueToInsert
     * @return
     */
    public DoubleListNode insertAtEnd(DoubleListNode node, int valueToInsert) {
        // make sure we are at the end
        while(node.next != null) {
            node = node.next;
        }

        DoubleListNode nodeToInsert = new DoubleListNode(valueToInsert);
        node.next = nodeToInsert;
        nodeToInsert.prev = node;
        nodeToInsert.next = null;

        return node;
    }

    public DoubleListNode insertAtMiddle(DoubleListNode node, int value, int position) {
        // make sure we are at the start
        while(node.prev != null) {
            node = node.prev;
        }

        // traverse to the position
        for(int i = 0; i < position - 1; i++) {
            node = node.next;
        }

        DoubleListNode nodeToInsert = new DoubleListNode(value);

        //update the pointers
        nodeToInsert.prev = node;
        nodeToInsert.next = node.next;
        node.next.prev = nodeToInsert;
        node.next = nodeToInsert;

        return node;
    }
}
