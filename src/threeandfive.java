/**
 * Created by henryknowakowski on 22.05.2017.
 */


class threeandfive{  //problem nr 1

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
