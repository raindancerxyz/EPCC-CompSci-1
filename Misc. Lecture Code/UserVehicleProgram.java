import javax.swing.JOptionPane; 
import java.util.Scanner; 
public class UserVehicleProgram {
    /*Rain Brooks
     * 88959572
     * 5 September 2022
     */
    public static void main(String [] args){
        String vehicleMake;
        String vehicleModel;
        int amountOfDoors;
        String input;
        int yearMade;
        int totalLifeSpan;
        double favoriteRadioStation;

        Scanner keyboard = new Scanner(System.in);

        vehicleMake = JOptionPane.showInputDialog("What is the make of your vehicle? (Example: Chevy)");
        vehicleModel = JOptionPane.showInputDialog("What is the model of your vehicle? (Example: Malibu");
        input = JOptionPane.showInputDialog("How many doors does it have?");
        amountOfDoors = Integer.parseInt(input);
        
        JOptionPane.showMessageDialog(null, "The make of your vehicle is: " + vehicleMake);
        JOptionPane.showMessageDialog(null, "The model of your vehicle is: " + vehicleModel);
        JOptionPane.showMessageDialog(null, "Your vehicle has " + amountOfDoors +  " doors.");

        System.out.println("What year was your vehicle made in? (Example: 2012, 1997, 1998)");
        yearMade = keyboard.nextInt();
        System.out.println("What is the total lifespan of your vehicle? (Please use numbers only. Example: 10, 5, 2)" );
        totalLifeSpan = keyboard.nextInt();
        System.out.println("What is your favorite radio station? (Example: 99.9, 95.5, 93.1 etc.)");
        favoriteRadioStation = keyboard.nextDouble();
        
        System.out.println("Your vehicle was made in: " + yearMade + ".");
        System.out.println("The total lifespan of your vehicle is: " + totalLifeSpan + " years.");
        System.out.println("Your favorite radio station is: " + favoriteRadioStation +".");

        keyboard.close();
        



    }
    
}
