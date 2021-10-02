## JAVA 자주 쓰는 함수

### String 제어 (문자열)

toUpperCase()
- 대문자로 변환

toLowerCase()
- 소문자로 변환

replaceAll(String regex, String replacement)
- 문자열 정규식으로 매핑하여 변환
```java
class StringUtils {
    // 알파벳 대문자만 남기고 지우기
    String str = "A011";
    String result = str.replaceAll("[^A-Z]", "");   
}
```

StringBuilder().reverse().toString()
- reverse 한 뒤 String 타입으로 변환

toCharArray()
- char 형 배열로 변환

### Char 제어
boolean Character.isDigit(char ch)
- 숫자인지 검사

### 진수 변환
```java
class Conversion {
    
    public static void main(String[] args) {
        // 10진수 -> 2진수, 8진수, 16진수
        int num = 16;
        String binary = Integer.toBinaryString(num); // 10진수->2진수
        String octal = Integer.toOctalString(num); // 10진수->8진수 
        String hex = Integer.toHexString(num); // 10진수-> 16진수
        
        System.out.println("binary = " + binary); //10000
        System.out.println("octal = " + octal); // 20
        System.out.println("hex = " + hex); // 10

        // 2진수, 8진수, 16진수 -> 10진수
        String decimal2 = Integer.parseInt(binary, 2); // 2진수 -> 10진수
        String decimal8 = Integer.parseInt(octal, 8); // 2진수 -> 8진수
        String decimal16 = Integer.parseInt(hex, 16); // 2진수 -> 16진수

        System.out.println("decimal2 = " + decimal2); // 16
        System.out.println("decimal8 = " + decimal8); // 16
        System.out.println("decimal16 = " + decimal16); // 16
    }
}
```

### 정렬
List, int[]
```java
import java.util.ArrayList;

class IntegerListArraySorting {

    public static void main(String[] args) {
        // int 배열/List<Integer> 정렬 (오름차순, 내림차순)
        int[] arr = {1, 26, 17, 25, 99, 44, 303};
        List<Integer> arr2 = new ArrayList<>({1, 26, 17, 25, 99, 44, 303});
        
        // 오름차순
        Arrays.sort(arr);
        Collections.sort(arr2);
        System.out.println("Sorted arr[] : " + Arrays.toString(arr));
        System.out.println("Sorted arr[] : " + Arrays.toString(arr2));

        // 내림차순
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted arr[] : " + Arrays.toString(arr));

        // 내림차순: Comparator 구현 => Integer 사용해야 함
        Integer[] arr = {1, 26, 17, 25, 99, 44, 303};
        Arrays.sort(arr, (i1, i2) -> i2 - i1);
        System.out.println("Sorted arr[] : " + Arrays.toString(arr));

        // 0~4 index 부분 정렬
        Arrays.sort(arr, 0, 4);
        System.out.println("Sorted arr[] : " + Arrays.toString(arr));

        // 문자열 길이순 정렬
        String[] arr = {"Apple", "Kiwi", "Orange", "Banana", "Watermelon", "Cherry"};
        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted arr[] : " + Arrays.toString(arr));
    }
}
```

Map
```java
class MapSorting {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Korea", "Seoul");
        map.put("United States", "Washington");
        map.put("Japan", "Tokyo");

        // sort by key
        List<Map.Entry<String, String>> entries =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toList());
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", "
                    + "Value: " + entry.getValue());
        }

        // sort by value
        entries = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", "
                    + "Value: " + entry.getValue());
        }
    }
}

```

### Collection
```java
class CollectionConversion {

    public static void main(String[] args) {
        // int -> List<Integer> 형변환
        // 1. for문 사용
        int[] arr = {1, 2, 3};
        List<Integer> intList = new ArrayList<>();
        for (int element : arr) {
            intList.add(element);
        }

        // 2. Stream 사용
        List<Integer> intList = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
    }
}
```
