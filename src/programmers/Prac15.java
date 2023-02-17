package programmers;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Prac15 {
    public int solution(String s) {
        int answer = 0;

        int left_s = 0, right_s = 0, left_m = 0, right_m = 0 ,left_l = 0, right_l = 0;

        ArrayList<String> strings = new ArrayList();

        if (s.length() > 1) {
            for (int i = 0; i < s.length(); i++) {

                strings.add(String.valueOf(s.charAt(i)));

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

        if (strings.size() % 2 == 0) {

            if (left_s == right_s && left_m == right_m && left_l == right_l) {

                String word;

                do {
                    String temp = strings.get(0).toString();
                    strings.remove(0);
                    strings.add(temp);

                    word = "";

                    for( String s1 : strings) {
                        word += s1;
                    }

                    word.replace("[]","");
                    word.replace("{}", "");
                    word.replace("()", "");


                    System.out.println(word);

                } while (word.equals(s));
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
