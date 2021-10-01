// https://cote.inflearn.com/contest/10/problem/02-09
package inflearn.problemsolving;

import java.util.Scanner;

public class P02_09_격자판최대합 {

    public static int solve(int n, int[][] arr) {
        int answer = 0;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];

                if (i == j) leftDiagonalSum += arr[i][j];
                if ((i + j) == n-1) rightDiagonalSum += arr[i][j];
            }
            if (rowSum > answer) answer = rowSum;
            if (colSum > answer) answer = colSum;
        }

        if (leftDiagonalSum > answer) answer = leftDiagonalSum;
        if (rightDiagonalSum > answer) answer = rightDiagonalSum;

        return answer;
    }

    public static void main(String[] args) {
//        5
//        10 13 10 12 15
//        12 39 30 23 11
//        11 25 50 53 15
//        19 27 29 37 27
//        19 13 30 13 19
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solve(n, arr));
    }
}
