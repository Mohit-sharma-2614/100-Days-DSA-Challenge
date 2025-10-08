package day_5;

public class KthBitChecker {

    // Approach 1: Using Left Shift (<<)
    public static void checkKthBitLeftShift(int number, int k) {
        if ((number & (1 << (k - 1))) != 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    // Approach 2: Using Right Shift (>>)
    public static void checkKthBitRightShift(int number, int k) {
        if (((number >> (k - 1)) & 1) != 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        checkKthBitLeftShift(4, 2); // 4: 00.....00100
        checkKthBitRightShift(4, 3);
    }
}
