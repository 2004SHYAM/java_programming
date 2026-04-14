import java.util.Scanner;
public class Automorpicnumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number....");
        int num=sc.nextInt();
        int temp=num;
        int div=1;
        int count=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        int square=temp*temp;

        for (int i = 0; i < count; i++) 
        {
            div=div*10;
        }
        if(square%div==temp)
        {
            System.out.println("The Number is automorphic number");
        }
        else System.out.println("The give number is not automorphic number");
    }
}
