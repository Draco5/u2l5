package main.java;
import java.util.Scanner;

public class ConstructionTester {
    public static void main(String[] args) {
        // Start here!
        Scanner scan = new Scanner(System.in);

        // tax rate
        System.out.println("Enter the sales tax rate:");
        double taxRate = scan.nextDouble();

        //how many boards are needed
        System.out.println("How many boards do you need? ");
        int numBoards = scan.nextInt();

        //how many windows are needed
        System.out.println("How many windows do you need? ");
        int numWindows = scan.nextInt();

        Construction construct = new Construction(8, 11, taxRate);
        {
            double total = construct.lumberCost(numBoards) + construct.windowCost(numWindows);
            double grandTotal = total * (1+taxRate);
            System.out.println("Total: " + total);
            System.out.println("Grand Total: " + grandTotal);

        }

    }
}