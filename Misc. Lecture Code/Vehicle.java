import javax.swing.JOptionPane;
import java.util.Scanner;
public class Vehicle {
    public static void main(String [] args){
     
        //JOptionPane variables
     String vehicleName; //What is the name of your Vehicle?
     String vehicleModel; //What is your vehicle model?
     int numberDoors; //How many doors on your vehicle?
     

     String input; //JOptionPane likes Strings only 
     //Scanner variables 

     int vehicleYear; //What year was the vehicle made in?
     int vehicleLife; // Your vehicle life span is?
     double radio; //What is Your favorite radio station?
     
     Scanner keyboard = new Scanner(System.in);

     vehicleName = JOptionPane.showInputDialog("What is the name of your Vehicle?");
     vehicleModel = JOptionPane.showInputDialog("What is your vehicle model?");
     input = JOptionPane.showInputDialog("How many doors on your vehicle?");
     numberDoors = Integer.parseInt(input);

     //Show the user answers
     JOptionPane.showMessageDialog(null, "The name of your vehicle is: " + vehicleName);
     JOptionPane.showMessageDialog(null, "Your vehicle model is: " + vehicleModel);
     JOptionPane.showMessageDialog(null, "The amount of doors on your vehicle is:" + numberDoors);

     //Scanner question
     System.out.println("What year was the vehicle made in?");
     vehicleYear = keyboard.nextInt();
     System.out.println("Your vehicle life span is?");
     vehicleLife = keyboard.nextInt();
     System.out.println("What is your favorite radio station?");
     radio = keyboard.nextDouble();

     //Results

     System.out.println("The year your vehicle was me in is:" + vehicleYear);
     System.out.println("The life span of your vehicle is:" + vehicleLife);
     System.out.println("Your favorite radio station is" + radio);

     keyboard.close();
     




    }
    
}
