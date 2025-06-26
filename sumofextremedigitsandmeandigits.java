import java.util.Scanner;

public class sumofextremedigitsandmeandigits {
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
        
        System.out.println("sum of extreme digits is " +sumofextremedigits);
        System.out.println("sum of mean digits is " +sumofmeandigit);        
    }
}
