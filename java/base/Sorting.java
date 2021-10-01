package base;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

    public static void main(String[] args) {
        int[] arr = {1, 26, 17, 25, 99, 44, 303};

        List<Integer> sorted = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        List<Integer> reversed = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Sorted arr[] : " + sorted);
        System.out.println("Sorted arr[] : " + reversed);
    }
}
