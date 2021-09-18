// https://cote.inflearn.com/contest/10/problem/01-11
package inflearn.problemsolving;

import java.util.Scanner;

public class P11_문자열압축 {

    public static String solve(String s) {
        String answer = "";

        s = s + " ";
        int cnt = 1;

        // i, i+1 비교
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if (cnt > 1) answer += String.valueOf(cnt);

                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // KKHSSSSSSSE => K2HS7E
        // KSTTTSEEKFKKKDJJGG => KST3SE2KFK3DJ2G2
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(solve(input));
    }
}
