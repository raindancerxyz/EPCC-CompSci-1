import javax.swing.JOptionPane;
public class ExcerciseIII {
     /*Rain Brooks
     * 88959572
     * 18 September 2022
     */
    public static void main(String [] args){

        int yourScore = -90000;
        String letterScore;
        String input;

        try {
        input = JOptionPane.showInputDialog("What was your score on the test? (Please input a whole number of 0-100, round decimals up or down) ");
        yourScore = Integer.parseInt(input);
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog( null, "This is an invalid value, please follow the instructions and use only ints/numbers 0-100: " + e);
            System.exit(0);
        }   

        if(yourScore >=1 && yourScore <=100) {
        JOptionPane.showMessageDialog(null, "Your test score is: " + yourScore + ".");
        }
        else{
        JOptionPane.showMessageDialog(null, "This is not a valid test score. Please follow the instructions and submit a value between 0-100. ");  
        }


        if(yourScore >= 90 && yourScore <= 100) {
            letterScore = "A";
            JOptionPane.showMessageDialog(null, "Your assigned letter score is: " + letterScore + ". Good job!");
        }
        else if(yourScore >= 80 && yourScore <= 89) {
            letterScore = "B";
            JOptionPane.showMessageDialog(null, "Your assigned letter score is: " + letterScore + ". Keep it up.");
        }
        else if(yourScore >= 70 && yourScore <= 79) {
            letterScore = "C";
            JOptionPane.showMessageDialog(null, "Your assigned letter score is: " + letterScore + ". You barely passed..");
        }
        else if(yourScore >= 60 && yourScore <= 69) {
            letterScore = "D";
            JOptionPane.showMessageDialog(null, "Your assigned letter score is: " + letterScore + ". I have some bad news..");
            
        }
        else if(yourScore <= 59 && yourScore >= 0) {
            letterScore = "F";
            JOptionPane.showMessageDialog(null, "Your assigned letter score is: " + letterScore + ". Uh...");
        }
    }
}