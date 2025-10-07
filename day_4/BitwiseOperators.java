package day_4;

public class BitwiseOperators {
    public static void and_operator() {
        int x = 7;
        int y = 4;

        // x: 0000....0111
        // y: 0000....0100
        // x & y: 0000....0100
        // result: 4
        System.out.println("AND Operator: " + (x & y));
    }

    public static void or_operator() {
        int x = 7;
        int y = 4;

        // x: 0000....0111
        // y: 0000....0100
        // x | y: 0000....0111
        // result: 7
        System.out.println("OR Operator: " + (x | y));
    }

    public static void xor_operator() {
        int x = 7;
        int y = 4;

        // x: 0000....0111
        // y: 0000....0100
        // x ^ y: 0000....0011
        // result: 3
        System.out.println("XOR Operator: " + (x ^ y));
    }

    public static void not_operator() {
        int x = 7;

        // x: 0000....0111
        // ~x: 1111....1000
        // result: -8  (because of 2's complement representation)
        System.out.println("NOT Operator: " + (~x));
    }

    public static void shift_operators() {
        int x = 3;

        // x: 0000....0011
        System.out.println("Left Shift (x << 2): " + (x << 2)); // 12

        x = 3;
        // x: 0000....0011
        System.out.println("Right Shift (x >> 1): " + (x >> 1)); // 1

        x = -8;
        // Unsigned right shift fills with zeros
        System.out.println("Unsigned Right Shift (x >>> 2): " + (x >>> 2));
    }

    public static void main(String[] args) {
        and_operator();
        or_operator();
        xor_operator();
        not_operator();
        shift_operators();
    }
}

