package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class B_10773 {

    public static Stack<Integer> stack = new Stack<>();

    int answer = 0;
    public void push(int num) {

        if (num == 0) {
            answer-= stack.peek();
            stack.pop();
        } else {
            stack.push(num);
            answer+= num;
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        B_10773 b = new B_10773();

        int x = sc.nextInt();

        for(int i =0; i < x; i++){
            int num = sc.nextInt();
            b.push(num);
        }

        System.out.println(b.answer);

    }
}
