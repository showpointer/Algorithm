// https://cote.inflearn.com/contest/10/problem/02-11
package inflearn.problemsolving.p02_array;

import java.util.Scanner;

public class P02_11_임시반장정하기 {

    public static int solve(int n, int[][] arr) {
        int answer = 0;
        int[][] cnt = new int[n][n];
        int[] sum = new int[n];
        // 3<= n <= 1000명

        for(int k = 0; k < 5; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    int studentIndex = i;
                    int studentClass = arr[studentIndex][k];

                    if (studentIndex == j) continue;
                    if (studentClass == arr[j][k]) {
                        cnt[studentIndex][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i] += cnt[i][j];
            }
        }

        int max = Integer.MIN_VALUE;
        // 같은 값인 경우 작은 값 return
        for (int i = 0; i < n; i++) {
            //System.out.println("i = " + i + "sum[i] = " + sum[i]);
            if (sum[i] > max) {
                max = sum[i];
                answer = i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        5
//        2 3 1 7 3
//        4 1 9 6 8
//        5 5 2 4 4
//        6 5 2 6 7
//        8 4 2 2 2

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solve(n, arr));
    }
}
