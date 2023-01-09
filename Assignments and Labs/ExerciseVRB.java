import javax.swing.JOptionPane;
public class ExerciseVRB {
    public static void main(String [] args){

        int score;
        int score2;
        String input;
        String repeat;

        do{
            input = JOptionPane.showInputDialog("Enter score 1, using only whole values between 0-100: ");
            score = Integer.parseInt(input);

            
            while((score < 0 || score > 100)){
                JOptionPane.showMessageDialog(null, "You did not input a valid number, please only use inputs 0-100 and try again.");
                
                input = JOptionPane.showInputDialog("Enter score 1: ");
                score = Integer.parseInt(input);
            }
            
            JOptionPane.showMessageDialog(null, "You chose the score: " + score);

            input = JOptionPane.showInputDialog("Enter score 2, using only whole values between 0-100: ");
            score2 = Integer.parseInt(input);

            while(score2 < 0 || score2 > 100){
                JOptionPane.showMessageDialog(null, "You entered an invalid number, please only use inputs 0-100 and try again.");
                input = JOptionPane.showInputDialog("Enter score 2: ");
                score2 = Integer.parseInt(input);
            }
            
            JOptionPane.showMessageDialog(null, "You chose the score: " + score2);                  
            repeat = JOptionPane.showInputDialog("Do you want to input another set of scores? Enter Y for yes or N for no.");            
        }   
        while(repeat.equalsIgnoreCase("Y"));

        if(repeat.equalsIgnoreCase("N")){
            JOptionPane.showMessageDialog(null, "The user chose: " + repeat + ". The program will now  close and exit!");
        }
        else {
            JOptionPane.showMessageDialog(null, "The uer chose: " + repeat +  ". Only Y or N is required! Shutting down. . . . . . . .");
            System.exit(0);
        }
        System.exit(0);
    
           

    }   
}

