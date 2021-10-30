// https://cote.inflearn.com/contest/10/problem/01-10
package inflearn.problemsolving.p01_string;

import java.util.Scanner;

public class P10_가장짧은문자거리 {

    public static String solve(String s, char t) {
        String answer = "";

        // 각 문자마자 왼쪽/오른쪽 검사 : 거리 + 1
        char[] tmp = s.toCharArray();
        int len = tmp.length;

        int index = 0;
        for (char x : s.toCharArray()) {
            int distance = 0;

            for (int i = 0; i < len; i++) {
                int left = index - i;
                int right = index + i;

                if (left >= 0) {
                    if (tmp[left] == t) {
                        answer += distance + " ";
                        break;
                    }
                }

                if (right < len) {
                    if (tmp[right] == t) {
                        answer += distance + " ";
                        break;
                    }
                }

                distance++;
            }
            index++;
        }

        return answer;
    }

    public static void main(String[] args) {
        // teachermode e => 1 0 1 2 1 0 1 2 2 1 0
        Scanner in = new Scanner(System.in);

        String s = in.next();
        char t = in.next().charAt(0);

        System.out.println(solve(s, t));
    }
}
