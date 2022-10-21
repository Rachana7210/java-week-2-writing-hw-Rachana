package HwPractice;

import java.util.Scanner;

public class Program_18_PrintOperation {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = sc.nextInt();
        Program_18_PrintOperation printOperation = new Program_18_PrintOperation();
        printOperation.printTheOperation(firstNumber,secondNumber);
        //Closing the scanner object
        sc.close();
    }
    //printing the all operations
    public void printTheOperation(int a, int b){
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
        System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
        System.out.println("The product of " + a + " and " + b + " is " + (a * b));
        System.out.println("The division of " + a + " and " + b + " is " + (a / b));
        System.out.println("The remainder of " + a + " and " + b + " is " + (a % b));
    }
}
