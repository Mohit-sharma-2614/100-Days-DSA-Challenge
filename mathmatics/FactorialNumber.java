package mathmatics;

public class FactorialNumber {
    // Time complaxity is O(n)
    // Space complaxity is O(1)
    public static int factorialOfNumber(int n){
        int fact = 1;
        while (n>1) {
            fact = fact*n;
            n--;
        }
        return fact;
    }

    // Time complaxity is O(n)
    // Space complaxity is O(n)
    public static int recursiveFactorial(int n){
        if(n==1) return 1;
        return n*recursiveFactorial(n-1);
    }

    public static int trailingZero(int n){
        int temp = n;
        int count=0;
        while (temp>0) {
            if(temp % 10 == 0){
                count++;
            }
            temp = temp / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
        System.out.println(recursiveFactorial(5));
        System.out.println( );
    }
}
