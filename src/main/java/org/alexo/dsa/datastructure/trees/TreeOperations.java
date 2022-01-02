package org.alexo.dsa.datastructure.trees;

import java.rmi.Remote;

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
 */
public class TreeOperations<T extends Comparable<T>> {

    private int nodeCount = 0;

    public int size() {
        return nodeCount;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    // recursive method to find element in a BST
    public boolean contains(BSTNode<T> node, T elem) {

        // This is the base case
        if (node == null) {
            return false;
        }
        // returns negative if less than, 0 if equals, positive integer if greater than
        int comparator = elem.compareTo(node.data);

        // recurse left subtree
        if (comparator < 0) {
            return contains(node.left, elem);
        } else if (comparator > 0) {
            return contains(node.right, elem);
        } else {
            return true;
        }
    }

    public boolean insertNode(BSTNode root, T elem) {
        // if value is existing, do not add
        if (contains(root, elem)) {
            return false;
        } else {
            BSTNode node = insert(root, elem);
            this.nodeCount++;
            return true;
        }
    }

    private BSTNode insert(BSTNode<T> node, T elem) {
        // base case: node is null
        if(node == null) {
            node = new BSTNode(elem);
        } else {
            // choose which subtree
            if(elem.compareTo(node.data) < 0) {
                node.left = insert(node.left, elem);
            } else if(elem.compareTo(node.data) > 0) {
                node.right = insert(node.right, elem);
            }
        }

        return node;
    }

    public void inOrderTraversal(BSTNode node) {
        if(node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + "->");
        inOrderTraversal(node.right);

    }

    public boolean deleteNode(BSTNode root, T elem) {
        // identify first if the element is in the tree
        if(contains(root,elem)) {
            BSTNode node = delete(root, elem);
            nodeCount--;
            return true;
        }
        return false;
    }

    public BSTNode delete(BSTNode<T> node, T elem) {
        if(node == null){
            return null;
        }

        int compare = elem.compareTo(node.data);

        // check first if value is in the left subtrees
        if(compare < 0) {
            node.left = delete(node.left, elem);
        } else if(compare > 0) {
            // check if value is in the right subtrees
            node.right = delete(node.right, elem);
        } else {

            if(node.left == null) {
                // case 1: case with only a right subtree or no subtree
                return node.right;
            } else if(node.right == null) {
                // case 2: case with only a left subtree or no subtree
                return node.left;
            } else {
                // when removing a node from a binary tree with two links the successor
                // of the node being removed can either be the largest value in the left subtree
                // or the smallest value of the right subtree
                BSTNode<T> temp = findMin(node.right);

                node.data = temp.data;

                node.right = delete(node.right, temp.data);
            }
        }
        return node;
    }

    private BSTNode<T> findMin(BSTNode<T> node) {
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }

    private BSTNode<T> findMax(BSTNode<T> node) {
        while(node.right != null) {
            node = node.right;
        }
        return node;
    }
}
