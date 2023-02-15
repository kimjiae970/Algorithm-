package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_2738 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte n = sc.nextByte();
        byte m = sc.nextByte();

        byte[][] element1 = new byte[n][m];
        int[][] result = new int[n][m];

        for ( byte i = 0; i < n; i ++) {
            for ( byte j = 0; j < m; j++) {

                byte element = sc.nextByte();
                element1[i][j] = element;
            }
        }

        for ( byte i = 0; i < n; i ++) {
            for ( byte j = 0; j < m; j++) {

                byte element = sc.nextByte();
                result[i][j] = element1[i][j] + element;
            }
        }

        for ( int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }


    }
}
