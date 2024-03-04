package dev.lpa;

public class Main {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[0] = 5;
        double[] myDoubleArray = new double[10];
        myDoubleArray[0] = 5.5;

        int[] firstFivePositives = {1, 2, 3, 4, 5};

        for (int i = 0; i < firstFivePositives.length; i++) {
            System.out.println(firstFivePositives[i] + " ");
        }

        int[] sortedArray;
        sortedArray = new int[]{1, 4, 6, 8, 12, 65};


        int[] arrayInitializationExample;
        arrayInitializationExample = new int[3];
        System.out.println("All primitive types starts with default values");
        for (int i = 0; i < 0; i++) {
            System.out.print(arrayInitializationExample[i]+ " ");
        }
        //Adding values
        for (int i = 0; i < arrayInitializationExample.length; i++) {
            arrayInitializationExample[i] = i+1;
        }
        System.out.println("-".repeat(30));
        for (int element: arrayInitializationExample){
            System.out.print(element + " ");
            //actual element (not index)
        }
        System.out.println(arrayInitializationExample);
        //Prints the hashcode
        //I@hashcode
        String elementsOnArray = Arrays.toString(arrayInitializationExample);
        System.out.println(elementsOnArray);

        Object objectVariable = arrayInitializationExample;
        if(objectVariable instanceof  int[]){
            System.out.println("This is an integer array");
        }

        //It can accept any object reference
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = new int[12];

    }
}
