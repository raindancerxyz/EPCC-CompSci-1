import javax.swing.JOptionPane;
public class ExerciseV {
    public static void main(String [] args){

        int score;
        String input;
        String repeat;

        do{
            input = JOptionPane.showInputDialog("Enter score 1:");
            score = Integer.parseInt(input);

            while(score  <0 && score >100){
                JOptionPane.showMessageDialog(null, "You did not input a valid number, pleaes only use inputs 0-100 and try again.");
                input = JOptionPane.showInputDialog("Enter score 2:");
            }
            JOptionPane.showMessageDialog(null, "Your score is: " + score);

            repeat = JOptionPane.showInputDialog("Do you want to input another score? " + 
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
    

