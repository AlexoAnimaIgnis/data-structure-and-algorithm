package org.alexo.dsa.datastructure.trees;

import org.junit.Before;
import org.junit.Test;

public class TreeTraversalsTest {

    private TreeTraversals treeTraversals;
    private TreeNode root;


    @Before
    public void before() {
        treeTraversals = new TreeTraversals();

        root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(30);
    }

    /**
     *           10
     *          / \
     *       5      20
     *     /  \        \
     *   3     7        30
     *
     */
    @Test
    public void testInorder() {
        // Expected: 3 5 7 10 20 30
        treeTraversals.inOrderTraversal(root);
    }

    @Test
    public void testPreorder() {
        // Expected: 10 5 3 7 20 30
        treeTraversals.preOrderTraversal(root);
    }
}
