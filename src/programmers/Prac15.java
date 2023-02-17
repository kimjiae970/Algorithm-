package programmers;

import java.util.ArrayList;


class Prac15 {
    public int solution(String s) {
        int answer = 0;

        int left_s = 0, right_s = 0, left_m = 0, right_m = 0 ,left_l = 0, right_l = 0;

        if (s.length() > 1) {
            for (int i = 0; i < s.length(); i++) {

                switch (s.charAt(i)) {
                    case '(':
                        left_s++;
                        break;
                    case ')':
                        right_s++;
                        break;
                    case '{':
                        left_m++;
                        break;
                    case '}':
                        right_m++;
                        break;
                    case '[':
                        left_l++;
                        break;
                    case ']':
                        right_l++;
                        break;
                }
            }
        }

        if (s.length() % 2 == 0) {

            if (left_s == right_s && left_m == right_m && left_l == right_l) {

                int i = 0;

                StringBuffer sb = new StringBuffer(s);

                do {

                    char c = sb.charAt(i);
                    sb.deleteCharAt(i);
                    sb.append(c);

                    System.out.println(sb);

                    i++;
                    
                } while (i < s.length());

            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Prac15 p = new Prac15();

        p.solution("[](){}");
       //p.solution("}]()[{");
        //p.solution("[)(]");
        //p.solution("}}}");
    }
}
