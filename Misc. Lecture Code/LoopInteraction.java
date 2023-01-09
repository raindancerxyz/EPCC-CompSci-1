import java.util.Scanner;
public class LoopInteraction {
    public static void main(String [] args){

        int n;
        String computerUserName;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your computer's username.");
        computerUserName = keyboard.nextLine();
        System.out.println("Enter a number.");
        n = keyboard.nextInt();

        // do{    
        //     System.out.println(computerUserName);    
        //     n = n - 1;   
        //     keyboard.close(); 
        // }while(n > 0); 
        

        
        
        //while (n > 0) {
            //System.out.println(computerUserName);
      
            //n = n - 1;
            //keyboard.close();

          //}


        for(int i = 1; i <= n; ++i){
            System.out.println(computerUserName);
             keyboard.close();
         } 




    
    }
    
}
