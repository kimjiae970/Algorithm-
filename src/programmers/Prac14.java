package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class Prac14 {
    public int solution(int n) {
        int answer = 0;

        int[] arr = new int[n];
        int total = 0;

        for ( int  i = 0; i < n; i++) {

            arr[i] = i+1;
        }

        for (int i = 0; i < n; i++ ) {

            if(n ==1 ) {
                answer = 1;
                break;
            }
            int j = 0;

            while ( total+arr[j] <= n) {

                total += arr[i+j];
                j++;
            }

            if ( total == n) {
                answer++;
                total = 0;
                j = 0;
            }else {
                total = 0;
                j = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    Prac14 p = new Prac14();
    p.solution(15);
}
}
