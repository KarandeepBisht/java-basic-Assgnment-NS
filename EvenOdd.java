import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.OptionDialogBorder;

public class EvenOdd {
    static int odd(int n1, int n2) {
        if (n1 > n2)
            return 0;
        System.out.printf(n1 + " ");
        return odd(n1 + 2, n2);
    }

    static int even(int num1, int num2) {
        if (num1 > num2)
            return 0;
        System.out.print(num1 + " ");
        return even(num1 + 2, num2);
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int num1 = 2, num2;
        int n1 = 1, n2;
        num2 = cs.nextInt();
        even(num1, num2);
        n2 = cs.nextInt();
        odd(n1, n2);
    }
}