import java.util.Scanner;
public class xylemandpholemnumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=sc.nextInt();
        int temp2=num%10;
        int sumofmeandigit=0;
        num/=10;
        while(num>10)
        {
            int ld=num%10;
            sumofmeandigit=sumofmeandigit+ld;
            num/=10;
        }
        int firstdigit=num;
        int sumofextremedigits=firstdigit+temp2;
        if(sumofmeandigit==sumofextremedigits) System.out.println("The number is Xylem number");
        else System.out.println("The number is phloem number");
    }
    
}
