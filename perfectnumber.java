import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number...");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==num)
        {
            System.out.println(temp+ " is perfect number");
        }
        else 
        {
            System.out.println(temp+" is not a perfect number");
        }
    }    
}
