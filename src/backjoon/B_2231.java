package backjoon;

import java.util.Arrays;
import java.util.Scanner;


public class B_2231 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = 0;

        for ( int i = 0; i < n; i++) {

            String[] m = new String[String.valueOf(n -i).length()+1];
            int total = 0;

            for (int j = 0; j < String.valueOf(n -i).length()+1; j++ ) {

                if ( j == 0) {
                    m[0] = String.valueOf(n-i);
                    total += Integer.parseInt(m[0]);
                } else {
                    m[j] = String.valueOf(m[0].charAt(j-1));
                    total += Integer.parseInt(m[j]);
                }
            }

            if ( total == n) {

                if( min == 0 ) {
                    min = Integer.parseInt(m[0]);
                }else if ( min > Integer.parseInt(m[0])) {
                    min = Integer.parseInt(m[0]);
                }
            }

        }
        System.out.println(min);
    }
}