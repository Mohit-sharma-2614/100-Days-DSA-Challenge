package mathmatics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumber {

    static public void sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i * i <= n; i++){
            if(isPrime[i]){
                for(int j = i * 2; j <= n; j = j + i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                System.out.print(" "+i+" ");
            }
        }

    }

    static public List<Integer> primeNumbers(int n){
        List<Integer> list = new ArrayList<>();
        if(n==1) return new ArrayList<>();
        if(n==2) {
            list.add(2);
            return list;
        }
        if(n==3){
            list.add(3);
            return list;
        }
        int i;
        list.add(2);
        list.add(3);
        for(i = 5; i <= n; i+=6){
            if(isPrime(i)){
                list.add(i);
            }
            if(i+2 < n && isPrime(i+2)) list.add(i+2);
        }
        return list;
    }


    static public boolean isPrime(int a){
        if(a == 1) return false;
        if(a == 2 || a == 3) return true;
        if(a%2 == 0 || a%3==0) return false;
        for(int i = 5; i*i <= a; i+=6){
            if(a%i == 0 || a%(i+2)==0) return false;
            
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(57));
        System.out.println(primeNumbers(53));
        sieve(53);
    }

}
