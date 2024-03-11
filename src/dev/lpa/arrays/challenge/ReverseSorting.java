package dev.lpa.arrays.challenge;

import dev.lpa.arrays.Main;

import java.util.Arrays;

public class ReverseSorting {
    public static void main(String[] args) {
        int[] randomUnsortedArray = Main.getRandomArray(10);
        String dashes = "-".repeat(30);
        System.out.println(dashes);
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(randomUnsortedArray));
        System.out.println("Descending Order array:");
        Arrays.sort(randomUnsortedArray);
        reverseArray(randomUnsortedArray);
        System.out.println(Arrays.toString(randomUnsortedArray));
    }

    public static void reverseArray(int[] array){
        int i = 0;
        int j = array.length-1;
        while(i<=j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }


}
