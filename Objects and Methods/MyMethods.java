import java.util.Scanner;
public class MyMethods {

    public static int total(int a){

        int b = 100;
        int c = 100;

        int value = a + b + c;
        return value;

    }
    
    public static double decnum(){
        Scanner keyboard = new Scanner(System.in);
        double a;
        System.out.println("What is your favorite decimal? 444.4 or 555.5?: ");
        a = keyboard.nextDouble();
        System.out.println("You chose: " + a);
        return a;

    }

    public static void hello(){
        System.out.println("Hello World!");
        System.out.println("This is a void method.");
        System.out.println("Have a nice weekend!!");

    }
    
}
