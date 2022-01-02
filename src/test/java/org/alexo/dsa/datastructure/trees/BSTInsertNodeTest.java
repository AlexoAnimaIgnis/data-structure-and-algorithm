package org.alexo.dsa.datastructure.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BSTInsertNodeTest {

    private TreeOperations treeOperations;

    @Before
    public void setup() {
        treeOperations = new TreeOperations();
    }

    @Test
    public void testAddRoot() {
        Assert.assertTrue(treeOperations.insertNode(null, 7));
    }

    @Test
    public void testAddLeft() {
        BSTNode root = new BSTNode(10);
        Assert.assertTrue(treeOperations.insertNode(root, 2));
        treeOperations.inOrderTraversal(root);
    }

    @Test
    public void testAddLeftDuplicate() {
        BSTNode root = new BSTNode(10);
        Assert.assertTrue(treeOperations.insertNode(root, 2));
        Assert.assertFalse(treeOperations.insertNode(root, 10));
        treeOperations.inOrderTraversal(root);
    }

    @Test
    public void testAddRight() {
        BSTNode root = new BSTNode(10);
        Assert.assertTrue(treeOperations.insertNode(root, 2));
        Assert.assertTrue(treeOperations.insertNode(root, 7));
        Assert.assertTrue(treeOperations.insertNode(root, 13));
        Assert.assertTrue(treeOperations.insertNode(root, 11));
        treeOperations.inOrderTraversal(root);

    }
}