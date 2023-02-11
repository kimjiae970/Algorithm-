package programmers;

import java.util.ArrayList;

class Prac14 {
    public int solution(int n) {
        int answer = 0;

        int cnt = 1;
        int value = 0;

        while (cnt <= n) {

            value = n / cnt;

            if( n % 2 == 0) {

            }else {

            }
            System.out.println(value);

            cnt++;

        }
        return answer;
    }

    public static void main(String[] args) {

    Prac14 p = new Prac14();
    p.solution(15);
}
}
