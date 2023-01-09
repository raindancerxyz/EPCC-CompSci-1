public class Objects {
    public static void main(String [] args){
        
        Rectangle obj = new Rectangle(5.0, 15.0);
        
        //Setters
        obj.setLength(10.0);
        obj.setWidth(20.0);
        
        //Getters
        System.out.println("The box's length is: " + obj.getLength());
        System.out.println("The box's width is: " + obj.getWidth());
        System.out.println("The box's area is: " + obj.getArea());

    }

    
}
