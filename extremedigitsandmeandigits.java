import java.util.Scanner;

public class extremedigitsandmeandigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number...");
        int num=sc.nextInt();
        int temp=num;
        int temp2=num%10;
        while(num>10)
        {
            int ld=num%10;
            System.out.println("The mean digits are "+ld);
            num/=10;
        }
        int firstdigit=num;
        System.out.print("The extreme digits of "+ temp+" are ");
        System.out.print(firstdigit);
        System.out.print( " and "+temp2);
    }    
}
