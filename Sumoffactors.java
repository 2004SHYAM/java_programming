import java.util.Scanner;

public class Sumoffactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=sc.nextInt();
        int sum=0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of factors is "+sum);
    }    
}
