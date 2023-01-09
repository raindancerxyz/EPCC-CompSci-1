import java.util.Scanner;
public class ArraysAndMethods {
    public static void main(String [] args){

        double input;
        int scores;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your total amount of scores.");
        scores = obj.nextInt();

        double[] scoreArray = new double[scores];

        for(int i = 0; i < scores ; i++){
            System.out.println("Enter your scores.");
            input = obj.nextDouble();
            scoreArray[i] = input;
        }

        for(int i = 0; i < scoreArray.length; i++){
            System.out.println(scoreArray[i]);
        }

        ArraysAndMethods.print(scoreArray);
        ArraysAndMethods.findAVG(scoreArray);
        System.out.println("Your letter grade average is: " + ArraysAndMethods.getGradeByAVG(scoreArray));
        ArraysAndMethods.findMaxGrade(scoreArray);


    }
//////////////////////////////////////////////////////////////////////
    public static void print(double [] a){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);

        }
    }

    public static double findSum(double[] a){
        double sum = 0.0;
        double current = 0.0;
        for(int i = 0; i < a.length; i++){
            current = a[i];
            sum += current;
        }
        System.out.println("The sum of your new array is: " + sum);
        return sum;
    }

    public static double findAVG(double[] a){
        double avg = 0;
        double sum = findSum(a);

        avg = sum/a.length;

        System.out.println("The average of your new array is: " + avg);

        return avg;
    }

    public static char getGradeByAVG(double[] a){
        double avg = findAVG(a);
        if(avg >= 90){
            return 'A';
        }
        else if(avg >= 80){
            return 'B';
        }
        else if(avg >= 70){
            return 'C';
        }
        else if(avg >= 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public static void findMaxGrade(double[] a){
        double highest = 0;
        for(int i = 0; i < a.length; i++){
            if(highest < a[i]){

                highest = a[i];
                
            }
        }
        System.out.println("Your highest grade is: " + highest);
    }
}
    

