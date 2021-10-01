// https://cote.inflearn.com/contest/10/problem/02-07
package inflearn.problemsolving;

import java.util.Scanner;

public class P02_07_점수계산 {

    public static int solve(int n, int[] arr) {
        int answer = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else cnt = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        // 10
        // 1 0 1 1 1 0 0 1 1 0
        // => 10
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solve(n, arr));
    }
}
