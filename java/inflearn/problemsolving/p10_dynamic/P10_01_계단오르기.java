// https://cote.inflearn.com/contest/10/problem/10-01
package inflearn.problemsolving.p10_dynamic;

import java.util.Scanner;

public class P10_01_계단오르기 {

    static int[] dy;

    public static int solve(int n) {
        int answer = 0;
        dy[1] = 1;
        dy[2] = 2;
        for (int i =3; i <= n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        answer = dy[n];
        return answer;
    }

    public static void main(String[] args) {
        // 7 => 21
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        dy = new int[n+1];
        System.out.println(solve(n));
    }
}
