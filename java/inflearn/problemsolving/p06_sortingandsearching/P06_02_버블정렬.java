package inflearn.problemsolving.p06_sortingandsearching;

import java.util.Scanner;

public class P06_02_버블정렬 {
    public static int[] solve(int n, int[] arr) {
        /*
        1. 인접한 2개의 레코드 비교, 작은 숫자를 앞으로 교환
        2. 가장 큰 수가 오른쪽 끝으로 가게 됨
        3. 1의 과정을 다시 진행하여 모든 숫자가 정렬될 때 까지 반복
         */
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        // 6
        // 13 5 11 7 23 15
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int x : solve(n, arr)) System.out.print(x + " ");
    }
}
