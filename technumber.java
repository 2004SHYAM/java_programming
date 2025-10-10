import java.util.Scanner;

public class technumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the number....");
        int num=sc.nextInt();
        int temp=num;
        int temp1=num;
        int count=0;
        int div=1;
        while(num>0)
        {
            num/=10;
            count++;  
        }
        if(count%2==0)
        {
            for( int i=0;i<count/2;i++)
            {
                div=div*10;
            }
            int firsthalf=temp/div;
            int lasthalf=temp%div;
            int total=firsthalf+lasthalf;
            int sqtotal=total*total;
            if(sqtotal==temp1)
            {
                System.out.println("The number is a tech number");
            }
            else System.out.println("The number is not a tech number");

        }
        else System.out.println("The number can't be divide");
    }
    
}
