package HwPractice;

public class Program1 {
    //1.1 Declare two instance variables.
    int a = 10;
    int b = 20;

    //1.2Declare one instance method
    //1.3 call both instance variables into the instance method inside the print statement.

    public void instanceMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    //1.4 Declare the main method.
    //1.5 call the above instance method into the main method and Run the programe.

    public static void main(String[] args) {
        Program1 program1 = new Program1();
        program1.instanceMethod();
    }


}
