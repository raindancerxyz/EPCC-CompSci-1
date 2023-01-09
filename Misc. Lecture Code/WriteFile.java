import java.util.Scanner;
import java.io.*;
public class WriteFile {
    public static void main(String [] args) throws IOException {

        int numFriends;
        String fileName;
        String friendName;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many friends do you have?");
        numFriends = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Enter the filename: ");
        fileName = keyboard.nextLine();

        PrintWriter outputfile = new PrintWriter(fileName);

            for(int i = 1; i <= numFriends; i++){
                System.out.print("Enter the name of friend number "+i+": ");
                friendName = keyboard.nextLine();
                outputfile.println(friendName);
            }

        keyboard.close();
        outputfile.close();
        System.out.println("Data has been written to file and the file is closed.");    

    }
    
}
