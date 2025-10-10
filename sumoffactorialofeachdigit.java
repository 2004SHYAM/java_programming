import java.util.Scanner;

public class sumoffactorialofeachdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number .....");
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        System.out.println("THe sum of factorial of "+ temp+" is ");
        
        while(num>0)
        {
            int fact=1;
            int ld=num%10;
            for(int i=1;i<=ld;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        System.out.println(sum);
    }
}
