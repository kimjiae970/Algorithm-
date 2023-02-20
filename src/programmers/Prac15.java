package programmers;

class Prac15 {
    public int solution(String s) {

        int answer = 0;
        int i = 0;
        StringBuilder sb  = new StringBuilder(s);

        if((sb.length() % 2 ) == 0 ) {

            do {

                i++;

                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c);

                String copy = sb.toString();

                for(int j = 0;j < copy.length()-1; j++) {
                    
                    if (copy.charAt(j) == '(' && copy.charAt(j + 1) == ')') {
                        copy = copy.substring(0, j) + copy.substring(j + 2);
                        j=-1;
                    } else if (copy.charAt(j) == '{' && copy.charAt(j + 1) == '}') {
                        copy = copy.substring(0, j) + copy.substring(j + 2);
                        j=-1;
                    } else if (copy.charAt(j) == '[' && copy.charAt(j + 1) == ']') {
                        copy = copy.substring(0, j) + copy.substring(j + 2);
                        j=-1;
                    }


                }
                if(copy.equals("")){
                    answer++;
                }
                //System.out.println(sb);
            }while ( i < sb.length());
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {

        Prac15 p = new Prac15();

        p.solution("[](){}");
       p.solution("}]()[{");
        p.solution("[)(]");
        p.solution("}}}");
    }
}
