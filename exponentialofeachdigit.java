import java.util.Scanner;

public class exponentialofeachdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number base...");
        int base=sc.nextInt();
        int temp=base;
        int count=0;
        while(base>0)
        {
            //int ld=base/10;
            base/=10;
            count++;
        }
        while(temp>0)
        {
            int ld=temp%10;
            int expo=1;
            for(int i=1;i<=count;i++)
            {
                expo*=ld;
            }
            System.out.println(expo);
            temp/=10;
        }        
        

    }
    
}
