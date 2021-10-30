package inflearn.problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_05_중복확인 {

    public static String solve(int n, int[] arr) {
        List<Integer> temp = new ArrayList<>();

        // 입력 값 중 중복이 있으면 "D" 없으면 "U"
        // add... contain
        for (int i = 0; i < n; i++) {
            if (temp.contains(arr[i])) {
                return "D";
            }
            temp.add(arr[i]);
        }

        return "U";
    }

    public static void main(String[] args) {
//        8
//        20 25 52 30 39 33 43 33
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solve(n, arr));
    }
}
