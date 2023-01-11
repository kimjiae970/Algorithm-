package programmers;

class Prac7 {
    boolean solution(String s) {

        boolean answer = true;

        int srt_c = 0;
        int end_c = 0;

        if (s.charAt(0) == ')') {
            answer = false;
        }

        for(int i =0; i< s.length(); i++) {

            if(s.charAt(i) == '(') {
                srt_c++;
            }else {
                end_c++;
            }

            if(end_c >  srt_c) {
                answer = false;
            }
        }

        if(srt_c != end_c) {
            answer = false;
        }

        return answer;
    }

}
