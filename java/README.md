## JAVA 자주 쓰는 함수

#### String 제어 (문자열)

toUpperCase()
- 대문자로 변환

toLowerCase()
- 소문자로 변환

replaceAll(String regex, String replacement)
- 문자열 정규식으로 매핑하여 변환
```java
// 알파벳 대문자만 남기고 지우기
String str = "A011";
String result = str.replaceAll("[^A-Z]", "");
```

toCharArray()
- char 형 배열로 변환

#### Char 제어

boolean Character.isDigit(char ch)
- 숫자인지 검사