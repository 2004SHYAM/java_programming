import java.util.Scanner;

public class countnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the starting number");
        int from=sc.nextInt();
        System.out.println("Enter the last number");
        int to=sc.nextInt();
        int count=0;
        for(int i=from;i<to;i++)
        {
            count++;
        }
        System.out.println("there are  "+count+" numbers  from " +from+" to"+to);
    }
    
}
