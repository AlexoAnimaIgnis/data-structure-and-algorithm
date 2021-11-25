package org.alexo.dsa.datastructure.list;

public class TraversingDoubleLinkedList {

    /**
     * make sure that you'll start at the beginning.
     * @param node
     */
    public void traverseFromBeginning(DoubleListNode node) {
        while(node.prev != null) {
            node = node.prev;
        }

        while(node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
    }
}
