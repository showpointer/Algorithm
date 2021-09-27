// https://cote.inflearn.com/contest/10/problem/02-03
package inflearn.problemsolving;

import java.util.Scanner;

public class P02_03_가위바위보 {

    public static String solve(int cnt, int[] a, int[] b) {
        String answer = "";

        // 1=가위 2=바위 3=보
        for (int i = 0; i < cnt; i++) {
            if (a[i] == b[i]) answer += "D" + "\n";
            else if (a[i] == 1 && b[i] == 3) answer += "A" + "\n";
            else if (a[i] == 2 && b[i] == 1) answer += "A" + "\n";
            else if (a[i] == 3 && b[i] == 2) answer += "A" + "\n";
            else answer += "B" + "\n";
        }

        return answer;
    }

    public static void main(String[] args) {
        // 5
        //2 3 3 1 3
        //1 1 2 2 3
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] a = new int[cnt];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[cnt];
        for (int i = 0; i < b.length; i++) {
            b[i] = in.nextInt();
        }

        System.out.println(solve(cnt, a, b));
    }
}
