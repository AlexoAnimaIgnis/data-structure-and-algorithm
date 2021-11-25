package org.alexo.dsa.datastructure.list;

/**
 * Implementation class for Doubly LinkedList DELETE operation
 *
 * Delete at Beginning
 * Delete at End
 * Delete at a Specified Position
 */
public class DeleteDoubleLinkedList {

    /**
     * Delete the node at beginning
     * @param node
     * @return 2 3 4 5 6
     */
    public DoubleListNode deleteAtBeginning(DoubleListNode node) {
        // make sure we are at the start (identify the position)
        while(node.prev != null) {
            node = node.prev;
        }

        DoubleListNode nodeTobeDeleted = node;
        nodeTobeDeleted.next.prev = null;
        node = nodeTobeDeleted.next;
        return node;
    }

    /**
     * Deleting node at last
     * @param node
     * @return 1 2 3 4 5
     */
    public DoubleListNode deleteATLast(DoubleListNode node) {
        //make sure we are at the end
        while(node.next != null) {
            node = node.next;
        }

        DoubleListNode temp = node.prev;
        node.prev = null;
        temp.next = null;
        return temp;
    }

    /**
     * Delete node at specified target
     * @param node 1 2 3 4 5 6
     * @param target 4
     * @return 1 2 3 4 6
     */
    public DoubleListNode deleteAtMiddle(DoubleListNode node, int target) {
        // make sure we are at start
        while(node.prev != null) {
            node = node.prev;
        }

        for(int i = 0; i < target ; i++) {
            node = node.next;
        }

        DoubleListNode nodeToDelete = node;
        DoubleListNode previousNode = node.prev;
        previousNode.next = nodeToDelete.next;
        nodeToDelete.next.prev = previousNode;

        nodeToDelete.prev = null;
        nodeToDelete.next = null;

        return previousNode;
    }
}
