import java.util.*;



class threeandfive{  //problem nr 1
    //private int limit;

    private int sum = 0;


    threeandfive(int limit){
        }
    public int solution(int limit){
        for (int i = 0; i<limit; i++){
            if(i%3==0||i%5==0) sum += i;
        }
        return sum;
    }


}

class eighties {  //problem nr 501
    private int sum = 0;
    private int number_of_divosors = 0;
    int i = 1;

    eighties(int limit1){
    }

    public int solution(int limit1){
        for(; i<=limit1; i++){
            if(if_divisors_8(i)) sum++;
        }
        return sum;
    }

    public boolean if_divisors_8(int a){
        for(int c = 1; c<=a; c++){
        if((a%c)==0) number_of_divosors++ ;
        }
     if(number_of_divosors==8) {
         number_of_divosors=0;
         return true;
     }
     else{
         number_of_divosors=0;
         return false;
     }
    }
}


//Problem 30
class digit_fifth_powers {
    digit_fifth_powers(){};
    private int compare = 0;
    private int number2;

    boolean get_digits2(int number){

        compare = 0;

        number2 = number;
        //System.out.println(number);
        String number1 = String.valueOf(number);
        //System.out.println(number1);

        for(int i = 0; i < number1.length(); i++) {
            int digit = Character.digit(number1.charAt(i), 10);
            //System.out.println("digit: " + j);
            if(digit==1) {compare++; continue;}
            compare += digit*digit*digit*digit*digit;
        }

        if(compare==number2) {System.out.print(compare); return true;}
        else return false;
    }

    

}

class PrimeNumbers2  //problem 50
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
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
                solution += i;

            }
            if(ifisprime(solution)&&solution<1000000) System.out.println("Szukana liczba to:" + solution);
        }
        //System.out.println("Prime numbers from 1 to n are :");
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



//class eighties_gen {  //problem nr 501
//    private int sum = 0;
//    private int number_of_divosors = 0;
//    int i = 1;
//
//    eighties_gen(int limit1){
//    }
//
//    public int solution(int limit1){
//        for(; i<=limit1; i++){
//            if(if_divisors_8(i)) sum++;
//        }
//        return sum;
//    }
//
//    public boolean if_divisors_8(int a){
//        for(int c = 1; c<=a; c++){
//            if((a%c)==0) number_of_divosors++ ;
//        }
//        if(number_of_divosors==8) {
//            number_of_divosors=0;
//            return true;
//        }
//        else{
//            number_of_divosors=0;
//            return false;
//        }
//    }
//}







public class Main {

    public static void main(String[] args) {
        threeandfive ten = new threeandfive(10);
        //System.out.println(ten.solution(1000));

        eighties hundert = new eighties(100);
        System.out.println("WYNIK ZADANIA 501:   ----   " + hundert.solution(1000) + "   ----");

        PrimeNumbers2 prime = new PrimeNumbers2();
        prime.prime();


//        // Problem nr 30
//        int num = 999999999;
//        int s_sum = 0;
//        digit_fifth_powers test = new digit_fifth_powers();
//        for (int i = 1; i<num; i++) {
//            if (test.get_digits2(i)) {
//                System.out.println("ok");
//            }
//
//            }
//        }


    }
}
