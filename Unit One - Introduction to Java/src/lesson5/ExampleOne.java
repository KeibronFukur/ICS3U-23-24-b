package lesson5;

import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        // declare a variable to assign the scanner object
        Scanner input; //need to import the scannr to use it

        input = new Scanner(System.in); // System.in refers to the keyboard
                                        // Input variable is a Scanner that gets
                                        // input from the keyboard
        input.close();
    }
}
