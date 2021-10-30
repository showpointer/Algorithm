// https://cote.inflearn.com/contest/10/problem/02-08
package inflearn.problemsolving.p02_array;

import java.util.*;
import java.util.stream.Collectors;

public class P02_08_등수구하기 {
    public static List<Integer> solve(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> sortedArr = Arrays.stream(arr).
                boxed().
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

        for (int i = 0; i < n; i++) {
            int index = sortedArr.indexOf(arr[i]) + 1;
            answer.add(index);
        }

        return answer;
    }

    public static void main(String[] args) {
        // 5
        // 87 89 92 100 76 => 4 3 2 1 5
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int x : solve(n, arr)) System.out.print(x+ " ");
    }
}
