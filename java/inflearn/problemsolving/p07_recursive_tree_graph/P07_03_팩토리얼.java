package inflearn.problemsolving.p07_recursive_tree_graph;

import java.util.Scanner;

public class P07_03_팩토리얼 {

    public static int solve(int n) {
        if (n == 1) return 1;
        return n * solve(n-1);
    }

    public static void main(String[] args) {
        // 5 => 120
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        System.out.println(solve(input));
    }
}
