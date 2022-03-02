import java.util.Scanner;

public class Binarry {
    public static void main(String[] args) {
        Binarry obj = new Binarry();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(obj.findTarget(arr, 45));
    }

    public int findTarget(int[] arr, int target) {
        int startIdx = 0, endIdx = arr.length - 1;
        while (startIdx <= endIdx) {
            int mid = startIdx + (endIdx - startIdx) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                endIdx = mid - 1;
            } else {
                startIdx = mid + 1;
            }
        }
        return -1;
    }
}