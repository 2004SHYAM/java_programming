import java.util.Scanner;
public class neonnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number....");
        int num=sc.nextInt();
        int temp=num;
        int square=num*num;
        int temp1=square;
        int sum=0;
        while(square>0)
        {
            int ld=square%10;
            sum=sum+ld;
            square/=10;
        }
        if(sum==temp)
        {
            System.out.println("it is a neon number");
        }
        else 
        {
            System.out.println("It not a neon number");
        }
    }
}
