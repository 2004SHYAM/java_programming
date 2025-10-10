import java.util.Scanner;

public class AmstrongUsingMethods{
    
    public static int countofDigits(int num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num=num/10;
        }
        return count;
    }

    public static int power(int base,int exp)
    {
        int pow=1;
        
        while(exp!=0)
        {
            pow=pow*base;
            exp--;
        }
        return pow;
    }

    public static String isAmstrong(int num)
    {
        int countofDigits=countofDigits(num),sum=0,temp=num;
        while(num!=0)
        {
            int ld=num%10;
            sum=sum+power(ld, countofDigits);
            num=num/10;
        }
        String output=temp +"is not Amstrong Number";
        if(sum==temp) 
        {
            output=temp+" is Amstrong Number";
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        System.out.print(isAmstrong('n'));

    }
}