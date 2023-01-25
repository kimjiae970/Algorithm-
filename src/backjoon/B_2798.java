package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_2798 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int answer = m;

        for (int i = 0; i < arr.length-2; i++) {
            for(int j = i+1; j < arr.length-1; j++) {
                for (int k = i+2; k < arr.length; k++ ) {

                    int temp = arr[i]+ arr[j]+arr[k];

                    if(answer > m - temp && m - temp >= 0) {
                        answer = m - temp;

                    }
                }
            }
        }

        System.out.println(m-answer);

    }
}
