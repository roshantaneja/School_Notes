package com.cty.roshantaneja.w1d2_tutorial;

public class Problems {

    public static void main(String[] args) {
        System.out.println("Problem1:");
        problem1();

        System.out.println("Problem2:");
        problem2();

        System.out.println("Problem3");
        problem3();

    }

    //problem1
    public static void problem1() {
        // Given an array, find the second-smallest element in the array.
        int[] array = new int[]{
                4, 5, 10, -1, 3, 4
        };

        int smallest = array[0];
        int secondSmallest = array[1];

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < smallest) {
                secondSmallest = smallest;
                smallest = array[i];
            } else if (array[i] < secondSmallest){
                secondSmallest = array[i];
            }
        }

        System.out.println(secondSmallest);
    }

    //problem 2
    public static void problem2() {
        //given an array with a list of positive integers less than thirty
        //find the mode of the array in O(n) time

        int[] array = new int[]{
                4, 5, 10, 10, 10, 10, 3, 3, 3, 3, 4
        };

        int[] ints = new int[31];

        for (int j : array) { // create occurrence list
            ints[j]++;
        }

        int maxIndex = 0;
        for (int i = 1; i < ints.length; i++) { // find mode index for one mode
            if (ints[i] > ints[maxIndex]) {
                maxIndex = i;
            }
        }

        for (int i = 0; i < ints.length; i++){ // check for all other indices
            if (ints[i] == ints[maxIndex]){
                System.out.println(i);
            }
        }
    }

    // problem 3
    private static void problem3() {

    }
}
