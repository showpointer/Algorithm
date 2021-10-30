// https://cote.inflearn.com/contest/10/problem/05-01
package inflearn.problemsolving.p05_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class P05_01_올바른괄호 {

    public static String solve(String s) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return "NO";
                else stack.pop();
            }
        }

        if (!stack.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        // (()(()))(() => NO
        // ((()())()))) => NO
        Scanner in = new Scanner(System.in);
        String input = in.next();

        System.out.println(solve(input));
    }
}
