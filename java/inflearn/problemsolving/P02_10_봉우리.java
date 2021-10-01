// https://cote.inflearn.com/contest/10/problem/02-10
package inflearn.problemsolving;

import java.util.Scanner;

public class P02_10_봉우리 {

    public static int solve(int n, int[][] arr) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int answer = 0;

        // 봉우리 구하기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isPeak = true;
                for (int k =0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx < 0 || nx > n -1 || ny < 0 || ny > n -1) continue;
                    if (arr[nx][ny] >= arr[i][j]) {
                        isPeak = false;
                        break;
                    }
                }

                if(isPeak) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//            5
//            5 3 7 2 3
//            3 7 1 6 1
//            7 2 5 3 4
//            4 3 6 4 1
//            8 7 3 5 2
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
