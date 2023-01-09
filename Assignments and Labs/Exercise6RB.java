/*  Rain Brooks
    88959572
    10-16-22
 */
import javax.swing.JOptionPane;
public class Exercise6RB {
    public static void main(String [] args){

        Exercise6RB.getHeader();

        int value = Exercise6RB.getAnother(50);
        System.out.print("The value is: " + value);

        Exercise6RB.ageMethod();

        Exercise6RB.radioMethod();

    }

    public static void getHeader(){
        
        System.out.println("Programming in Java is fun!");

    }

    public static int getAnother(int a){

        int b = 50;

        int c = b + b;
        return c;

    }

    public static int ageMethod(){

        String input = JOptionPane.showInputDialog("What is your age?");
        int age = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, "Your age is: " + age);

        return age;
    }
    
    public static double radioMethod(){

        String input = JOptionPane.showInputDialog("What is your favorite radio station?");
        double station = Double.parseDouble(input);
        JOptionPane.showMessageDialog(null, "Your favorite radio station is: " + station);

        return station;
    }
}
