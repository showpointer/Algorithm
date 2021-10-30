// https://cote.inflearn.com/contest/10/problem/02-02
package inflearn.problemsolving.p02_array;

import java.util.Scanner;

public class P02_02_보이는학생 {

    public static int solve(String[] s) {
        int answer = 1;
        int max = Integer.parseInt(s[0]);

        for (int i = 1; i < s.length; i++) {
            int height = Integer.parseInt(s[i]);
            if (max < height) {
                answer++;
                max = height;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        // 8
        // 130 135 148 140 145 150 150 153
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        String[] input = in.nextLine().split(" ");

        System.out.println(solve(input));
    }
}
