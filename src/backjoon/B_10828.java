package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class B_10828 {

// stack 생성
    public static Stack<Integer> stack = new Stack<>();

// pop : 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static int pop() {

        if (stack.empty()) {
            return -1;
        } else {
            int temp = stack.peek();
            stack.pop();
            return temp;
        }
    }
//size: 스택에 들어있는 정수의 개수를 출력한다
    public static int size() {
        return stack.size();
    }

//empty: 스택이 비어있으면 1, 아니면 0을 출력한다
    public static int empty() {

        if(stack.empty()) {
            return 1;
        } else {
            return 0;
        }
    }

// top :스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다
    public static int top() {

        if(stack.empty()) {
            return -1;
        }else {
            return stack.peek();
        }
    }


    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            String command = sc.next();

            switch (command) {

                case "push":
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
    }
