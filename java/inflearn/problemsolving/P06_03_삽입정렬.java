package inflearn.problemsolving;

import java.util.Scanner;

public class P06_03_삽입정렬 {

    public static int[] solve(int n, int[] arr) {
        /*
        1. 정렬은 2번째 위치(index)의 값을 temp에 저장한다.
        2. temp와 이전에 있는 원소들과 비교하며 삽입해나간다.
        3. '1'번으로 돌아가 다음 위치(index)의 값을 temp에 저장하고, 반복한다.
        */
        for (int i = 1; i < n; i++) {
            // i index 보다 작은 범위 돌음
            int temp = arr[i], j;
            for (j = i-1; j >= 0; j--) {
                if (arr[j] > temp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = temp;
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
