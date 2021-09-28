// https://cote.inflearn.com/contest/10/problem/02-05
package inflearn.problemsolving;

import java.util.Scanner;

public class P02_05_소수_에라토스테네스체 {

    public static int solve(int n) {
        int answer = 0;

        // 에라토스테네스 체
        int[] ch = new int[n+1];
        for (int i = 2; i <=n; i++) {
            if (ch[i] == 0) answer++;
            for (int j = i; j <= n; j = j+i) {
                ch[j] = 1;
            }
        }

//        // 이중 for문 => 시간초과
//        for (int i = 2; i <=n; i++) {
//            boolean isPrime = true;
//            for (int j = 2; j < i; j++) {
//                if (i%j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) answer++;
//        }

        return answer;
    }

    public static void main(String[] args) {
        // 20 => 8
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        System.out.println(solve(input));
    }
}
