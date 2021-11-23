package org.alexo.dsa.datastructure.list;

/**
 * Insert operations for Linked List
 */
public class InsertLinkedListImpl {

    /**
     * Insert new node at beginning
     * @param head
     * @param toAdd
     * @return
     */
    public ListNode insertAtBegin(ListNode head, ListNode toAdd) {
        toAdd.next = head;
        head = toAdd;
        return head;
    }

    /**
     * insert at end
     * @param head
     * @param toAdd
     * @return
     */
    public ListNode insertAtLast(ListNode head, ListNode toAdd) {
        ListNode ptr = head;

        // traverse to the last position
        while(ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = toAdd;
        toAdd.next = null;
        return head;
    }

    /**
     * insert node at a specific position
     * @param head
     * @param toAdd
     * @param pos
     * @return
     */
    public ListNode insertAtMiddle(ListNode head, ListNode toAdd, int pos) {
        ListNode ptr = head;
        //traverse to the node before the target position
        for(int i = 0; i < pos ; i++) {
            ptr = ptr.next;
        }
        toAdd.next = ptr.next;
        ptr.next = toAdd;
        return head;
    }
}
