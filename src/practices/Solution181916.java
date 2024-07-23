package practices;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/181916
public class Solution181916 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c, d};
        arr = Arrays.stream(arr).sorted()
                .toArray();
        // All 4 dice show the same number
        // 1111 * p point
        if (arr[0] == arr[3]) return arr[0] * 1111;
            // Three dice show the same number
            // (10 × p + q)^2
        if (arr[0] == arr[2]) return (arr[0] * 10 + arr[3]) * (arr[0] * 10 + arr[3]);
        if (arr[1] == arr[3]) return ((arr[1] * 10 + arr[0]) * (arr[1] * 10 + arr[0]));

        // Two pairs of dice show the same number
        if (arr[0] == arr[1] && arr[2] == arr[3])
            // get   (p + q) × |p - q| point
            return (arr[2] - arr[1]) * (arr[2] + arr[1]);

        // Two dice show the same number, other two are different
        if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[3]) {
            if (arr[0] == arr[1]) return arr[2] * arr[3];
            if (arr[1] == arr[2]) return arr[0] * arr[3];
            return arr[0] * arr[1];
        }
        // the numbers on all 4 dice are different, get min(numbers)  point
        else return arr[0];
    }
}
