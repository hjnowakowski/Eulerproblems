/**
 * Created by henryknowakowski on 22.05.2017.
 */

//Problem 30

class Digit_fifth_powers_30 {
    Digit_fifth_powers_30(){};
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