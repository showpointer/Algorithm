// https://cote.inflearn.com/contest/10/problem/03-01
package inflearn.problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_01_두배열합치기 {

    public static List<Integer> solve(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }

        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);

        return answer;
    }

    public static void main(String[] args) {
//        3
//        1 3 5
//        5
//        2 3 6 7 9
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        for(int x : solve(n, m, a, b)) System.out.print(x + " ");
    }
}
