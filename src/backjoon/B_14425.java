package backjoon;

import java.util.HashSet;
import java.util.Scanner;

public class B_14425 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;

        HashSet<String> s = new HashSet<>();

        for (int i = 0; i < n; i++) {

            String s_word = sc.next();
            s.add(s_word);
        }

        for ( int j = 0; j < m; j++) {

            String s_word = sc.next();

                if(s.contains(s_word)){
                    count++;
                }
        }

        System.out.println(count);
    }
}
