import java.io.*;
import java.util.Scanner;

/*class D1array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        long sum = 0, save = 0, diff = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= save) {
                System.out.print(0 + " ");
            } else if (arr[i] <= save) {
                long d = save - arr[i];
                System.out.print(d + " ");
                diff = diff + d;

            }
            if (arr[i] > save) {
                save = arr[i];
            }
            sum = sum + arr[i];
        }
        System.out.println();
        System.out.println(sum + diff);
    }
}*/

class D1array {
    public static void main(String[] args) {
        String str = "Tripathi";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}