package programmers;

import java.util.Arrays;

class Prac12 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        int count = 0;
        int zero = 0;
        String s1 = "";

        while (!s1.equals("1")) {

            s1 = "";

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') {
                    s1 += String.valueOf(s.charAt(i));
                } else {
                    zero++;
                }
            }

            s = Integer.toBinaryString(s1.length());
            count++;
        }

        answer[0] = count;
        answer[1] = zero;

        return answer;
    }
}
