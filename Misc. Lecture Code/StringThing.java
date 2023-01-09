public class StringThing {
    public static void main(String [] args){

        String name1 = "Astronomy";
        String name2 = "DISCUS";

        if(name1.equalsIgnoreCase("Astronomy")){
            System.out.println("These strings are equal.");
        }
        else{
            System.out.println("These strings are not equal.");
        }

        if(name2.equals("DISCUS")){
            System.out.println("These strings are equal.");
        }
        else{
            System.out.println("These strings are not equal.");
        }
    }
}
