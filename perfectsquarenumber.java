import java.util.Scanner;

public class perfectsquarenumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number.....");
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<num;i++)
        {
            if(i*i==num)
            {
                System.out.println("it is perfect number"); 
                break;
            }
            else if(num<i*i)
            {
                System.out.println("it is not a perfect number");
                break;
            }
            else if(num!=i*i)
            {
                
            }
            else
            {
                System.out.println("it is not a perfect number");
            }
            count++;
        }
        System.out.println(count);
    }
}