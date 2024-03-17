package dev.lpa.exercises;

import java.util.Scanner;

 class MinumumElement {

    private static int readInteger(){
        Scanner s = new Scanner(System.in);
        int elements = s.nextInt();
        return elements;
    }

    private static int[] readElements(int elements){
        Scanner s = new Scanner(System.in);
        int[] values = new int[elements];
        for (int i = 0; i <elements ; i++) {
            values[i] = s.nextInt();
        }
        return values;
    }

    private static int findMin(int[] values){
        int min = Integer.MAX_VALUE;

        for(int element: values){
            if(element < min) min = element;
        }
        return min;
    }
}
