package inflearn.problemsolving.p07_recursive_tree_graph;

import java.util.Scanner;

public class P07_06_부분집합구하기DFS {
    static int L = 0;
    static int[] arr;

    private static void DFS(int n) {
        if (n == L+1) {
            for (int a : arr) {
                if (a != 0) System.out.print(a + " ");
            }
            System.out.println();
        }
        else {
            arr[n] = n;
            DFS(n+1);
            arr[n] = 0;
            DFS(n+1);
        }
    }

    public static void main(String[] args) {
        // 3 =>
        // 1 2 3
        // 1 2
        // 1 3
        Scanner in = new Scanner(System.in);

        L = in.nextInt();
        arr = new int[L+1];
        DFS(1);
    }
}
