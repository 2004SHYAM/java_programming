import java.util.Scanner;
public class exponential {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number base...");
        int base=sc.nextInt();
        System.out.print("Enter the exponitial value....");
        int expo=sc.nextInt();
        int total=1;
        for(int i=0;i<expo;i++)
        {
            total=total*base;
        }
        System.out.println("exponential of base "+base+" power of "+expo+ " is "+total);

    }
    
}
