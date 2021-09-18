// https://programmers.co.kr/learn/courses/30/lessons/82612
package programmers.weeklychallenge;

public class P1주차_부족한금액계산하기 {

    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalMoney = 0;

        for (int i = 1; i <= count; i++) {
            totalMoney += price * i;
        }

        answer = totalMoney - money;
        return answer > 0 ? answer : 0;
    }
}
