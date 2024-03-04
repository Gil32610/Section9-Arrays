package dev.lpa.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(10);
        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
        int[] emptyArray = new int[10];
        System.out.println(Arrays.toString(emptyArray));
        Arrays.fill(emptyArray, 5);
        System.out.println(Arrays.toString(emptyArray));

        int[] originalArray = getRandomArray(10);
        System.out.println(Arrays.toString(originalArray));
        int[] cloneArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println(Arrays.toString(cloneArray));

        Arrays.sort(cloneArray);
        System.out.println("Clone: ");
        System.out.println(Arrays.toString(cloneArray));
        System.out.println("Original: ");
        System.out.println(Arrays.toString(originalArray));
    }

    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i= 0; i<newInt.length; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

}
