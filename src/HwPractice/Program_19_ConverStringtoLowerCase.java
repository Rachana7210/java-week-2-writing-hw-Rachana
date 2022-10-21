package HwPractice;

import java.util.Scanner;

public class Program_19_ConverStringtoLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence:" );
        String uppercase = sc.nextLine();
        Program_19_ConverStringtoLowerCase t = new Program_19_ConverStringtoLowerCase();
        t.convertStringToLowerCase(uppercase);
        //closing the scanner object
        sc.close();
    }
    //convert string the to lower case
    public void convertStringToLowerCase(String str){
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}
