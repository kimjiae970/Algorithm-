package programmers;

import java.util.ArrayList;

class Prac13 {
    public String solution(String new_id) {
        String answer = "";

        String id = new_id.toLowerCase();

        String[] arr = new String[id.length()];
        int count = 0;

        for (int i = 0; i < id.length(); i++) {
            if (id.charAt(i) == '-' || id.charAt(i) == '_' || id.charAt(i) == '.') {
                arr[count] = String.valueOf(id.charAt(i));
                count++;
            } else if (id.charAt(i) >= '0' && id.charAt(i) <= '9') {
                arr[count] = String.valueOf(id.charAt(i));
                count++;
            } else if (id.charAt(i) >= 'a' && id.charAt(i) <= 'z') {
                arr[count] = String.valueOf(id.charAt(i));
                count++;
            }
        }

        ArrayList arrayList = new ArrayList();

        for (String s : arr) {
            if (s != null)
                arrayList.add(s);
        }

        while (true) {

            answer = "";

            for (int i = 0; i < arrayList.size(); i++) {

                if (i == 0 || i == (arrayList.size() - 1)) {
                    if (arrayList.get(i).equals(".")) {
                        arrayList.remove(i);
                    }
                }

                if (i >= 0 && i < (arrayList.size() - 1)) {
                    if (arrayList.get(i).equals(arrayList.get(i + 1)) && arrayList.get(i + 1).equals(".")) {
                        continue;
                    } else {
                        answer += arrayList.get(i);
                    }
                }

                if (i == arrayList.size() - 1) {
                    answer += arrayList.get(i);
                }

            }

            if (answer.equals(""))
                break;

            if (answer.charAt(0) != '.' && answer.charAt(answer.length() - 1) != '.')
                break;


        }


        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
        }

        if (answer.length() >= 3) {
            while (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        if (answer.length() <= 2 && answer.length() > 0) {
            while (answer.length() != 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }

        if (answer.equals("")) {
            answer = "aaa";
        }

        System.out.println(answer);

        return answer;
    }

}