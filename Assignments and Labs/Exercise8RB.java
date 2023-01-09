public class Exercise8RB {
    public static void main(String [] args){

        MyMethods9 box1 = new MyMethods9();
                
        box1.setBacon("I'm not sure, but I think we're running out of bacon...");
        box1.setEggs(888);
        box1.setHam(8.42);

        System.out.println("How much bacon do we have left?" + "\n" + box1.getBacon());
        box1.getEggs();
        System.out.println("I'm surprised we still have some left since the others realy like it. We have: " + box1.getHam() + " pieces left.");
    }

    public static void ballSack(){}
}
class MyMethods9{

    private String cookedBacon;
    private int cookedEggs;
    private double cookedHam;

        //mutators
        public void setBacon(String bacon){
            cookedBacon = bacon;
        }

        public void setEggs(int eggs){
            cookedEggs = eggs;
        }

        public void setHam(double ham){
            cookedHam = ham;
        }

        //accessors
        public String getBacon(){
            System.out.println("We cooked two packs of bacon this morning.");
            return cookedBacon;
        }

        public int getEggs(){
            if(cookedEggs > 400){
                System.out.println("We have quite a bit of eggs left. Looks like " + cookedEggs + " total.");
            }
            else{
                System.out.println("We're running out of eggs.. Looks like " + cookedEggs + " total.");
            }
            return cookedEggs;
        }

        public double getHam(){
            System.out.println("Ham really isn't for me.");
            return cookedHam;
        }

        
}
