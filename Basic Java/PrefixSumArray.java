import java.util.*;

public class PrefixSumArray {

    // Method to calculate the prefix sum array
    static int[] sumOfPrefix(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for the size of the array
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1]; // Allocate size n+1 for 1-based indexing

        // Prompting user for elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculating the prefix sum array
        int[] pref = sumOfPrefix(arr);

        // Prompting user for number of queries
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        // Processing each query
        while (q-- > 0) {
            System.out.println("Enter the range (l r):");
            int l = sc.nextInt();
            int r = sc.nextInt();

            // Answering the sum query
            int ans = pref[r] - pref[l - 1];
            System.out.println("Sum in the range [" + l + ", " + r + "] is: " + ans);
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}