
/*
solved:
problem 1
problem 2
problem 30

inprogress:
problem 3

TODO:
problem 501
problem 50
 */


/*
TODO: cleanup, another task

TODO: add basic algorithms, constructors
 */



public class Main {

    public static void main(String[] args) {

        int choice = 2;

        switch (choice){
            case 1:
                threeandfive ten = new threeandfive(10);
                System.out.println(ten.solution(1000));
                break;
            case 2:
                //largest_prime_factor three = new largest_prime_factor(600851475143L);

                break;
            case 3:


                // Problem nr 30
                int num = 999999999;
                int s_sum = 0;
                Digit_fifth_powers_30 test = new Digit_fifth_powers_30();
                for (int i = 1; i<num; i++) {
                    if (test.get_digits2(i)) {
                        System.out.println(" ok");
                    }

                }

                even_fibbonacio_numbers_2 one = new even_fibbonacio_numbers_2();
                System.out.println("**"+one.even_fibonacci_sum()+"**");
                break;

            case 4:
        }

        //PrimeNumbers2 prime = new PrimeNumbers2();
        //prime.prime();

    }
}
