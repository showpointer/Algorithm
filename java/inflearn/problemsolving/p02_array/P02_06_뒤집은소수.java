// https://cote.inflearn.com/contest/10/problem/02-06
package inflearn.problemsolving.p02_array;

import java.util.ArrayList;
import java.util.Scanner;

public class P02_06_뒤집은소수 {

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num%i == 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> solve(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp%10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) answer.add(res);
        }

        return answer;

//        String answer = "";
//        int max = -1;
//
//        for (int i = 0; i < n; i++) {
//            // 뒤집기
//            String str = new StringBuilder(String.valueOf(arr[i])).reverse().toString();
//            int num = Integer.parseInt(str);
//
//            if (max < num) max = num;
//            arr[i] = num;
//        }
//
//        int[] ch = new int[max+1];
//        ch[0] = 1;
//        ch[1] = 1;
//        for (int i = 2; i <=max; i++) {
//            for (int j = i + i; j <= max; j = j+i) {
//                ch[j] = 1;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (ch[arr[i]] == 0) answer += arr[i] + " ";
//        }
//
//        return answer;
    }

    public static void main(String[] args) {
        // 9
        // 32 55 62 20 250 370 200 30 100
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        //System.out.println(solve(n, arr));
        for (int x : solve(n, arr)) System.out.print(x + " ");
    }
}
