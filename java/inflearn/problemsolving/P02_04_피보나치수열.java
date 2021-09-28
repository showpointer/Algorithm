package inflearn.problemsolving;

import java.util.Scanner;

public class P02_04_피보나치수열 {

    public static int recursion(int n, int[] arr) {
        if (arr[n] != 0) return arr[n];
        if (n == 1 || n == 2) {
            arr[n] = 1;
            System.out.print(arr[n] + " ");
            return 1;
        } else {
            arr[n] = recursion(n-1, arr) + recursion(n-2, arr);
            System.out.print(arr[n] + " ");
            return arr[n];
        }
    }

    public static int[] intArr(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer;
    }

    public static void intval(int n) {
        int a = 1, b = 1;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        // 10 => 1 1 2 3 5 8 13 21 34 55
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

//        // 방법1: 재귀
//        int[] arr = new int[n+1];
//        recursion(n, arr);

//        // 방법2: int형 배열 활용
//        for(int i : intArr(n)) System.out.print(i + " ");

        // 방법3: 배열 없이 int 변수만 사용
        intval(n);
    }
}
