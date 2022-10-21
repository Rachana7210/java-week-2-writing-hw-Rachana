package HwPractice;

import java.util.Scanner;

public class Program_8_AreaOfTriangle {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese enter the length of the triangle");
        int length = sc.nextInt();
        System.out.println("Plese enter the height of the triangle");
        int height = sc.nextInt();
        areaOfTriangle(height, length);
        //closing the scanner object
        sc.close();
    }
     // calculating the area of triangle with no return type with parameter method
     public static void areaOfTriangle(int length, int height){
       int area = (length * height)/2;
         System.out.println("The Area of a triagle is : " + area);


     }
}

