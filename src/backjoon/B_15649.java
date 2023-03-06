package backjoon;

import java.util.*;

public class B_15649 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> number = new ArrayList<>();
        // Deque<Integer> deq = new ArrayDeque<>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int firstNum = 1;
        int count = 0;
        int[] result = new int[m];

        for (int i = 1; i <= n; i++) {
            number.add(i);
        }


        do {

            for (int i = 0; i < m; i++) {
                result[i] = number.get(i);
            }


            int temp = number.get(m - 1);
            number.add(temp);
            number.remove(m - 1);
            count++;


            if (result[m-1]==n && count == m) {
                count = 0;
                number.add(temp);
                number.remove(m - 1);
            }

            System.out.println(Arrays.toString(result));
            firstNum++;

        } while (firstNum <= n);

    }
}
