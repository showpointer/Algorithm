// https://cote.inflearn.com/contest/10/problem/07-01
package inflearn.problemsolving.p07_recursive_tree_graph;

import java.util.Scanner;

public class P07_01_재귀함수 {

    public static void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        // 3 => 1 2 3
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        DFS(n);
    }
}
