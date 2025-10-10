
public class Student {
    static String collagename="JSpiders";
    static String trainer="Sandeep";
    String Sname;
    String Sid;
    double Smarks;
    public void Studentdetails()
{
    System.out.println("Student details");
    System.out.println("Collage name: "+collagename);
    System.out.println("trainer: "+trainer);
    System.out.println("Student name:" +Sname);
    System.out.println("Student ID" +Sid);
    System.out.println("Student marks:" +Smarks );
}
public static void main(String[] args) {
    Student stud1=new Student();
    stud1.Sname="shyam";
    stud1.Sid="JSP@123";
    stud1.Smarks=345.2;
    stud1.Studentdetails();
    Student stud2=new Student();
    stud2.Sname="AJAY";
    stud2.Sid="JSP@124";   
    stud2.Smarks=234.12;
    stud2.Studentdetails();

}

}
