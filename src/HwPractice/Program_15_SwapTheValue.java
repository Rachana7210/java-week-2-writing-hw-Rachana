package HwPractice;

import java.util.Scanner;

public class Program_15_SwapTheValue {
    public static void main(String[] args) {
        //scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first variable value :");
        int first = sc.nextInt();
        System.out.println("Enter the second variable value :");
        int second = sc.nextInt();
        Program_15_SwapTheValue t = new Program_15_SwapTheValue();
        t.swapTheValue(first,second);
        //closing the scanner object
        sc.close();
    }

    //Swapping the value of variables
    public void swapTheValue(int a, int b){
        int c;
        System.out.println("Before the swapping, The values of first variable is:" + a + "and second variable is:"+b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is:" + a + "and second variable is:"+b);
    }
}
