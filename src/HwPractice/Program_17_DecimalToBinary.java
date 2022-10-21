package HwPractice;

import java.util.Scanner;

public class Program_17_DecimalToBinary {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        System.out.println("welcome to java program to convert decimal to binary numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter decimal number");
        int number = sc.nextInt();
        convertDecimalToBinary(number);
        //Closing the scanner object
        sc.close();
    }
    //Coneverting the decimal to binary
    public static void convertDecimalToBinary(int number){
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is: "+ binary);

    }
}
