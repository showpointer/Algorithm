package inflearn.problemsolving.p08_dfs_bfs;

import java.util.Scanner;

public class P08_합이같은부분집합_DFS {

    static int n, total = 0;
    static String answer = "NO";
    static boolean flag = false;

    public static void DFS(int d, int sum, int[] arr) {
        if (flag) return;
        if (sum > total/2) return;
        if (d == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(d+1, sum + arr[d], arr);
            DFS(d+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        // 6
        // 1 3 5 6 7 10   => YES
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
