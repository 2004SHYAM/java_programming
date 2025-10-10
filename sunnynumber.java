import java.util.Scanner;
public class sunnynumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number.....");
        int num=sc.nextInt();
        int count=0;
        int temp=num+1;
        boolean Condition=true;
        for(int i=0;i<num;i++)
        {
            if(i*i>temp)
            {
                break;
            }
            if(i*i==temp)
            {
                Condition=true;
                break;
            }  
        }
        if(Condition)
            {
                System.out.println(num+" is a sunny number");
            }
            else 
            System.out.println(num+" is not a sunny number");
    }
}
