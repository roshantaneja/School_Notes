package com.cty.briansea.lab4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Represents a Binary Heap with tunable Comparator
 * @author Brian Sea
 * @since Problem Set 4
 * @version 0.0.1
 */
public class Heap<T extends Comparable<T>> {
    private List<T> data;
    private Comparator<T> comparator;

    public Heap(){
        this(null);
    }
    public Heap(Comparator<T> comp){
        data = new ArrayList<>();
        this.comparator = comp;
        if(comp == null ){
            this.comparator = new NaturalOrdering<>();
        }
    }

    public boolean isEmpty(){
        return data.size() == 0;
    }

    public T peek(){
        if( data.size() == 0 ){
            return null;
        }
        return data.get(0);
    }

    public boolean add(T data){
        this.data.add(data);
        heapifyUp(this.data.size()-1);
        return true;
    }
    private void heapifyUp(int index){
        if( index <= 0 ){
            return;
        }

        int parent = (index-1) / 2;
        int compare = this.comparator.compare(data.get(parent), data.get(index));
        if( compare > 0 ){
            T tmp = data.get(parent);
            data.set(parent, data.get(index));
            data.set(index, tmp);
            heapifyUp(parent);
        }
    }

    public T remove(){
        if(data.size() == 0 ){
            return null;
        }

        T rtn = data.get(0);
        data.set(0, data.get(data.size()-1));
        data.remove(data.size()-1);
        heapDown(0);

        return rtn;
    }

    private void heapDown(int index){
        if( index >= data.size() ){
            return;
        }

        int[] children = new int[]{
                index*2+1,
                index*2+2
        };

        int min = index;
        for( int child : children ){
            if(child < data.size()){
                int compare = this.comparator.compare(data.get(min), data.get(child));
                if( compare > 0 ){
                    min = child;
                }
            }
        }

        if( min != index ){
            T tmp = data.get(min);
            data.set(min, data.get(index));
            data.set(index, tmp);
            heapDown(min);
        }
    }

    private class NaturalOrdering<T extends Comparable<T>> implements Comparator<T> {
        @Override
        public int compare(T left, T right) {
            return left.compareTo(right);
        }
    }
}
