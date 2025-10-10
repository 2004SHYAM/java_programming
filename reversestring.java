import java.util.Scanner;
public class reversestring {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = sc.nextLine();
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
            if(input.charAt(i)==' ')
            {
                reversed += " ";
            }
        }
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }
}
