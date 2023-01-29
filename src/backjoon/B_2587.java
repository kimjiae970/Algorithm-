package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class B_2587 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte[] arr = new byte[5];
        int total = 0;

        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] = sc.nextByte();
            total += arr[i];
        }

        Arrays.sort(arr);

        System.out.println(total / 5);
        System.out.println(arr[2]);


    }
}
