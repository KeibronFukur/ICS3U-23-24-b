package lesson5;

import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Please enter a number: ");
            int usDollars = in.nextInt();

            double canadianDollars = usDollars * 1.25;
            
            System.out.println("The amount in canadian dollars is: " + canadianDollars);

            in.close();
    }
}
