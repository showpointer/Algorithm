// https://cote.inflearn.com/contest/10/problem/09-01
package inflearn.problemsolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
    public int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o){
        return o.h-this.h;
    }
}

public class P09_01_씨름선수 {
    public static int solution(ArrayList<Body> arr, int n){
        int cnt = 0;
        Collections.sort(arr);

        int max=Integer.MIN_VALUE;

        for (Body ob : arr) {
            if (ob.w > max) {
                max=ob.w;
                cnt++;
            }
        }
        return cnt;
    }
//    public static int solve(int n, int[] a, int[] b) {
//        int answer = 0;
//
//        for (int i = 0; i < n; i++) {
//            boolean flag = true;
//            for (int j = 0; j < n; j++) {
//                if (a[i] < a[j] && b[i] < b[j]) flag = false;
//            }
//            if (flag) answer++;
//        }
//        return answer;
//    }

    public static void main(String[] args) {
//        5
//        172 67
//        183 65
//        180 70
//        170 72
//        181 60

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h= in.nextInt();
            int w= in.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(solution(arr, n));
    }
}
