package dev.lpa.exercises;

import java.util.Scanner;

class SortedArray {


    public static int[] getIntegers(int n) {
        int[] array = new int[n];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] unsortedArray){
        int[] sortedArray = new int[unsortedArray.length];
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = 0; j < unsortedArray.length-1; j++) {
                if(unsortedArray[j]<unsortedArray[j+1]){
                    swap(unsortedArray,j,j+1);
                }
            }
        }
        for (int i = 0; i <sortedArray.length ; i++) {
            sortedArray[i] = unsortedArray[i];
        }
        return sortedArray;
    }

    public static void swap(int[]array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


