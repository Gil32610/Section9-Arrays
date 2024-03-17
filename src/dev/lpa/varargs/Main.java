package dev.lpa.varargs;

public class Main {
    public static void main(String ... args) {
        System.out.println("Hello World Again");
        String[] splitStrings= "Hello World Again".split(" ");
        printText(splitStrings);
        //Accepts variable arguments
        // Gives a lot more options
        System.out.println("-".repeat(30));
        printText("Hello");

        System.out.println("-".repeat(30));
        printText("Hello", "World", "again");
        System.out.println("-".repeat(30));
        printText();

        //Anonymous declaration
        //Type isn't included but java figures it out because it's being used in a declaration statement
        String [] sArray = {"First", "Second", "Third", "Fourth", "Fifth"};
        System.out.println(String.join(",", sArray));


    }
    //There can only be one variable argument in a method
    //The variable argument must be the last argument
    private static void printText(String... textList){
        for (String t: textList){
            System.out.println(t);
        }
    }
}
