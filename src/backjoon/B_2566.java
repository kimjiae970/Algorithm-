package backjoon;

import java.util.Scanner;

public class B_2566 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = 0;
        int n = 0;
        int m = 0;


        for ( int i = 0; i < 9; i++){
            for ( int j = 0; j < 9; j++){

                arr[i][j] = sc.nextInt();

                if (max <= arr[i][j]) {
                    max = arr[i][j];
                    n = i+1;
                    m = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.print(n + " "+ m);
    }
}
