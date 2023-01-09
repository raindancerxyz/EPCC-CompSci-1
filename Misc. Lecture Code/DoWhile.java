import javax.swing.JOptionPane;
public class DoWhile{
    public static void main(String [] args){

        String color;
        String repeat;

        do{
            color = JOptionPane.showInputDialog("**Pick a color: Black, Brown, or Blue**");

            while(!color.equalsIgnoreCase("Black") && !color.equalsIgnoreCase("Brown") && !color.equalsIgnoreCase("Blue")){
                JOptionPane.showMessageDialog(null, "You did not choose Black, Brown, or Blue. Try again.");
                color = JOptionPane.showInputDialog("Pick a color: Black, Brown, or Blue");
            }
            JOptionPane.showMessageDialog(null, "You chose the color: " + color);

            repeat = JOptionPane.showInputDialog("Do you want to input another color? " + 
                                                "Enter Y for yes or N for no.");
        }
        while(repeat.equalsIgnoreCase("Y"));

        if(repeat.equalsIgnoreCase("N")){
            JOptionPane.showMessageDialog(null, "You entered: " + repeat +
                                            ". The program will now  close and exit!");
        }
        else {
            JOptionPane.showMessageDialog(null, "You entered: " + repeat + 
                                                ". Only Y or N is required! Shutting down.");
            System.exit(0);
        }
        System.exit(0);
    }
}