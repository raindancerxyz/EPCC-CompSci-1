public class ExamDetails {
    public static void main(String [] args){

        ExamDetails obj = new ExamDetails();

        obj.fullName("Bill Gates");
        obj.examName("VB");  //You can input VB, JB, or C#
        obj.examScore(10);
        obj.examGrade(10);

    }

    //Build Methods in the ExamDetails class
    private String Full_Name;
    private String Exam_Name;
    private String Exam_Score;
    private String Exam_Grade;

    //Method for full name
    public String fullName(String aName){
        Full_Name = aName;
        System.out.println(" Your name is: " + Full_Name);
        return Full_Name;
    }
    //Method for exam name (condition)
    public String examName(String aExam){
        if(aExam.equals("VB")){
            Exam_Name = "Visual Basic .NET";
        }
        else if(aExam.equals("JB")){
            Exam_Name = "Java";
        }
        else if(aExam.equals("C#")){
            Exam_Name = " C Sharp";
        }
        else {
            Exam_Name = "No Exam Selected";
        }
        System.out.println("You chose the programming language called: " + Exam_Name);
        return Exam_Name;
    }

    //Method for a score on exam 0-20
    public String examScore(int aScore){
        Exam_Score = aScore + " out of 20";
        System.out.println("You earned a score of: " + Exam_Score);
        return Exam_Score;
    }

    //Method for grade value of number score
    public String examGrade(int aGrade){
        if(aGrade >= 15 && aGrade <= 20){
            Exam_Grade = "A";
        }
        else if(aGrade <= 14 && aGrade >= 10){
            Exam_Grade = "B";
        }
        else if (aGrade <= 9 && aGrade >= 0){
            Exam_Grade = "F";
        }
        else {
            System.out.println("Grade is outside 0 to 20");
        }
        System.out.println("You got a letter grade of: " + Exam_Grade);
        return Exam_Grade;
    }
}