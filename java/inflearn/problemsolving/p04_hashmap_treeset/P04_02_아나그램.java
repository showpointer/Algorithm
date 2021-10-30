// https://cote.inflearn.com/contest/10/problem/04-02
package inflearn.problemsolving.p04_hashmap_treeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_02_아나그램 {

    public static String solve(String a, String b) {
        String answer = "YES";

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : b.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }


        for (char x : b.toCharArray()) {
            if (!map.containsKey(x)) {
                answer = "NO";
                break;
            }

            if (map.get(x) != map2.get(x)) {
                answer = "NO";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //AbaAeCe
        //baeeACA  => YES
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();

        System.out.println(solve(a, b));
    }
}
