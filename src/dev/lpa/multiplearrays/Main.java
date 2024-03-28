package dev.lpa.multiplearrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];
        System.out.println();
        System.out.println("array length: " + array2.length);

        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < array2[i].length; j++) {
                //System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);
            }
            //System.out.println();
        }
        System.out.println("The var type can infer the type during runtime");
        for (var outer : array2) {
            for (var element : outer) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("-".repeat(30));
        System.out.println("Deep to String method prints 2D arrays");
        System.out.println(Arrays.deepToString(array2));

        //Anonymous array initializer cannot be used!
        array2[1] = new int[]{10, 20, 30};
        System.out.println("-".repeat(30));
        System.out.println("Level 2 arrays can be assigned with inner arrays with different sizes");
        System.out.println(Arrays.deepToString(array2));
        System.out.println("-".repeat(30));
        System.out.println("Object array can have any type of array");
        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));
        anyArray[0] = new String[]{"alucard", "bahamut", "chimera"};
        System.out.println(Arrays.deepToString(anyArray));
        anyArray[1] = new String[][]{
                {"1", "2"}, {"3", "4", "5"}, {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));
        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));
        for (Object element : anyArray) {
            System.out.println("element type: " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[])element));
        }
    }
}
