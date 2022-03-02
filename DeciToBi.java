import java.util.Scanner;

public class DeciToBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decimal_binary(n));
    }

    public static int decimal_binary(int n) {
        if (n == 0)
            return 0;
        else
            return ((n % 2) + 10 * decimal_binary(n / 2));
    }
}