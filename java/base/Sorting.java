package base;

import java.util.*;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {1, 26, 17, 25, 99, 44, 303};
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 26, 17, 25, 99, 44, 303));

        // 오름차순
        Arrays.sort(arr);
        Collections.sort(arr2);
        System.out.println("Sorted arr[] : " + Arrays.toString(arr));
        System.out.println("Sorted List<Integer> arr : " + arr2);

        int[] arr3 = {1, 26, 17, 25, 99, 44, 303};
        List<Integer> arr4 = new ArrayList<>(Arrays.asList(1, 26, 17, 25, 99, 44, 303));

        List<Integer> sorted = Arrays.stream(arr3).boxed().sorted().collect(Collectors.toList());
        List<Integer> reversed = Arrays.stream(arr3).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        Collections.sort(arr4, Collections.reverseOrder());

        System.out.println("Sorted arr[] : " + sorted);
        System.out.println("reverse Sorted arr[] : " + reversed);
        System.out.println("reverse Sorted List<Integer> arr : " + arr4);

        // Map: Sort by Value
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 1020);
        map.put(3, 300);
        map.put(1, 100);
        map.put(5, 500);
        map.forEach((k,v) -> System.out.println(k+"="+v));
        System.out.println("After Sorting by value");
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
        list.forEach(System.out::println);
    }
}
