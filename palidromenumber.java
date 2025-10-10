import java.util.Scanner;
public class palidromenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number.....");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num>0)
        {
            int ld=num%10;
            rev=(rev*10)+ld;
            num/=10;
        }

        if(temp==rev) 
        {
            System.out.println(temp+ " is a palidrome number");   
        }
        else 
        {
            System.out.println(temp+ " is not a palidrome number");
        }
    }
}
