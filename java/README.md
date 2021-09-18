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

### Collection
