/**
 * Created by henryknowakowski on 22.05.2017.
 */

import java.lang.Math;
import java.util.Arrays;


public class primes_generator {
    private double limit;
    private boolean[] primes = new boolean[5000];
    primes_generator(double a) {
        limit = a;
    }
    public void primes_gen(){

        Arrays.fill(primes, true);

        for(int i = 2; i<primes.length; i++){
            System.out.print(primes[i]+", ");
        }

        System.out.println(" ");


    for (int i = 2; i<Math.sqrt(limit); i++){
        if(primes[i]==true){
            for (int j = i*i; j<limit; j = j+i){
                primes[j] = false;
            }
        }
    }
        for(int i = 2; i<primes.length; i++){
        System.out.print("("+i+")"+primes[i]+", ");
        }
    }

//    Let A be an array of Boolean values, indexed by integers 2 to n,
//    initially all set to true.
//
//            for i = 2, 3, 4, ..., not exceeding √n:
//            if A[i] is true:
//            for j = i^2, i^2+i, i^2+2i, i^2+3i, ..., not exceeding n:
//            A[j] := false.
//
//    Output: all i such that A[i] is true.

}
