package HwPractice;

import java.util.Scanner;

public class Program_7TempConversion {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit :");

        float temp = sc.nextFloat();
        //object creation
        Program_7TempConversion t = new Program_7TempConversion();
        t.convertTempToDegreeCelsius(temp);
        //closing the scanner object
        sc.close();
    }
    //Temperature conversion method
    public void convertTempToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5/9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c +" degree celsius");
    }
}
