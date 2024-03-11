package dev.lpa.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String dashes = "-".repeat(30);
        System.out.println(dashes);

        int[] randomArray = getRandomArray(10);
        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(randomArray));
        System.out.println(dashes);

        System.out.println("Default values array:");
        int[] emptyArray = new int[10];
        System.out.println(Arrays.toString(emptyArray));
        System.out.println("Filled array:");
        Arrays.fill(emptyArray, 5);
        System.out.println(Arrays.toString(emptyArray));
        System.out.println(dashes);

        System.out.println("Original Array:");
        int[] originalArray = getRandomArray(10);
        System.out.println(Arrays.toString(originalArray));
        System.out.println("Clone Array:");
        int[] cloneArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println(Arrays.toString(cloneArray));
        System.out.println(dashes);

        Arrays.sort(cloneArray);
        System.out.println("Clone: ");
        System.out.println(Arrays.toString(cloneArray));
        System.out.println("Original: ");
        System.out.println(Arrays.toString(originalArray));
        System.out.println(dashes);

        System.out.println("Reduced copy of an array:");
        int[] smallerArray = Arrays.copyOf(originalArray,3);
        System.out.println(Arrays.toString(smallerArray));
        System.out.println("Larger copy of an array:");
        int[] largerArray = Arrays.copyOf(originalArray, 20);
        System.out.println(Arrays.toString(largerArray));
        System.out.println(dashes);

        String[] names = {"Bob", "Alice", "Donald", "Clark"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        if(Arrays.binarySearch(names, "Clark")>=0){
            System.out.println("Clark is on the list!");
        }
        System.out.println(dashes);

        System.out.println("Comparing arrays:");
        int[] A = {1,2,3,4};
        int[] B = {1,2,3,4};
        if(Arrays.equals(A,B)){
            System.out.println("Arrays are equal");
        }else System.out.println("Arrays are not equal");
    }

    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i= 0; i<newInt.length; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

}
