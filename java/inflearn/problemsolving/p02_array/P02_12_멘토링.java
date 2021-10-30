// https://cote.inflearn.com/contest/10/problem/02-12
package inflearn.problemsolving.p02_array;

import java.util.Arrays;
import java.util.Scanner;

public class P02_12_멘토링 {

    public static int solve(int examCnt, int studentCnt, int[][] arr) {
        int answer = 0;
        boolean[][] pair = new boolean[studentCnt][studentCnt];
        for (int i = 0; i < studentCnt; i++) {
            Arrays.fill(pair[i], true);
        }

        for (int k = 0; k < examCnt; k++) {
            for (int i = 0; i < studentCnt; i++) {
                for (int j = 0; j < i; j++) {
                    int mentiNum = arr[k][i];
                    int mentorNum = arr[k][j];

                    pair[mentiNum-1][mentorNum-1] = false;
                }
            }
        }

        for (int i = 0; i < studentCnt; i++) {
            for (int j = 0; j < studentCnt; j++) {
                if(i == j) continue;
                if(pair[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        4 3
//        등수
// 시험1   3 4 1 2
// 시험2   4 3 2 1
//         3 1 4 2

        Scanner in = new Scanner(System.in);
        int studentCnt = in.nextInt();
        int examCnt = in.nextInt();

        int[][] arr = new int[examCnt][studentCnt];
        for (int i = 0; i < examCnt; i++) {
            for (int j = 0; j < studentCnt; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solve(examCnt, studentCnt, arr));
    }
}
