package org.alexo.dsa.datastructure.list;

import org.junit.Before;
import org.junit.Test;

public class LinkedListImplTest {
    private TraversingLinkedListImpl traversingLinkedList;
    private DeleteLinkedListImpl deleteLinkedList;
    private InsertLinkedListImpl insertLinkedList;
    private ListNode n1;
    private ListNode n2;
    private ListNode n3;
    private ListNode n4;
    private ListNode n5;
    private ListNode n6;

    @Before
    public void init() {
        traversingLinkedList = new TraversingLinkedListImpl();
        deleteLinkedList = new DeleteLinkedListImpl();
        insertLinkedList = new InsertLinkedListImpl();
        n1 = new ListNode(1);
        n2 = new ListNode(2);
        n3 = new ListNode(3);
        n4 = new ListNode(4);
        n5 = new ListNode(5);
        n6 = new ListNode(6);
    }

    @Test
    public void testTraverseLinkedList() {
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        traversingLinkedList.traverse(n1);
    }

    @Test
    public void testDeleteAtBegin() {
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        traversingLinkedList.traverse(n1);
        System.out.println("\nDeleting node at beginning");
        ListNode dummy = deleteLinkedList.deleteAtBegin(n1);

        traversingLinkedList.traverse(dummy);
    }

    @Test
    public void testDeleteAtLast() {
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        traversingLinkedList.traverse(n1);
        System.out.println("\nDeleting node at Last");
        ListNode dummy = deleteLinkedList.deleteAtLast(n1);

        traversingLinkedList.traverse(dummy);
    }

    @Test
    public void testDeleteAtMiddle() {
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        traversingLinkedList.traverse(n1);
        System.out.println("\nDeleting node at Last");
        ListNode dummy = deleteLinkedList.deleteAtMiddle(n1, 3);

        traversingLinkedList.traverse(dummy);
    }

    @Test
    public void testInsertAtBegin() {
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        traversingLinkedList.traverse(n1);
        System.out.println("\nInserting node at begin");
        ListNode dummy = insertLinkedList.insertAtBegin(n1, new ListNode(7));

        traversingLinkedList.traverse(dummy);
    }

    @Test
    public void testInsertAtLast() {
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        traversingLinkedList.traverse(n1);
        System.out.println("\nInserting node at last");
        ListNode dummy = insertLinkedList.insertAtLast(n1, new ListNode(7));

        traversingLinkedList.traverse(dummy);
    }

    @Test
    public void testInsertAtMiddle() {
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        traversingLinkedList.traverse(n1);
        System.out.println("\nInserting node at middle");
        ListNode dummy = insertLinkedList.insertAtMiddle(n1, new ListNode(7), 3);

        traversingLinkedList.traverse(dummy);
    }
}
