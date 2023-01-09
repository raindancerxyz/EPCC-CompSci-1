import java.util.Scanner;
public class SentinelNum1 {
    public static void main(String [] args){

        int score;
        int totalScore = 0;
        int i = 0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter your exam score (1-100) or -1 to stop.");
        score = keyboard.nextInt();

        while(score != -1){
            totalScore += score;
            System.out.println("Enter another score. (1-100) or -1 to stop.");
            score = keyboard.nextInt();
            i++;
        }
        if(i==0 && totalScore ==0){
            i++;
            totalScore++;
        }
        double average = totalScore/i;

        System.out.println("The sum of the scores is: " + totalScore + ". Divide it by the amount of scores: " + i);
        System.out.println("The average score is: " + average);
    }
    
}