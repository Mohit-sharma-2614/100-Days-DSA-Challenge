package mathmatics;

public class Gcd {
    public static int gcd(int a,int b){
        int min = Math.min(a, b);
        for(int i = min; i > 0; i--){
            if(a %i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static int euclidianGCD(int a, int b){
        while (a!=b) {
            if(a > b)
                a = a-b;
            else 
                b = b -a;
        }
        return a;
    }


    public static int optomizedEuclidian(int a, int b){
        if(b == 0) return a;
        else return optomizedEuclidian(b, a%b);
    }

    public static void main(String[] args) {
        int a=gcd(10, 4);
        System.out.println(a);
    }
}
