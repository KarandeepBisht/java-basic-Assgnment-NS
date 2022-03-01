import java.util.Scanner;

public class SoD {
    // public static void main(String[] args) {
    /*
     * boolean condition = true;
     * Scanner sc = new Scanner(System.in);
     * while (condition == true) {
     * String truthValue = sc.nextLine();
     * if (truthValue.equals("yes") || truthValue.equals("yes")) {
     * int num = sc.nextInt();
     * System.out.println(sumOfDigits(num));
     * } else {
     * condition = false;
     * }
     * }
     * sc.close();
     * }
     * 
     * static int sumOfDigits(int n) {
     * int sum = 0, remainder;
     * while (n > 0) {
     * remainder = n % 10;
     * sum = sum + remainder;
     * n = n / 10;
     * }
     * return sum;
     * }
     */

    int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SoD ob = new SoD();
        int a = ob.add(n);
        System.out.println(a);
    }

    int add(int n) {
        sum = n % 10;
        if (n == 0) {
            return 0;
        } else {
            return sum + add(n / 10);
        }
    }
}