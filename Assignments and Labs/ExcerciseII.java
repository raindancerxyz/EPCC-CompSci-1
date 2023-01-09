import javax.swing.JOptionPane;
public class ExcerciseII {
   /*Angel Salazar
    * 88815721
    09-23-2022
    */
    /**
     * @param args
     */
    public static void main(String [] args){
        int userScore; 
        String input;

         

    
        
        input = JOptionPane.showInputDialog("Enter score between 0-100");
        userScore = Integer.parseInt(input);
        
        


        
        
        
        if(userScore >= 0 && userScore <= 100){
            JOptionPane.showMessageDialog(null, "Your score is: " + userScore );


        } 
        else{JOptionPane.showMessageDialog(null, "You entered an invalid number:");

        }
        if (userScore >= 90 && userScore <= 100){
            JOptionPane.showMessageDialog(null, "You scored an A");


        }
        else if (userScore >= 80 && userScore <= 89){
            JOptionPane.showMessageDialog(null, "You scored an B");
        }
        else if (userScore >= 70 && userScore <= 79){
            JOptionPane.showMessageDialog(null,"You scored a C");
        }
        else if (userScore >= 60 && userScore <= 69){
            JOptionPane.showMessageDialog(null,"You scored a D");
        }
        else if (userScore <= 59){
            JOptionPane.showMessageDialog(null,"You scored an F");
        }
    
         
        

        }


    }
    

