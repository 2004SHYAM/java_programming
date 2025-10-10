import java.util.Scanner;

public class Sumjava {

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sumjava s1 = new Sumjava();
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(s1.sum(a, b));
    }
}
