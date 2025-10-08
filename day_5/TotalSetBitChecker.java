package day_5;

public class TotalSetBitChecker {

    /**
     * Brute-force approach to count set bits (1s) in the binary representation of a number.
     * Time Complexity: O(log n) where n is the input number.
     */
    public static void bruteForce(int n) {
        int res = 0;
        int original = n; // Keep the original value for printing
        while (n > 0) {
            // Check if the least significant bit is set
            if ((n & 1) == 1) res++;
            // Right shift the number
            n = n >> 1;
        }
        System.out.println("Brute-force: Set bits in " + original + " = " + res);
    }

    /**
     * Optimized approach using Brian Kernighan's Algorithm.
     * Time Complexity: O(number of set bits)
     * This algorithm removes the rightmost set bit in each iteration.
     */
    public static void optimizedCount(int n) {
        int res = 0;
        int original = n;
        while (n > 0) {
            n = n & (n - 1); // Drop the lowest set bit
            res++;
        }
        System.out.println("Optimized (Brian Kernighan): Set bits in " + original + " = " + res);
    }

    // Lookup table to store the number of set bits in a byte (0-255)
    static int[] table = new int[256];

    /**
     * Preprocess the table with set bit counts for all values from 0 to 255.
     */
    public static void initializeLookupTable() {
        table[0] = 0;
        for (int i = 1; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
    }

    /**
     * Constant-time approach using a precomputed lookup table.
     * Breaks the integer into 4 bytes and sums their set bits.
     * Time Complexity: O(1)
     */
    public static void countUsingLookupTable(int n) {
        int original = n;
        // Combine the result from all 4 bytes of the integer
        int res = table[n & 0xff] +
                  table[(n >> 8) & 0xff] +
                  table[(n >> 16) & 0xff] +
                  table[(n >> 24) & 0xff];

        System.out.println("Lookup Table: Set bits in " + original + " = " + res);
    }

    /**
     * Main method to demonstrate all three set bit counting approaches.
     */
    public static void main(String[] args) {
        int number = 29; // Binary: 11101, Set bits = 4

        System.out.println("Counting set bits in: " + number);

        // Brute force
        bruteForce(number);

        // Optimized approach
        optimizedCount(number);

        // Lookup table method
        initializeLookupTable();
        countUsingLookupTable(number);
    }
}
