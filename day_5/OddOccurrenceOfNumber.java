package day_5;

public class OddOccurrenceOfNumber {

    /**
     * Brute-force approach to find the number that occurs an odd number of times in the array.
     * Compares each element with every other element.
     * Time Complexity: O(n^2)
     */
    public static void bruteForce(int[] arr) {
        int length = arr.length;

        System.out.println("Brute-force: Numbers with odd occurrences:");
        for (int i = 0; i < length; i++) {
            int count = 0;

            // Count how many times arr[i] appears
            for (int j = 0; j < length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If count is odd, print the number and mark it as "processed" to avoid repeats
            if (count % 2 != 0) {
                System.out.println("Number: " + arr[i]);
                
                // Set to a value that doesn't exist in the array (assuming -1 isn't valid)
                // to prevent duplicate prints
                for (int k = 0; k < length; k++) {
                    if (arr[k] == arr[i]) arr[k] = -1;
                }
            }
        }
    }

    /**
     * Optimized approach using XOR operation.
     * XOR of two same numbers is 0, so even-occurring numbers cancel out.
     * The result is the number that occurs an odd number of times.
     * Assumes only one number occurs an odd number of times.
     * Time Complexity: O(n)
     */
    public static void optimized(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result ^= num; // XOR accumulates result
        }

        System.out.println("Optimized: Number with odd occurrence = " + result);
    }

    /**
     * Main method to demonstrate both brute-force and optimized methods.
     */
    public static void main(String[] args) {
        int[] input = {4, 3, 4, 4, 4, 5, 3, 5, 5}; // 5 occurs 3 times (odd)

        System.out.println("Input array:");
        for (int num : input) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Brute-force method
        bruteForce(input.clone()); // Clone to avoid modifying original array

        // Optimized method
        optimized(input);
    }
}
