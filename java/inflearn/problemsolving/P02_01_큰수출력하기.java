// https://cote.inflearn.com/contest/10/problem/02-01
package inflearn.problemsolving;

import java.util.Scanner;

public class P02_01_큰수출력하기 {

    public static String solve(String[] s) {
        String answer = s[0] + " ";

        for (int i = 1; i < s.length; i++) {
            int num = Integer.parseInt(s[i]);
            int frontNum = Integer.parseInt(s[i-1]);
            if (num >= frontNum) answer += num + " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        // 6
        // 7 3 9 5 6 12 => 7 9 6 12
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] input = in.nextLine().split(" ");

        System.out.println(solve(input));
    }
}
