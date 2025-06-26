import java.util.Scanner;
public class Spynumberornot
{   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=sc.nextInt();
        int temp=num;
        int sum = 0;
        int product=1;
        while(num>0)
        {
            int ld=num%10;
            sum=sum+ld;
            product=product*ld;
            num/=10;
        }
        if(sum==product)
        {
            System.out.println(temp+" is a spy number");
        }
        else
        {
            System.out.println(temp+ " is not a spy number");
        }
    }
}
