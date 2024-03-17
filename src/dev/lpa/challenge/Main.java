package dev.lpa.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] intArray = readIntegers();
        System.out.println("Array before reversing it:");
        System.out.println(Arrays.toString(intArray));
        System.out.println("Array after reversing it:");
        reverse(intArray);
        System.out.println(Arrays.toString(intArray));

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

    //Mutating method
    private static void reverse(int[] array) {
        int s = 0, e = array.length - 1;
        while (s < e) {
            int temp = array[s];
            array[s++] = array[e];
            array[e--] = temp;
        }
    }

    //Non mutating method
    private static int[] reverseCopy(int[] array) {
        int[] newArray = new int[array.length];
        int maxIndex = array.length;
        for (int el : array) {
            newArray[maxIndex--] = el;
        }
        return newArray;
    }


}
