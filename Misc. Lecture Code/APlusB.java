import javax.swing.JOptionPane;
public class APlusB {
    public static void main(String [] args){

        int a;
        int b;
        String input;

        input = JOptionPane.showInputDialog("Please enter two variables for a and b. A:");
        a = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("B:");
        b = Integer.parseInt(input);

        JOptionPane.showMessageDialog(null, "A + B is: " + (a + b));

        

    }
    
}
