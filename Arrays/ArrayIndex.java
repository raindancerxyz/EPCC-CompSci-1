public class ArrayIndex{
    public static void main(String [] args){
        
        /* int [] example = new int[5];         Array made via Assignemnt

        example[0] = 2;
        example[1] = 4;
        example[2] = 6;         
        example[3] = 8;
        example[4] = 10;

        System.out.println(example[3]);*/
        int [] example= {2, 4, 6, 8, 10};     //Array made via Initialization/Dynamically

        //System.out.println(example[3]);

        for(int i = 0; i <= example.length; i++){
            System.out.println(i + "\t" + example[i]);
        }
    }

    
}