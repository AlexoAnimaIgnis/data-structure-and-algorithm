package org.alexo.dsa.datastructure.trees;

/**
 * to implement
 * 1. isEmpty()
 * 2. size()
 * 3. boolean add(int value)
 * 4. boolean remove(value)
 * 5. Node findMind(Node node)
 * 6. Node findMax(Node node)
 * 7. boolean contains(T elem)
 * 8. int height(Node node)
 *
 */
public class TreeOperations<T extends Comparable<T>>{

    private int nodeCount = 0;

    private TreeNode root = null;

    public int size() {
        return nodeCount;
    }

    public boolean isEmpty() {
        return size() == 0;
    }
}
