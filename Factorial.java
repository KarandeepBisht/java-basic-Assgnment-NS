import java.util.Scanner;

public class Factorial {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(factorial(a));
    }

    /*
     * public static long factorial(int num) {
     * if (num <= 1) {
     * return 1;
     * }
     * return num * factorial(num - 1);
     * 
     * }
     */
    public static long factorial(long input) {
        if (input < 0) {
            System.out.println("invalid");
        }
        long factorial = 1;
        for (long i = input; i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
}