package day_3;

// This is not a great day in life so have only done 1 question.

/**
 * Program to find the unique number in an array
 * where every other number appears twice.
 *
 * Uses the XOR trick:
 * - a ^ a = 0
 * - a ^ 0 = a
 */
public class UniqueNumberFinder {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 1, 2, 43, 3, 3};
        System.out.println(findUnique(numbers));
    }

    /**
     * Finds the element that appears only once.
     *
     * @param numbers input array where all elements appear twice except one
     * @return the unique element
     */
    public static int findUnique(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result ^= num;
        }
        return result;
    }
}
