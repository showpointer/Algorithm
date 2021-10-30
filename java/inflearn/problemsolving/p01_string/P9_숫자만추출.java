// https://cote.inflearn.com/contest/10/problem/01-09
package inflearn.problemsolving.p01_string;

import java.util.Scanner;

public class P9_숫자만추출 {

    public static int solve(String s) {
        int answer;

        // 숫자만 남기기
        String tmp = s.toUpperCase().replaceAll("[^0-9]", "");

//        for (char x : s.toCharArray()) {
//            if (Character.isDigit(x)) {
//                tmp += x;
//            }
//        }

        answer = Integer.parseInt(tmp);

        return answer;
    }

    public static void main(String[] args) {
        // g0en2T0s8eSoft => 208
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(solve(input));
    }
}
