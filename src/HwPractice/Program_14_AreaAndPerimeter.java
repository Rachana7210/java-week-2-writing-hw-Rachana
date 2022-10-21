package HwPractice;

import java.util.Scanner;

public class Program_14_AreaAndPerimeter {
    //Calculating area and perimeter ofv rectangle
    public static void areaAndPerimeterofRectangle(int height, int width){
        int perimeter = 2 * (height + width);
        int area = (height *  width);
        System.out.println("The area of the rectangle is :" + area);
        System.out.println("The perimeter of the rectangle is :" + perimeter);
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle:");
        int height = sc.nextInt();
        System.out.println("Enter the height of the rectangle:");
        int width = sc.nextInt();
        areaAndPerimeterofRectangle(height,width);
        //closing the scanner object
        sc.close();


    }
}
