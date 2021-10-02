// https://cote.inflearn.com/contest/10/problem/04-01
package inflearn.problemsolving;

import java.util.*;

public class P04_01_학급회장 {

    public static char solve(int n, String arr) {
        char answer = ' ';

        Map<Character, Integer> map = new HashMap<>();

        for (char c : arr.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        answer = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .findFirst().get().getKey();

        return answer;
    }

    public static void main(String[] args) {
//        15
//        BACBACCACCBDEDE
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();

        System.out.println(solve(n, s));
    }
}
