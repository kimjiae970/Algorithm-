package programmers;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;

class Prac18 {
    public boolean solution(String[] p) {


        boolean answer = true;

        ArrayList<String> phone = new ArrayList<>();
        boolean x = true;

        for(int i = 0; i < p.length; i++) {
            phone.add(p[i]);
        }

        for(int i = 0; i < phone.size(); i++) {
            String Str1 = phone.get(i);
            int len1 = phone.get(i).length();

            for(int j = 0; j < phone.size(); j++) {

              String Str2 = phone.get(j);
              int len2 = phone.get(j).length();

              if(Str1.equals(Str2)){
                    continue;;
              }else {
                  if (Str1.length() > Str2.length()) {
                      Str1.substring(0, Str2.length() - 1);

                      if (Str1.equals(Str2)) {
                          x = false;
                      }
              } else if (Str2.length() > Str1.length()) {
                      Str2.substring(0, Str1.length() - 1);

                      if (Str1.equals(Str2)) {
                          x = false;
                      }
              } else if (Str1.equals(Str2)) {

                          x = false;
              }

                  System.out.println(x);
                }

                }




    public static void main(String[] args) {

        Prac18 p = new Prac18();

        String[] pho = {"119", "97674223", "1195524421"};
        p.solution(pho);

        String[] phon = {"123","456","789"};
        p.solution(phon);

        String[] phone1 = {"12","123","1235","567","88"};
        p.solution(phone);

        String[] phone_ = {"119", "114", "112", "123223123", "1231231234"};
        p.solution(phone_);
    }
}
