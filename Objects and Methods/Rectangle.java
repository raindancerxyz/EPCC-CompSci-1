public class Rectangle {

    private double length;
    private double width;
    
    public Rectangle(double len, double w){
        length = len;
        width = w;
    }
    
    private int b;
    private String c;

    //Setter method we call these mutators "setter"
    public void setLength(double len){
        length = len;
    }

    public void setWidth(double w){
        width = w;
    }

    

    //Getter method we call these accessors "getter"
    //
    public double getLength(){
        System.out.println("The value in private int b is: " /*+ b*/);
        System.out.println("The value in private String c is: " /* + c */);
        return length;
    }
    public double getWidth(){
        return width;
    }

    public double getArea(){
        return width * length;
    }

    
}
