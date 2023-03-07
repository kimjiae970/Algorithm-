package backjoon;

import java.util.Scanner;

public class B_15649 {

    static boolean[] check = new boolean[10];
    static int[] graph = new int[10];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        dfs(0,n,m);
    }

    private static void dfs(int index, int n, int m) {

        if(index == m) {

            for(int value : graph) {

                if(value != 0) System.out.print(value + " ");
            }

            System.out.println();

            return ;

        }

        for (int i = 1; i <= n; i++) {

            if(check[i]) continue;

            check[i] = true;

            graph[index] = i;

            dfs(index + 1, n, m);

            check[i] = false;
        }
    }
}
