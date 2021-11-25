package org.alexo.dsa.datastructure.list;

import org.junit.Before;
import org.junit.Test;

public class DoubleLinkedListTest {

    private TraversingDoubleLinkedList traversingDoubleLinkedList;
    private InsertDoubleLinkedList insertDoubleLinkedList;
    private DoubleListNode n1;
    private DoubleListNode n2;
    private DoubleListNode n3;
    private DoubleListNode n4;
    private DoubleListNode n5;
    private DoubleListNode n6;


    @Before
    public void setup() {
        traversingDoubleLinkedList = new TraversingDoubleLinkedList();
        insertDoubleLinkedList = new InsertDoubleLinkedList();
        n1 = new DoubleListNode(1);
        n2 = new DoubleListNode(2);
        n3 = new DoubleListNode(3);
        n4 = new DoubleListNode(4);
        n5 = new DoubleListNode(5);
        n6 = new DoubleListNode(6);

        n1.prev = null;
        n1.next = n2;

        n2.prev = n1;
        n2.next = n3;

        n3.prev = n2;
        n3.next = n4;

        n4.prev = n3;
        n4.next = n5;

        n5.prev = n4;
        n5.next = n6;

        n6.prev = n5;
        n6.next = null;
    }

    @Test
    public void traverseFromBeginningStartNode() {

        System.out.println("Traversing Doubly Linked List");
        traversingDoubleLinkedList.traverseFromBeginning(n1);

        System.out.println("End traversing Doubly Linked List");
    }

    @Test
    public void traverseFromBeginningMiddleNode() {

        System.out.println("Traversing Doubly Linked List");
        traversingDoubleLinkedList.traverseFromBeginning(n4);

        System.out.println("End Traversing Doubly Linked List");
    }

    @Test
    public void traverseFromBeginningLastNode() {

        System.out.println("Traversing Doubly Linked List");
        traversingDoubleLinkedList.traverseFromBeginning(n6);

        System.out.println("End Traversing Doubly Linked List");
    }

    @Test
    public void insertATBeginning() {
        // Expecting 7 1 2 3 4 5 6
        System.out.println("Inserting at beginning of DoublyLinkedList");
        DoubleListNode node = insertDoubleLinkedList.insertAtBeginning(n4, 7);
        traversingDoubleLinkedList.traverseFromBeginning(node);
    }

    @Test
    public void insertATLast() {
        // Expecting 1 2 3 4 5 6 7
        System.out.println("Inserting at last of DoublyLinkedList");
        DoubleListNode node = insertDoubleLinkedList.insertAtEnd(n4, 7);
        traversingDoubleLinkedList.traverseFromBeginning(node);
    }

    @Test
    public void insertAtMiddle() {
        //expected: 1 2 3 7 4 5 6
        System.out.println("Inserting at specified position of DoublyLinkedList");
        DoubleListNode node = insertDoubleLinkedList.insertAtMiddle(n4, 7, 4);
        traversingDoubleLinkedList.traverseFromBeginning(node);
    }
}
