package dev.lpa.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] intArray = readIntegers();
        System.out.println(Arrays.toString(intArray));
        System.out.println("Minimum number in the array: " + findMin(intArray));
    }

    public static int findMin(int... array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }

        return min;
    }

    public static int[] readIntegers() {
        Scanner s = new Scanner(System.in);
        int[] array = null;
        System.out.println("Input the array elements separated by comma:");
        String input = s.nextLine();
        String[] split = input.split(",");
        array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i].trim());
            //Remove empty spaces and trailing from the string
        }
        return array;
    }


}
