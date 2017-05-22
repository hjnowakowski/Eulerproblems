/**
 * Created by henryknowakowski on 22.05.2017.
 */

class Eight_Divisors_501 {  //problem nr 501
    private int sum = 0;
    private int number_of_divosors = 0;
    int i = 1;

    Eight_Divisors_501(int limit1){
    }

    public int a;
    int solution(int limit1){
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