package programmers;

import java.util.Arrays;

// 최솟값 만들기

class Prac6 {
        public int solution(int []A, int []B)
        {
            int answer = 0;

            Arrays.sort(A);
            Arrays.sort(B);

            int[] arr = new int[B.length];

            for(int i = 0; i < B.length; i++) {
                arr[B.length-1-i] = B[i];
            }

            for(int i =0; i<A.length; i++) {
                answer += A[i]*arr[i];
            }

            return answer;
        }

}
