import java.util.Scanner;
import java.io.*;
public class ReadFile{
    public static void main(String [] args) throws IOException{


    File file = new File("friends.txt");
    Scanner inputfile = new Scanner(file);
    
    while(inputfile.hasNext()){
        String name = inputfile.nextLine();
        System.out.println(name);
    }
    inputfile.close();

        
    }
}