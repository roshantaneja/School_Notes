package com.cty.briansea.lab4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * A Binary Search Tree
 * @param <T> the orderable type in the tree
 *
 * @author Brian Sea
 * @since PSet 3 (Answer)
 * @version 0.0.1
 */
public class BSTree<T extends Comparable<T>> {
    private BSTNode<T> root;
    private Comparator<? super T> comparator;

    private class BSTNode<T extends Comparable<T>> {
        public T data;
        public BSTNode<T> left, right;

        public BSTNode( T data ){
            this.data = data;
        }
    }

    /**
     * Creates a BST which uses Natural Ordering
     */
    public BSTree() {
        this(null);
    }

    /**
     * Creates a BST which uses a custom Comparator
     * @param comp the comparator to use
     */
    public BSTree( Comparator<? super T> comp ){
        this.comparator = comp;
        if( comp == null ){
            this.comparator = new NaturalOrdering<>();
        }
    }

    /**
     * Adds an element to the BST in order position
     * @param data the data the add
     */
    public void add( T data ){
        BSTNode<T> node = new BSTNode<T>(data);

        if( root == null ) {
            root = node;
            return;
        }

        // Find the correct position in the tree
        BSTNode<T> parent = root;
        while( parent != null ){
            int compare = this.comparator.compare(data,parent.data);
            if( compare <= 0 ) {
                // Can't move left, so add the node
                if( parent.left == null ){
                    parent.left = node;
                    break;
                }
                parent = parent.left;
            }
            else {
                // Can't move right, so add the node
                if( parent.right == null ){
                    parent.right = node;
                    break;
                }
                parent = parent.right;
            }
        }
    }

    /**
     * Empties the tree of data
     */
    public void clear() {
        root = null;
    }

    /**
     * Removes all nodes which match the data
     * @param data the data to look for
     */
    public void removeAll( T data ){
        while( remove(data) );
    }

    /**
     * Removes the <b>first</b> instance which matches the data
     * @param data the data to look for
     * @return true if the data is removed, false if the data isn't found
     */
    public boolean remove( T data ) {

        // Find the data to remove and call the helper
        BSTNode<T> parent = null;
        BSTNode<T> removeMe = root;
        while( removeMe != null ) {
            int compare = this.comparator.compare(data, removeMe.data);
            // Found the node, so remove it
            if( compare == 0 ) {
                return removeNode( removeMe, parent );
            }
            else {
                parent = removeMe;
                if( compare < 0 ){
                    removeMe = removeMe.left;
                }
                else {
                    removeMe = removeMe.right;
                }
            }
        }

        return false;
    }

    private boolean removeNode( BSTNode<T> me, BSTNode<T> parent ){
        int numChild = 0;

        // removing the root; Set to myself and handle later
        if( parent == null ){
            parent = me;
        }

        // Left or right child? Assume Left
        boolean leftChild = true;
        if( parent.right == me ){
            leftChild = false;
        }

        // Count Children and set the target node
        BSTNode<T> target = null;
        if( me.left != null ){
            numChild++;
            target = me.left;
        }

        if( me.right != null ){
            numChild++;
            target = me.right;
        }

        // Removing a node with zero or one child is the same
        if( numChild < 2 ) {
            if( parent == me ){
                root = target;
            }
            else if( leftChild ) {
                parent.left = target;
            }
            else {
                parent.right = target;
            }
        }
        else { // 2 Children
            // Find the right most left child
            BSTNode<T> rightMostParent = me;
            BSTNode<T> rightMost = me.left;
            while( rightMost.right != null ){
                rightMostParent = rightMost;
                rightMost = rightMost.right;
            }

            // Move Data Up
            me.data = rightMost.data;
            // Remove Right Most
            removeNode( rightMost, rightMostParent);
        }
        return true;
    }


    /**
     * Completes a preOrder traversal of the tree
     * @return all the data in a preorder fashion
     */
    public List<T> preOrder(){
        ArrayList<T> list = new ArrayList<T>();
        preOrderHelper( root, list );
        return list;
    }
    private void preOrderHelper( BSTNode<T> curr, ArrayList<T> list ){
        if( curr == null ) {
            return;
        }
        list.add( curr.data );
        preOrderHelper( curr.left, list );
        preOrderHelper( curr.right, list );
    }

    /**
     * Completes a inOrder traversal of the tree
     * @return all the data in a inOrder fashion (sorted)
     */
    public List<T> inOrder() {
        ArrayList<T> list = new ArrayList<T>();

        inOrderHelper( root, list );
        return list;
    }
    private void inOrderHelper( BSTNode<T> curr, ArrayList<T> list ){
        if( curr == null ) {
            return;
        }

        inOrderHelper( curr.left, list );
        list.add( curr.data );
        inOrderHelper( curr.right, list );
    }

    /**
     * Completes a postOrder traversal of the tree
     * @return all the data in a postOrder fashion
     */
    public List<T> postOrder() {
        ArrayList<T> list = new ArrayList<T>();
        postOrderHelper( root, list);
        return list;
    }
    private void postOrderHelper( BSTNode<T> curr, ArrayList<T> list){
        if( curr == null ){
            return;
        }
        postOrderHelper( curr.left, list );
        postOrderHelper( curr.right, list );
        list.add( curr.data );
    }

    private class NaturalOrdering<T extends Comparable<T>> implements Comparator<T>{
        @Override
        public int compare(T left, T right) {
            return left.compareTo(right);
        }
    }

}

