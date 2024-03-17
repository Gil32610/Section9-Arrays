package dev.lpa.exercises;

import java.util.Arrays;

class ReverseArray {

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int s = 0, e = array.length - 1;
        while (s < e) {
            int temp = array[s];
            array[s++] = array[e];
            array[e--] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));

    }

}
