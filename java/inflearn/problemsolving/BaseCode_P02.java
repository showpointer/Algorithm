package inflearn.problemsolving;

import java.util.Scanner;

public class BaseCode_P02 {

    public static int solve(int n, int[] arr) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        // 5
        //87 89 92 100 76
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solve(n, arr));
    }
}
