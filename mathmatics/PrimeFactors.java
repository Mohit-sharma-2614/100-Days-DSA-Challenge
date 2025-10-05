package mathmatics;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    
    // Checks if a number is prime using 6k ± 1 optimization
    public static boolean isPrime(int a){
        if(a == 1) return false;      // 1 is not prime
        if(a == 2) return true;       // 2 is prime
        if(a == 3) return true;       // 3 is prime
        if(a%2 == 0 || a%3== 0){      // divisible by 2 or 3 -> not prime
            return false;
        }
        // check divisibility only by numbers of form 6k ± 1 up to sqrt(a)
        for(int i = 5; i*i<=a; i+=6){
            if(a%i == 0 || a%(i+2)==0) return false;
        }
        return true;
    }

    // Returns all factors of n in increasing order
    public static List<Integer> allFactorsInIncreasingOrder(int n){
        List<Integer> list = new ArrayList<>();
        int i;
        // collect smaller factors up to sqrt(n)
        for(i = 1; i*i < n; i++){
            if(n%i==0)
                list.add(i);
        }
        // now traverse backwards to collect larger factors
        // ensures increasing order without explicit sorting
        for( ; i >= 1; i--){
            if(n%i==0)
                list.add(n/i);
        }
        return list;
    }

    // Returns all factors of n (not necessarily ordered)
    public static List<Integer> allFactores(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i * i <= n; i++){
            if(n%i==0){
                list.add(i);          // add small factor
                int x = n / i;        
                if (x!=i)             // avoid duplicate if n is a perfect square
                    list.add(x);      // add paired larger factor
            }
        }
        return list;
    }

    // Returns prime factors of n (with repetition)
    public static List<Integer> primeFactors(int n){
        List<Integer> list = new ArrayList<>();
        
        // iterate through all numbers less than n
        // but only process primes
        for(int i = 2; i<n; i++){
            if (isPrime(i)) {
                int x = i;
                // check how many times prime i divides n
                while (n % x == 0) {
                    list.add(i);
                    x = x * i;   // multiply instead of reducing n (not the usual approach, but works)
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(primeFactors(84));       // expected [2, 2, 3, 7]
        System.out.println(allFactores(4));         // expected [1, 4, 2] (unordered)
        System.out.println(allFactorsInIncreasingOrder(4)); // expected [1, 2, 4]
    }
}
