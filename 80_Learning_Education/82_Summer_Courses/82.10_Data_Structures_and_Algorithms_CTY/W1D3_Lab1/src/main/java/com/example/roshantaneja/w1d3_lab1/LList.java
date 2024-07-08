package com.example.roshantaneja.w1d3_lab1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LList<T> implements List<T> {

    public Node<T> head;
    public Node<T> tail;
    private int size = 0;

    private class Node<E> {
        public E data;
        public Node<E> next;
        public Node<E> prev;

        Node(E element){
            this.data = element;
        }
        Node(){}
    }

    private class LLIterator<E> implements Iterator<E>{
        private Node<E> current;
        public LLIterator(){
            current = (Node<E>) head;
        }

        /**
         * returns true if there is another element after "current" in the list
         * @return True: there is another element after "current" in the list
         * | False: there is not another element after "current" in the list
         */
        @Override
        public boolean hasNext() {
                if(current == null) {
                    return false;
                } else if (current.next == null){
                    return false;
                }
                return true;
        }
        @Override
        public E next() {
            if (current == null){
                return null;
            }
            E data = current.data;
            current = current.next;
            return data;
        }
    }


    //TODO: Implement the rest of the List interface methods
    //TODO: Complete JavaDoc for all methods
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }



    @Override
    public boolean add(T t) {
        Node<T> n = new Node(t);
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
    public void add(int index, T element) {
        if (index < 0 || size < index){
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = new Node<T>();
        node.data = element;
        if (index == 0) {
            head = node;
            if (tail == null){
                tail = node;
            }
            size++;
        } else if (index == size()) {
            add(node.data);
        } else {
            insert(index, node);
        }
    }

    private void insert(int index, Node<T> node){
         Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        node.next = current.next;
        node.prev = current;
        current.next = node;
        node.next.prev = node;
        size++;
    }

    //TODO: complete remove functions
    @Override
    public boolean remove(Object o) {
        if (o == null){
            for (Node<T> x = head; x != null; x = x.next){
                if (o.equals(x)){
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || size < index){
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        T data = current.data;
        unlink(current);
        return data;

    }
    private T unlink(Node<T> x){
        T element = x.data;
        Node<T> next = x.next;
        Node<T> prev = x.prev;

        if(prev == null){
            head = next;
        } else {
            prev.next = next;
            if (next != null){
                next.prev = prev;
            }
        }

        if (x == tail){
            tail = prev;
        }
        size--;
        return element;
    }

    @Override
    public T get(int index) {
        if (index < 0 || size < index){
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
        tail = null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        LLIterator iterator = new LLIterator();
        return iterator;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }


}
