package com.cty.roshantaneja.w2d2_lab3;

import java.util.ArrayList;
import java.util.Comparator;

public class Heap<T extends Comparable<T>>{
    private ArrayList<T> heap;

    Comparator<T> comparator;

    public int currSize;

    public Heap() {
        this(null);
    }

    public Heap(Comparator<T> comp){
        heap = new ArrayList<>();
        currSize = 0;
        if(comp == null){
            comparator = new NaturalOrdering<>();
        } else {
            comparator = comp;
        }
    }

    public void push(T key){
        heap.add(key);
        bubbleUp(heap.size() - 1);
        currSize++;
    }
    public T pop(){
        if (heap.size() == 0){
            //queue is empty
            return null;
        }
        T topNode = popOneElement();
        currSize--;
        return topNode;
    }
    private T popOneElement(){
        T topNode = heap.remove(0);
        swap(0, heap.size() - 1);
        bubbleDown();

        return topNode;
    }
    private int parent(int pos) { return (pos-1) / 2; }
    private int leftChild(int pos){return 2*pos+1;}
    private int rightChild(int pos){return 2*pos+2;}
    private void swap(int posA, int posB){
        T nodeA = heap.get(posA);
        T nodeB = heap.get(posB);
        heap.set(posA, nodeB);
        heap.set(posB, nodeA);
    }
    private void bubbleUp(int pos){
        int current = pos;
        while (heap.get(current).compareTo(heap.get(parent(current))) < 0) {
            swap(current, parent(current));
            current = parent(current);
        }
    }
    private void bubbleDown() {
        int current = 0;
        boolean finishedComparison = false;

        while (!finishedComparison) {
            int leftChildPos = leftChild(current);
            int rightChildPos = rightChild(current);
            // System.out.println("Left pos " + leftChildPos);
            // System.out.println("Right pos " + rightChildPos);

            if (leftChildPos < heap.size() && rightChildPos < heap.size()) {
                int maxChildPos = heap.get(leftChildPos).compareTo(heap.get(rightChildPos)) > 0 ? leftChildPos : rightChildPos;
                if (heap.get(maxChildPos).compareTo(heap.get(current)) > 0){
                    swap(current, maxChildPos);
                    current = maxChildPos;
                } else{
                    finishedComparison = true;
                }
            } else if (leftChildPos < heap.size() && heap.get(leftChildPos).compareTo(heap.get(current)) > 0) {
                swap(current, leftChildPos);
                current = leftChildPos;
            } else {
                finishedComparison = true;
            }
        }
    }

    private class NaturalOrdering<T extends Comparable<T>> implements Comparator<T> {
        @Override
        public int compare(T left, T right) {
            return left.compareTo(right);
        }
    }


}
