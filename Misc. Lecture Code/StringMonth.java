import javax.swing.JOptionPane; 
public class StringMonth {

    public static void main(String [] args){

    String month;
    String season;
    
    month = JOptionPane.showInputDialog("What is your favorite month?");

    if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("Dec") || 
    month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Jan") || 
    month.equalsIgnoreCase("February") || month.equalsIgnoreCase("Feb")){
        season = "Winter";
    } 
    else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("Mar") || 
    month.equalsIgnoreCase("April") || month.equalsIgnoreCase("Apr") || 
    month.equalsIgnoreCase("May")){
        season = "Spring";
    
    }
    else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("Jun") || 
    month.equalsIgnoreCase("July") || month.equalsIgnoreCase("Jul") || 
    month.equalsIgnoreCase("August") || month.equalsIgnoreCase("Aug")){
        season = "Summer";
    }
    else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("Sep") || 
    month.equalsIgnoreCase("October") || month.equalsIgnoreCase("Oct") || 
    month.equalsIgnoreCase("November") || month.equalsIgnoreCase("Nov")){
        season = "Fall";
    }
    else {
        JOptionPane.showMessageDialog(null, "Invalid month.");
        season = "Invalid season.";
    }

    System.out.println("Your month is " + month + " and the season is " + season + ".");
}

}
