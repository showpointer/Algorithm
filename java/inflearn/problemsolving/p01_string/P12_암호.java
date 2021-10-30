// https://cote.inflearn.com/contest/10/problem/01-12
package inflearn.problemsolving.p01_string;

import java.util.Scanner;

public class P12_암호 {
    /*
    1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.

    2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.

    3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.

    참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.

     */
    public static String solve(int cnt, String s) {
        String answer = "";

        s = s.replace('#', '1').replace('*', '0');
        String[] str = new String[cnt];

        for (int i = 0; i < cnt; i++) {
            // 일곱자리씩 끊기 방법1
            //str[i] = s.substring(i*7, 7+(i*7));

            // 일곱자리씩 끊기 방법1
            str[i] = s.substring(0, 7);
            s = s.substring(7);
            answer += (char)Integer.parseInt(str[i], 2);
        }

        return answer;
    }

    public static void main(String[] args) {
        // 4
        //#****###**#####**#####**##**  => COOL
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        String s = in.next();

        System.out.println(solve(cnt, s));
    }
}
