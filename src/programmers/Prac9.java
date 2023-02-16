package programmers;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Prac9 {
    public int solution(int[] people, int limit) {

        int answer = people.length;

        Arrays.sort(people);

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i : people) {
            deque.add(i);
        }

        if (deque.size() > 1) {

            int first_peek = deque.getFirst();

            deque.removeFirst();

            if (limit >= first_peek + deque.getFirst()) {

                deque.addFirst(first_peek);

                while (deque.size() != 0) {

                    if (deque.size() == 1) {
                        deque.removeFirst();

                    } else if (deque.getFirst() + deque.getLast() <= limit) {
                        answer--;
                        deque.removeLast();
                        deque.removeFirst();

                    } else if (deque.getFirst() + deque.getLast() > limit) {
                        deque.removeLast();
                    }
                }
            }
        }

        return answer;

    }
}
