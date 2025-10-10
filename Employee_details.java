public class Employee_details {
    static String companyName="Accenture";
    static String Address="Gachibowli";
    String eid;
    String Ename;
    String Role;
    String role;
    double salary;  

    {
        System.out.println("Welcome to "+companyName+" at "+ Address);
    }

    public void EmployeeDetails()
    {
        System.out.println("Employee details");
        System.out.println(companyName);
        System.out.println(Address);
        System.out.println(eid);
        System.out.println(role);
        System.out.println(salary);

    }
    public static void main(String[] args) {
        Employee_details employee1=new Employee_details();
        employee1.eid="ACC1234";
        employee1.Ename="Shyam";
        employee1.Role="Full stack deveplor";
        employee1.salary=100000;
        employee1.EmployeeDetails();
        System.out.println();
        Employee_details employee2=new Employee_details();
        employee2.eid="ACC1235";
        employee2.Ename="Sandeep";
        employee2.Role="Java developer";
        employee2.salary=50000;
        employee2.EmployeeDetails();       
    }
}

