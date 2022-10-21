package HwPractice;

public class Program_3 {
//3.1 Declare one instance and one static variable.
    String name = "Prime";
    static String surname = "Testing";

    //3.2 Declare one instance method
    //3.4 call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(Program_3.surname);
        System.out.println(surname);
    }
    //3.3 Declare one static method.
    //3.4 call bothinstance and static variables into both instance and static methods inside the print statment.

    public static  void staticMethod(){
        Program_3 program_3 = new Program_3();
        System.out.println(program_3.name);
        System.out.println(Program_3.surname);
    }
    //3.5 Declare the main method.
    //3.6 Call both instance and static methods into the main method and run the program.
    public static void main(String[] args) {
        Program_3 program_3 = new Program_3();
        program_3.instanceMethod();
        staticMethod();
    }

}
