package com.cty.roshantaneja.w2d2_lab3;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Represents a singularly Linked List
 * @param <T> the type of data in the list
 * @author Brian Sea
 * @version 0.0.2
 * @since PSet 2 (Answer)
 */
public class LList<T> implements List<T> {

    private LLNode<T> head, tail;
    private int size = 0;

    private class LLNode<T>{

        public T data;

        // refers to the next node in line
        public LLNode<T> next;

        public LLNode(T data){
            this.data = data;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<T> iterator() {
        return new LListIterator();
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(T t) {

        // Always adds to the end
        LLNode<T> n = new LLNode(t);
        if( head == null ){
            head = n;
        }
        else {
            tail.next = n;
        }
        size ++;
        tail = n;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public T get(int index) {

        // Check bounds
        if( index < 0 || index >= size() ){
            throw new IndexOutOfBoundsException();
        }

        // Move to correct Node
        LLNode<T> p = head;
        for( int i = 0; i < index; i++){
            p = p.next;
        }
        return p.data;
    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, T element) {

        // Check bounds; index == size means add to end
        if( index < 0 || index > size() ){
            throw new IndexOutOfBoundsException();
        }

        LLNode<T> addMe = new LLNode<>(element);
        if( index == 0 ){
            addMe.next = head;
            head = addMe;
        }
        else if( index == size() ){
            add(element);
        }
        else {
            // Move to node directly before insertion
            LLNode<T> curr = head;
            for( int i = 0; i < index-1; i++ ) {
                curr = curr.next;
            }
            addMe.next = curr.next;
            curr.next = addMe;
        }
        size++;
    }

    @Override
    public T remove(int index) {
        // Bounds check
        if( index < 0 || index >= size() ){
            throw new IndexOutOfBoundsException();
        }

        // Trailing the node to remove
        LLNode<T> prev = null;
        LLNode<T> removeMe = head;
        for( int i = 0; i < index; i++ ) {
            prev = removeMe;
            removeMe = removeMe.next;
        }

        // Remove the head
        if( prev == null ){
            head = removeMe.next;
        }
        else {
            prev.next = removeMe.next;
        }

        // Removed the tail
        if( removeMe == tail ){
            tail = prev;
        }

        removeMe.next = null;
        size--;
        return removeMe.data;
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }


    private class LListIterator<E> implements Iterator<T> {

        private LLNode<E> curr;

        public LListIterator() {
            curr = (LLNode<E>) LList.this.head;
        }
        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public T next() {
            T data = (T)curr.data;
            curr = curr.next;
            return data;
        }
    }
}