package HwPractice;

import java.util.Scanner;

public class Program_16_AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("Welcome to java program to add two binary numbers");
        //Scanner declaration for reading input for console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first binary number");
        String first = sc.nextLine();
        System.out.println("Please enter secondary binary number");
        String second = sc.nextLine();
        String addition = addTwoBinaryNumbers(first,second);
        System.out.println("The addition of two binary number is :"+ addition);
        //Closing the scanner object
        sc.close();
    }
    //Adding the two Binary Numbers
    public static String addTwoBinaryNumbers(String first, String second){
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);

    }
}
