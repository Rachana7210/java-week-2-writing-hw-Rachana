package HwPractice;

public class Program_4 {
    //4.1 Declare two instance and two static variables.
    //instance variable
    String Name = "prime";
    String Surname = "Testing";
    //static variable
    static boolean a = true;
    static boolean b =  false;

    //4.2 Declare one instance method.
//4.4 call all four intance and static variables into both instance and static methods inside the print statment.#
    public void instanceMethod(){
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(Program_4.a);
        System.out.println(Program_4.b);
}
//4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statment.
public static void staticMethod(){
        Program_4 program_4 = new Program_4();
    System.out.println(program_4.Name);
    System.out.println(program_4.Surname);
    System.out.println(a);
    System.out.println(b);
}
//4.5 Declare the main method.
    //4.6 Call both instance and static methods into the Main method and run the program.
public static void main(String[] args) {
        Program_4 program_4 = new Program_4();
        program_4.instanceMethod();
        staticMethod();


}
}
