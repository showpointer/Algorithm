package inflearn.problemsolving.p07_recursive_tree_graph;

import java.util.Scanner;

public class P07_04_피보나치재귀 {

    // 메모이제이션 활용
    static int[] dp;

    public static int solve(int n) {
        if(dp[n] > 0) return dp[n];
        if (n == 1) return dp[n] = 1;
        else if (n == 2) return dp[n] = 1;
        else return dp[n] = solve(n-1) + solve(n-2);
    }

    public static void main(String[] args) {
        // 10 => 1 1 2 3 5 8 13 21 34 55
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        dp = new int[n+1];

        for(int i=1; i <= n; i++) System.out.println(solve(i));
    }
}
