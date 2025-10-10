import java.util.Scanner;

public class numberrange {  
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the starting number");
        int from=sc.nextInt();
        System.out.println("Enter the last number");
        int to=sc.nextInt();
        int count=0;
        for(int i=0;from<=to;i++)
        {
            int red=from%2;
            if(red==0)
                {
                    System.out.println(from);
                    from++;
                    count++;

                }
            else 
                {
                    from++;
                }
        }
        System.out.println("total number of even number in between from "+from+ " to "+to +" is  "+count);
        /* 
        for(int i=0;from<=to;i++)
        {
            int red=from%2;
            if(red==1)
                {
                    System.out.println(from);
                    from++;
                    count++;
                }
            else 
                {
                    from++;
                }
        }
        System.out.println("total number of odd number in between from "+from+ " to "+to +" is  "+count);
        */

    }
    
}
