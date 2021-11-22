package org.alexo.dsa.datastructure.list;

/**
 * Linked List operation Implementation
 */
public class TraversingLinkedListImpl {

    public void traverse(ListNode head) {
        ListNode ptr = head;

        while(ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
    }

}
