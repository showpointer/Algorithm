package inflearn.problemsolving.p06_sortingandsearching;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_04_LRU {

    public static List<Integer> solve(int s, int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        // 맨 앞에 넣기
        for (int i = 0; i < n; i++) {
            if (answer.contains(arr[i])) {
                int tmp = arr[i];
                answer.remove(Integer.valueOf(arr[i]));
                answer.add(0, tmp);
            } else {
                if (answer.size() >= s) {
                    answer.remove(s-1);
                }
                answer.add(0, arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
//        5 9
//        1 2 3 2 6 2 3 5 7
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int x : solve(s, n, arr)) System.out.print(x + " ");
    }
}
