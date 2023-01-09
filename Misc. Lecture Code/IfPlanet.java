import javax.swing.JOptionPane;  
public class IfPlanet {
    public static void main(String [] args){

        int amountOfPlanets = -300;
        String input;
        String planet;

        try {
        input = JOptionPane.showInputDialog("Pick a planet! (1-9)");
        amountOfPlanets = Integer.parseInt(input);
        }
        catch(Exception e){
            System.out.println("You inputted an invalid value, only ints: " + e);
            System.exit(0);
        }   

        if(amountOfPlanets == 1) {
            System.out.println("You chose planet 1.");
            planet = "Mercury";
        }
        else if(amountOfPlanets == 2){
            System.out.println("You chose planet 2.");
            planet = "Venus";
        }
        else if(amountOfPlanets == 3){
            System.out.println("You chose planet 3.");
            planet = "Earth";
        }
        else if(amountOfPlanets == 4){
            System.out.println("You chose planet 4.");
            planet = "Mars";
        }
        else if(amountOfPlanets == 5){
            System.out.println("You chose planet 5.");
            planet = "Jupiter";
        }
        else if (amountOfPlanets == 6){
            System.out.println("You chose planet 6.");
            planet = "Saturn";
        }
        else if (amountOfPlanets == 7){
            System.out.println("You chose planet 7.");
            planet = "Uranus";
        }
        else if (amountOfPlanets == 8){
            System.out.println("You chose planet 8.");
            planet = "Neptune";
        }
        else if (amountOfPlanets == 9){
            System.out.println("You chose planet 9.");
            planet = "Pluto";
        }
        else {
            System.out.println("You chose an invalid planet.. Come on fam..");
            planet = "Invalid planet.";
        }
       /*********************************************************************************************************************/ 

       if(amountOfPlanets > 0 && amountOfPlanets < 5){
           System.out.println("You chose an inner planet. " + "You chose: " + planet + ".");
       }
       else if(amountOfPlanets > 4 && amountOfPlanets < 10){
           System.out.println("You chose an out planet. " + "You chose: " + planet + ".");
       }
        
        /*catch(Exception e){
            System.out.println("You inputted an invalid value, only ints: " + e);
            System.exit(0);
        }*/

    
    }
    
}
