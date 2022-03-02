import java.util.Scanner;

public class Cumulative {
    public static void main(String[] args) {
        int query;
        int[] arr = { 1, 23, 45, 15, 18, 19, 12 };
        int[] cumulativeArr = new int[7];
        for (int i = 1; i < 7; i++) {
            cumulativeArr[i] = arr[i] + cumulativeArr[i - 1];
        }
        Scanner sc = new Scanner(System.in);
        query = sc.nextInt();
        while (query > 0) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (left < 0 || right > 7) {
                throw new IndexOutOfBoundsException("out of index");
            }
            System.out.println(cumulativeArr[right] - cumulativeArr[left - 1]);
            query--;
        }
        sc.close();
    }
}