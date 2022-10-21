package HwPractice;

import java.util.Scanner;

public class Program_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the uppercase string :");
        String uppercase = sc.nextLine();
        Program_9_ConvertUpperToLowerCase t = new Program_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        //closing the scanner object
        sc.close();
    }

    //Converion of Uppercase to lower case method
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The Lowercase value is =" +text.toLowerCase());
    }
}
