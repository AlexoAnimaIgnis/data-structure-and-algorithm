package org.alexo.dsa.datastructure.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BSTDeleteNodeTest {

    private TreeOperations treeOperations;
    private BSTNode root;

    @Before
    public void setup() {
        treeOperations = new TreeOperations();

        root = new BSTNode(10);
        Assert.assertTrue(treeOperations.insertNode(root, 2));
        Assert.assertTrue(treeOperations.insertNode(root, 1));
        Assert.assertTrue(treeOperations.insertNode(root, 5));
        Assert.assertTrue(treeOperations.insertNode(root, 7));
        Assert.assertTrue(treeOperations.insertNode(root, 13));
        Assert.assertTrue(treeOperations.insertNode(root, 11));
    }

    @Test
    public void testCaseRemoveElementNotInTree() {
        Assert.assertFalse(treeOperations.deleteNode(root, 345));
    }


    @Test
    public void testCaseRemoveLeafNode() {

        BSTNode root = new BSTNode(10);

        treeOperations.inOrderTraversal(root);
        Assert.assertTrue(treeOperations.deleteNode(root, 7));
        // remove leaf
        System.out.println("\nAfter removal");
        treeOperations.inOrderTraversal(root);
    }
}
