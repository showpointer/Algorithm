package inflearn.problemsolving.p06_sortingandsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P06_06_장난꾸러기 {

    public static List<Integer> solve(int n, int[] arr) {
        // 반 번호
        List<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) answer.add(i+1);
        }

        return answer;
    }

    public static void main(String[] args) {
//        9
//        120 125 152 130 135 135 143 127 160

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int x : solve(n, arr)) System.out.print(x + " ");
    }
}
