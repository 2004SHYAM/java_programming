import java.util.Scanner;
public class sumofexponentialvalueofevendigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
        //int temp1=num;
        int count=0;
        int sum=0;
        int ld=0;
        
        while(num>0)
        {
            num/=10;
            count++;
        }
        while(temp>0)
        {
            ld=temp%10;
            if(ld%2==0)
            {
                int expo=1;
                for(int i=0;i<count;i++)
                {
                    expo=expo*ld;
                }
                sum=sum+expo;
            }
            temp/=10;
        }
        System.out.println("Sum of exponential values of even digits: " + sum);
    }
}
