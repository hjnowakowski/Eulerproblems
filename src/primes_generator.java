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

}
