package org.alexo.dsa.datastructure.list;

/**
 * Implementation of Delete operations in LinkedList
 */
public class DeleteLinkedListImpl {
    /**
     * deleting node from the beginning
     * @param head
     * @return
     */
    public ListNode deleteAtBegin(ListNode head) {
        head = head.next;
        return head;
    }

    /**
     * deleting node at the last
     * @param head
     * @return
     */
    public ListNode deleteAtLast(ListNode head) {

        ListNode pointer = head;

        //traverse first and go to the node before the last node
        while (pointer.next.next != null) {
            pointer = pointer.next;
        }

        pointer.next = null;
        return head;
    }

    /**
     * deleting node at the specific position
     * @param head
     * @return
     */
    public ListNode deleteAtMiddle(ListNode head, int position) {
        ListNode ptr = head;

        // traverse to the node before the target position
        for(int i = 0; i < position - 1; i++) {
            ptr = ptr.next;
        }

        ListNode toBeDeleted = ptr.next;
        ptr.next = toBeDeleted.next;
        toBeDeleted.next = null;

        return head;
    }
}
