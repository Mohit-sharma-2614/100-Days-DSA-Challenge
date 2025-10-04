package mathmatics;

public class PowerOfNumber {

    // Iterative method: O(i)
    public static int powerOfNumber(int n, int i) {
        if (i == 0) return 1;   // n^0 = 1
        int power = 1;
        for (int j = 1; j <= i; j++) {
            power = power * n;  // multiply n, i times
        }
        return power;
    }    

    // Recursive fast exponentiation: O(log i)
    public static int power(int n, int i) {
        if (i == 0) return 1;       // base case: n^0 = 1
        int temp = power(n, i / 2); // recursive call on half exponent
        temp = temp * temp;         // square the result

        if (i % 2 == 0) {
            return temp;            // if exponent even: n^i = (n^(i/2))^2
        } else {
            return temp * n;        // if exponent odd: n^i = (n^(i/2))^2 * n
        }
    }



    

    // O(log i) iterative binary exponentiation
    public static int binaryExpo(int n, int i) {
        int result = 1;
        int base = n;

        while (i > 0) {
            if ((i & 1) == 1) {   // if the lowest bit is set (odd exponent)
                result *= base;   // multiply result by current base
            }
            base *= base;         // square the base
            i >>= 1;              // divide exponent by 2 (shift right)
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerOfNumber(3, 3)); // iterative: 27
        System.out.println(power(3, 3));         // recursive: 27
        System.out.println(power(2, 10));        // recursive: 1024
        System.out.println(power(5, 0));         // 1
        System.out.println(binaryExpo(3, 3));   // 27
        System.out.println(binaryExpo(2, 10));  // 1024
        System.out.println(binaryExpo(5, 0));   // 1
    }
}
