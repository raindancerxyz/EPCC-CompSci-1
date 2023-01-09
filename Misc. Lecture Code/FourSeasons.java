import java.util.Scanner;
public class FourSeasons {
    public static void main(String [] args){

        boolean flag = false;
        String decision;
        String season;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your favorite season?");
        season = keyboard.nextLine().toLowerCase();

        while(!flag){

        if(season.equals("spring")){
            System.out.println("Time for Spring break!");
        }
        else if(season.equalsIgnoreCase("summer")){
            System.out.println("Summer school is here!");
        }
        else if(season.equalsIgnoreCase("fall")){
            System.out.println("Thanksgiving time!");
        }
        else if(season.equalsIgnoreCase("winter")){
            System.out.println("Christmas time!");
        }
        else{
            System.out.println("Invalid input. Please enter a season with correct spelling.");

            System.out.println("What is your favorite season?");
            season = keyboard.nextLine().toLowerCase();
        }

        if(season.equalsIgnoreCase("winter") || season.equalsIgnoreCase("summer") ||
        season.equalsIgnoreCase("fall") ||season.equalsIgnoreCase("spring")){
            System.out.println("Would you like to enter another season? Y for yes and write exit to exit.");

            decision = keyboard.nextLine().toLowerCase();

        do{
            if(decision.equalsIgnoreCase("exit")){
                flag = true;
                System.out.println("Thank you for partcipating.");
                System.exit(0);
            }
            else if(decision.equalsIgnoreCase("y")){
                System.out.println("What is your favorite season?");
                season = keyboard.nextLine().toLowerCase();
                break;
            }
            else{
                System.out.println("Invalid input. Please enter a valid answer: Y for yes and writ exit to exit.");
                decision = keyboard.nextLine().toLowerCase();
            }
        }
        while(decision != "y" || decision != "exit" );
        
    
    
    }
    
        



        }

        }
        


    }
