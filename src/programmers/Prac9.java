package programmers;

import java.util.*;

class Prac9 {
    public int solution(int[] people, int limit) {
        int answer = people.length;

        Arrays.sort(people);

        if (limit - people[0] >= people[1]) {

            for (int i = people.length - 1; i > 0; i--) {

                if (limit - people[i] >= 40) {
                    for (int j = 0; j < i; j++) {

                        int temp = limit - people[i];

                        if (temp >= people[j]) {

                            people[i] = limit;
                            people[j] = limit;
                            answer--;
                        }
                    }
                }

            }
        }

        return answer;
    }

}
