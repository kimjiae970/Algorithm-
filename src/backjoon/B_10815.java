package backjoon;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class B_10815 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            Integer x = sc.nextInt();
            set.add(x);
        }

        int m = sc.nextInt();


        for(int i = 0; i < m; i++) {
            Integer x = sc.nextInt();

            if (set.contains(x))
                result.add(1);
            else
                result.add(0);
        }

        Iterator iterator = result.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        }

}
