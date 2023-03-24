package programmers;

import java.util.HashSet;

class Prac18 {
        public boolean solution(String[] phone_book) {

            boolean answer = true;

            HashSet<String> set = new HashSet<>();

            int i = 0;



            for( int j = 0; j < phone_book.length; j++) {

                set.clear();

                for( int k = 0; k < phone_book.length; k++) {

                    int length = phone_book[i].length();

                    if(phone_book[k].length() < length) {
                        continue;
                    }else if (!phone_book[k].equals(phone_book[i])){
                        if(phone_book[k].substring(0, length).equals(phone_book[i])){
                            return false;
                        }
                    }else {
                        set.add(phone_book[k].substring(0,length));
                    }

                }
            }
            while (i < phone_book.length) {

                set.clear();

                int length = phone_book[i].length();

                for (String s : phone_book) {

                   if(s.length() < length) {
                        continue;
                    } else if(s.substring(0, length).equals(phone_book[i]) && !s.equals(phone_book[i])){
                        return false;
                    } else {
                        set.add(s.substring(0, length));
                    }
                }

                i++;
            }

            System.out.println(answer);
            return answer;
        }


    public static void main(String[] args) {

        Prac18 p = new Prac18();

        String[] pho = {"119", "97674223", "1195524421"};
        p.solution(pho);

        String[] phon = {"123","456","789"};
        p.solution(phon);

        String[] phone= {"12","123","1235","567","88"};
        p.solution(phone);

        String[] phone_ = {"119", "114", "112", "123223123", "1231231234"};
        p.solution(phone_);
    }
}
