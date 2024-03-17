package dev.lpa.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] intArray = readIntegers();
        System.out.println(Arrays.toString(intArray));
        System.out.println("Minimum number in the array: " + findMin(intArray));
    }
    public static int findMin(int ... array){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(min>array[i]) min = array[i];
        }

        return min;
    }

    public static int[] readIntegers(){
        int [] array = new int[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter next number:");
            array[i] = Integer.parseInt(s.nextLine());
        }
        return array;
    }


}
