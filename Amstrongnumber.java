import java.util.Scanner;
public class Amstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the number....");
        int num=sc.nextInt();
        int count=0;
        int temp=num;
        int temp1=temp;
        int sum=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        while(temp>0)
        {
            int ld=temp%10;
            int expo=1;
            for(int i=1;i<=count;i++)
            {
                expo=expo*ld;
            }
            sum=sum+expo;
            temp/=10;
            
        }
        System.out.println(sum);
        if(sum==temp1)System.out.println(temp1+" is the amstrong number");
        else System.out.println(temp1+ " is not a amstrong number");
    }
}
