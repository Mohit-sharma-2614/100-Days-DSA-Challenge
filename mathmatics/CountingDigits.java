package mathmatics;

public class CountingDigits {

    // Takes O(n) time with O(n) auxilary space.
    public static int countDigits(int a){
        if(a==0) return 0;
        return 1 + countDigits(a/10);
    }    

    // Takes constant time only.
    public static int countDigits2(int b){
        return (int)(Math.log10(b) + 1);
    }


    public static void main(String[] args) {
        System.out.println(countDigits2(45678321));
    }
}
