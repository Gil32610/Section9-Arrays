package dev.lpa.arrayreferences;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        // References are addresses to objects in memory, not the object itself

        int[] anotherArray = myIntArray;
        //This is a way to store a primitive value (Value Type)

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("myIntArray: " + Arrays.toString(myIntArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);
        // The address is copied to the parameter
        // Passing a reference to the object.
        System.out.println("myIntArray after change: " + Arrays.toString(myIntArray));
        System.out.println("myIntArray after change: " + Arrays.toString(myIntArray));
    }

    private static void modifyArray(int [] array){
        array[1] = 2;

    }
}
