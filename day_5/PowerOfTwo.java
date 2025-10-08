package day_5;

public class PowerOfTwo {

    /**
     * Brute-force approach to check if a number is a power of two.
     * Repeatedly divides the number by 2 and checks for any non-even result.
     * Time Complexity: O(log n)
     */
    public static void isPowerOfTwoBruteForce(int n) {
        if (n == 0) {
            System.out.println("Brute-force: 0 is not a valid power of two.");
            return;
        }

        while (n != 1) {
            if (n % 2 != 0) {
                System.out.println("Brute-force: Not a power of two.");
                return;
            }
            n = n / 2;
        }

        System.out.println("Brute-force: It is a power of two.");
    }

    /**
     * Optimized approach using bitwise AND operation.
     * A number n is a power of two if and only if (n & (n - 1)) == 0 and n > 0.
     * Time Complexity: O(1)
     */
    public static void isPowerOfTwoOptimized(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("Optimized: It is a power of two.");
        } else {
            System.out.println("Optimized: Not a power of two.");
        }
    }

    /**
     * Main method to test both approaches with a sample input.
     */
    public static void main(String[] args) {
        int number = 32; // You can test with other values like 0, 1, 3, 8, 20

        System.out.println("Checking if " + number + " is a power of two:");

        // Brute-force approach
        isPowerOfTwoBruteForce(number);

        // Optimized bitwise approach
        isPowerOfTwoOptimized(number);
    }
}
