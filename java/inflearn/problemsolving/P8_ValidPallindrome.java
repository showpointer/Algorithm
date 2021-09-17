// https://cote.inflearn.com/contest/10/problem/01-08
package inflearn.problemsolving;

import java.util.Scanner;

public class P8_ValidPallindrome {

    public static String solution(String s) {
        String answer = "NO";

        // 대문자 변환, 알파벳 대문자만 남기기
        s = s.toUpperCase().replaceAll("[^A-Z]", "");

        // 역방향 전환 후 비교
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args){
        // found7, time: study; Yduts; emit, 7Dnuof
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();

        System.out.println(solution(input));
    }
}