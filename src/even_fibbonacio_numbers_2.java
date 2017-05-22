/**
 * Created by henryknowakowski on 22.05.2017.
 */


//Porblem 2

class even_fibbonacio_numbers_2 {

    /*
    1. fill the fibonacci array (limit 4*10^6), ok
    2. find even values below 4*10^6
    3. sum 'em all
     */

    private int[] fibonacci_numbers = new int[100];

    void filling_table(int b){
        fibonacci_numbers[0] = 1;
        fibonacci_numbers[1] = 2;
        for(int i = 2; i<b; i++){
            if(fibonacci_numbers[i-1]+fibonacci_numbers[i-2]>4000000) {
                System.out.println("Wyraz ciągu fibonacciego większy od miliona, wynosi: "+fibonacci_numbers[i]);
                break;
            }
            fibonacci_numbers[i] = fibonacci_numbers[i-1]+fibonacci_numbers[i-2];
        }
    }
    int even_fibonacci_sum(){
        int sum = 0;
        filling_table(100);
        for(int a: fibonacci_numbers){
            if((a%2)==0) {
                sum += a;
            }
        }
        return sum;
    }
}
