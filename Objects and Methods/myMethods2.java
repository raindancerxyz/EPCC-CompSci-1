import javax.swing.JOptionPane;
public class myMethods2{

    public static void main(String [] args){
    
    myMethods2.getHeader();
    
    myMethods2.totall(50);
    

    }
    
    public static void getHeader(){
        System.out.println("programming in java is fun"); 
    }

    public static int totall(int a){
        int b = 50;
        int c = 50;
        int value = a + b + c;
        return value;
    }

     
    
    
    public static int total(){

     int age;
     String input;

     input = JOptionPane.showInputDialog("What is your age?");
     age = Integer.parseInt(input);
     JOptionPane.showMessageDialog(null, "Your age is:" + age);
     return age;







     }
     public static double rad(){
        double radio;
        String input;

        input = JOptionPane.showInputDialog("What is your favorite radio station");
        radio = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, "Your favorite radio station is:" + radio);
        return radio;

     }


}
        
         
     

    

    

