package HwPractice;

import java.util.Scanner;

public class Program_6AreaOfCircle {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius :");
        double radius = sc.nextDouble();
        areaOfCircle(radius);
        //closing the scanner object
        sc.close();
    }
    //Calculating the area of circle
    public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The Area of Circle is : " +area);
        }
    }

