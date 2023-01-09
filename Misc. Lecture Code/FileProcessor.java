import java.lang.Math;
import java.io.*;
import java.util.Scanner;
public class FileProcessor{
    public static void main(String [] args)throws IOException{
        int n = 0;
        int i = 0;
        int sum = 0;
        int mean = 0;
        int sub = 0;
        double pow = 0.0;
        double sigma = 0.0;
        double frac = 0.0;
        double stdev = 0.0;
        int currentnum;

        int highest = 0;
        int lowest = 666;

        File file = new File("numbers.txt");
        Scanner input = new Scanner(file);
        Scanner input2 = new Scanner(file);

        while(input.hasNext()){
            n++;
            String line = input.nextLine();

                if(highest < Integer.parseInt(line)){

                    highest = Integer.parseInt(line);
                    
                }
                if(lowest >= Integer.parseInt(line)){
                    
                    lowest = Integer.parseInt(line);
                }  

            sum += Integer.parseInt(line);     
        }

        mean = sum / n;

        while(input2.hasNext()){
            int line = input2.nextInt();
            currentnum = line;
            int test = currentnum - mean; 
            pow = Math.pow(test, 2);
            sigma += pow;
            }     

        mean = sum / n;
        System.out.println("The sum is: " + sum); 
        System.out.println("The mean is: " + mean); 
        System.out.println("The highest number is: " + highest); 
        System.out.println("The lowest number is: " + lowest);   
        frac = sigma / n - 1;
        //printing these out for testing purposes   
        //
        stdev = Math.sqrt(frac);
        System.out.println("The standard deviation is: " + stdev);
    }
}        
