package org.alexo.dsa.datastructure.trees;


/**
 * Known Tree traversals
 *
 * IN ORDER
 * PRE ORDER
 * POST ORDER
 *
 */
public class TreeTraversals {

    public void inOrderTraversal(TreeNode tree) {

        if(tree == null) {
            return;
        }
        inOrderTraversal(tree.left);
        System.out.print(tree.value + "->");
        inOrderTraversal(tree.right);
    }

    public void preOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.value + "->");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}
