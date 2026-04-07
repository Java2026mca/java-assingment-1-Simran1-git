import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: Read n integers into an array
        //       Implement BUBBLE SORT manually (no Arrays.sort)
        //       Print sorted array ascending, space-separated
        //       Then print: "Swaps: X" where X = total number of swaps performed
        //
        // Input:
        // 5
        // 64 34 25 12 22
        //
        // Output:
        // 12 22 25 34 64
        // Swaps: 7
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int swaps = 0;
        // Standard Bubble Sort: The inner loop must decrease in size
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) { // Important: n-1-i
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println("\nSwaps: " + swaps);
        sc.close();
    }
}
