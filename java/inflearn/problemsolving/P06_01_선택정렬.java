// https://cote.inflearn.com/contest/10/problem/06-01
package inflearn.problemsolving;

import java.util.Scanner;

public class P06_01_선택정렬 {

    public static int[] solve(int n, int[] arr) {

//        주어진 리스트 중에 최소값을 찾는다.
//        그 값을 맨 앞에 위치한 값과 교체한다(패스(pass)).
//        맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
        for(int i = 0; i < n-1; i++) {
            int idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
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

        for(int x : solve(n, arr)) System.out.print(x + " ");
    }
}
