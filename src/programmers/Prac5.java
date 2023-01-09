package programmers;

import java.util.Arrays;

class Prac5 {
    public int[] solution(long n) {

        String s = String.valueOf(n);

        int[] answer = new int[s.length()];


        for(int i = 0; i < s.length(); i++) {

            answer[i] = Integer.parseInt(String.valueOf(s.charAt(s.length()-i-1)));
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

