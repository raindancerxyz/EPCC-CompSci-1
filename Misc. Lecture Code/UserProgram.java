import javax.swing.JOptionPane; 
import java.util.Scanner; 
public class UserProgram {
    public static void main(String [] args){

        //JOptionPane variables
        String favPlanet; //What is your favorite planet in the solar system?
        String earth; //What is the name of our planet?
        int amountOfPlanets; //How many planets in the Solar System?
        double ageEarth; //How old is planet Earth? (input 4.6)

        String input; //JOptionPane likes Strings only
        //Scanner variables
        String fish; //What is your favorite type of fish?
        int amountFish; //How many discus do I have?
        double costFish; //How much is a discus fish?

        Scanner keyboard = new Scanner(System.in);
    

        favPlanet = JOptionPane.showInputDialog("What is your favorite planet in the Solar System?");
        earth = JOptionPane.showInputDialog("What is the name of our planet?");

        input = JOptionPane.showInputDialog("How many planets are in our Solar System? (Enter 1-9)");
        amountOfPlanets = Integer.parseInt(input);

        input = JOptionPane.showInputDialog("How old is planet Earth? (input 4.6)");
        ageEarth = Double.parseDouble(input);

        //Show the user their answers
        JOptionPane.showMessageDialog(null, "Your favorite planet is: " + favPlanet);
        JOptionPane.showMessageDialog(null, "The name of our plane is: " + earth);
        JOptionPane.showMessageDialog(null, "There are " + amountOfPlanets +  " planets in our solar system!");
        JOptionPane.showMessageDialog(null, "The age of planet Earth is: " + ageEarth +  " billion years old!");

        //Scanner question
        System.out.println("What is your favorite type of fish?");
        fish = keyboard.nextLine();
        System.out.println("How many discus do I have? input 12" );
        amountFish = keyboard.nextInt();
        System.out.println("How much is a discus fish? input 200.99");
        costFish = keyboard.nextDouble();
        //Results
        System.out.println("Your favorite fish is: " + fish);
        System.out.println("You have " + amountFish + " discus fish.");
        System.out.println("You spent " + costFish + " on a single fish.");

        keyboard.close();







    }
}
