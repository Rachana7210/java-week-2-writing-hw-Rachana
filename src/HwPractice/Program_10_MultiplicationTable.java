package HwPractice;

import java.util.Scanner;

public class Program_10_MultiplicationTable {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number :");
        int number = sc.nextInt();
        multiplicationTableOf(number);
        //closing the scanner object
        sc.close();
    }
    //printing the multiplication table of entered number
    public static void multiplicationTableOf(int number){
        System.out.println(number + "x" + 1 + " = " + (number));
        System.out.println(number + "x" + 2 + " = " + (number*
     2));
        System.out.println(number + "x" + 3 + " = " + (number*
     3));
        System.out.println(number + "x" + 4 + " = " + (number*
     4));
        System.out.println(number + "x" + 5 + " = " + (number*
     5));
        System.out.println(number + "x" + 6 + " = " + (number*
     6));
        System.out.println(number + "x" + 7 + " = " + (number*
     7));
        System.out.println(number + "x" + 8 + " = " + (number*
     8));
        System.out.println(number + "x" + 9 + " = " + (number*
     9));
        System.out.println(number + "x" + 10 + " = " + (number*
    10));
    }
}
