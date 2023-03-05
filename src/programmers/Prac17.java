package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class Prac17 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        ArrayList<String> arrayList = new ArrayList<>();

        String temp = words[0];
        for(String s : words) {
           if( arrayList.isEmpty() || temp.substring(temp.length()-1).equals(String.valueOf(s.charAt(0)))) {
            if(arrayList.contains(s)) {
                answer[0] = ( arrayList.size() % n )+ 1;
                answer[1] = ( arrayList.size() / n) + 1;
                break;
            }else{
                arrayList.add(s);
                temp = s;
            }
        }else {
               answer[0] = ( arrayList.size() % n )+ 1;
               answer[1] = ( arrayList.size() / n) + 1;
           }
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(arrayList +" "+ Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        Prac17 p = new Prac17();

        int[] a = p.solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        //답 : 3, 3
        int[] b = p.solution(5, new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        // 답 : 0, 0
        int[] c = p.solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"});
        //답 : 1, 3
        int[] d = p.solution(2, new String[] {"land", "dream", "mom", "mom", "ror"});
        //답 : 2, 2
        int[] e = p.solution(2, new String[] {"land", "dream", "mom", "mom"});
        //답 : 2, 2
        int[] f = p.solution(2, new String[] {"qwe", "eqwe", "eqwe"});
       // 답 : 1, 2
        int[] g = p.solution(3, new String[] {"qwe", "eqwe", "eqqwe", "eqqwe"});
        //답 : 1, 2
        int[] h = p.solution(2, new String[] {"qwe", "qwe"});
        //답 : 2, 1
        int[] h2 = p.solution(2, new String[] {"ewe", "ewe"});
        //답 : 2, 1
        int[] h3 = p.solution(2, new String[] {"ewe", "ewq"});
        //답 : 0, 0
        int[] h4 = p.solution(10, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        //답 : 9, 1
    }
}

