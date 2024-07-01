package com.cty.roshantaneja.w1d5_lab2;

import java.util.Comparator;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.ArrayList;

public class BSTree<T extends Comparable<T>> {
    private BSTNode<T> root;
    private final Comparator<? super T> comparator;

    private class BSTNode<T extends Comparable<T>> {
        public T data;
        public BSTNode<T> left, right;

        public BSTNode( T data ){
            this.data = data;
        }

    }

    public BSTree() {
        this(null);
    }

    public BSTree( Comparator<? super T> comp ){
        if (comp == null){
            comp = new NaturalOrdering<T>();
        }
        this.comparator = comp;
    }

    public void add( T data ){
        BSTNode<T> newNode = new BSTNode<T>(data);
        if( root == null ){
            root = newNode;
        }
        else {
            addNode(root, newNode);
        }
    }

    private void addNode(BSTNode<T> root, BSTNode<T> newNode) {
        if(comparator.compare(root.data, newNode.data) > 0) {
            if ( root.left == null ) {
                root.left = newNode;
            } else {
                addNode( root.left, newNode );
            }
        } else {
            if (root.right == null) {
                root.right = newNode;
            } else {
                addNode( root.right, newNode );
            }
        }
    }

    // TODO: Ask the difference between clear and remove all
    public void clear() {
    root = null;
    }

    public void removeAll( T data ){
        while(remove(data));
    }


    // TODO: finish remove function. Compute rml node and then replace and remove.
    //       Return true if removed, false if not found
    public boolean remove( T data ) {
        Stack<BSTNode<T>> stack = new Stack<>();
        stack.push(root);
        while(stack.peek() != null){
            BSTNode<T> visited = stack.pop();
            if(visited.left.data.equals(data)){
                return removeNode(visited.left, visited);
            } else if(visited.right.data.equals(data)){
                return removeNode(visited.right, visited);
            }
        }
        return false;
    }

    private boolean removeNode( BSTNode<T> me, BSTNode<T> parent ){
        if ( me.left == null && me.right == null ) {
            if ( parent.left == me ) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else if ( me.left == null ) {
            if ( parent.left == me ) {
                parent.left = me.right;
            } else {
                parent.right = me.right;
            }
        } else if ( me.right == null ) {
            if ( parent.left == me ) {
                parent.left = me.left;
            } else {
                parent.right = me.left;
            }
        } else {
            BSTNode<T> rml = me.left;
            BSTNode<T> rmlParent = me;
            while ( rml.right != null ) {
                rmlParent = rml;
                rml = rml.right;
            }
            me.data = rml.data;
            return removeNode( rml, rmlParent );
        }
        return true;
    }

    public List<T> preOrder(){
        ArrayList<T> list = new ArrayList<T>();
        preOrderHelper(root, list);
        return list;
    }
    private void preOrderHelper( BSTNode<T> curr, List<T> list ){
        if( curr == null ){
            return;
        }
        list.add(curr.data);
        preOrderHelper(curr.left, list);
        preOrderHelper(curr.right, list);
    }

    public List<T> inOrder() {
        ArrayList<T> list = new ArrayList<T>();
        inOrderHelper(root, list);
        return list;
    }
    private void inOrderHelper( BSTNode<T> curr, List<T> list ){
        if( curr == null ){
            return;
        }
        inOrderHelper(curr.left, list);
        list.add(curr.data);
        inOrderHelper(curr.right, list);
    }

    public List<T> postOrder() {
        ArrayList<T> list = new ArrayList<T>();
        postOrderHelper(root, list);
        return list;
    }
    private void postOrderHelper( BSTNode<T> curr, List<T> list){
        if( curr == null ){
            return;
        }
        postOrderHelper(curr.left, list);
        postOrderHelper(curr.right, list);
        list.add(curr.data);
    }

    private class NaturalOrdering<T extends Comparable<T>> implements Comparator<T>{
        @Override
        public int compare(T left, T right) {
            return left.compareTo(right);
        }
    }

}

