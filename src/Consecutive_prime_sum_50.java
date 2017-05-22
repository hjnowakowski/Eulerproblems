/**
 * Created by henryknowakowski on 22.05.2017.
 */

//problem 50


class Consecutive_prime_sum_50
{
    void prime ()
    {
        int i =0;
        int num =0;
        String  primeNumbers = "";
        int[] prime_array;
        int n = 10000;
        int solution = 0;
        for (i = 1; i <= n; i++)  //i is prime
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
                solution += i;

            }
            if(ifisprime(solution)&&solution<1000000) System.out.println("Szukana liczba to:" + solution);
        }
        System.out.println(primeNumbers);
        System.out.println(solution);
    }

    boolean ifisprime(int n) {
        int i;
        int flag = 0;
        for (i = 2; i <= n / 2; ++i) {
            // condition for nonprime number
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            return true;
        else
            return false;
    }

}