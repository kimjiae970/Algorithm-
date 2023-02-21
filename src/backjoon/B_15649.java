package backjoon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class B_15649 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Byte n = sc.nextByte();
        Byte m = sc.nextByte();

        HashSet set = new HashSet();

        Byte i = 0;
        Byte j = 0;
        int temp = 1;


        while (i < n) {

            while (j < m) {

                set.add(temp++);

                if((temp+1) <= n) {
                    temp = temp+1;
                }
                j++;
            }
            System.out.println(set);
           i++;
        }


    }
    }
