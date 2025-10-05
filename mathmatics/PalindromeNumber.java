package mathmatics;

public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int temp = n;
        int sum = 0;
        while (n>0) {
            int digit = n % 10;
            sum = sum * 10 + digit;
            n = n/10;
        }
        return sum==temp;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(45));
    }


}
