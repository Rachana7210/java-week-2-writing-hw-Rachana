package HwPractice;

import java.util.Scanner;

public class Program_5_Calculator {
    //static methods
    public static void addition(int a,int b){
        int result = a + b;
        System.out.println("The addition of "+ a + " and " + b + "is :" + result);
    }
     public  static int substraction(int a,int b) {
        return  a - b;
     }
     //instance methods
    public void multiplication(int a, int b){
        int result = a * b;
        System.out.println("The multiplication of" + a + " and " + b + "is :" +result);
    }
    public int division(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number :");
        int a = sc.nextInt();
        System.out.println("please enter first number :");
        int b = sc.nextInt();

        addition(a,b);

        int sumResult = substraction(a,b);
        System.out.println("The substraction of " + a + " and "  + b + "is :" +sumResult);

        Program_5_Calculator obj = new Program_5_Calculator();
        obj.multiplication(a,b);

        int divResult = obj.division(a,b);
        System.out.println("The division of " + a + " and "  + b + "is :" +divResult);
        //closing the scanner object
        sc.close();

    }
}
