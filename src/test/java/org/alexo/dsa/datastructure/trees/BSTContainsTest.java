package org.alexo.dsa.datastructure.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BSTContainsTest {

    private TreeOperations treeOperations;
    private BSTNode root;

    @Before
    public void setup() {
        treeOperations = new TreeOperations();
        root = new BSTNode(10);
        root.left = new BSTNode(5);
        root.left.left = new BSTNode(3);
        root.left.right = new BSTNode(7);
        root.right = new BSTNode(20);
        root.right.right = new BSTNode(30);
    }

    @Test
    public void testContainTrue() {
        Assert.assertTrue(treeOperations.contains(root,30));
    }

    @Test
    public void testContainFalse() {
        Assert.assertFalse(treeOperations.contains(root,65));
    }
}
