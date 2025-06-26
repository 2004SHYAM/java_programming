import java.util.Scanner;
public class Strongnumber
{
public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number...");
    int num=sc.nextInt();
    int temp=num;
    int sum=0;
    while(num>0){
        int ld=num%10;
        int fact=1;
        for(int i=1;i<=ld;i++)
        {
        fact=fact*i;
        }
        sum=sum+fact;
        num=num/10;
    }
    //System.out.println(sum);
    if(sum==temp){
        System.out.println(temp+" is a Strong Number");
    }
    else{
        System.out.println(temp+" is not a Strong Number");
    }
        
}
}
