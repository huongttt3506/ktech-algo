package practices;

import java.util.stream.IntStream;

// https://school.programmers.co.kr/learn/courses/30/lessons/181931
public class Solution181931 {
    public static int solution(int a, int d, boolean[] included) {
        return IntStream.range(0, included.length)
                .map(i -> included[i] ? (a + i * d) : 0)
                .sum();
//        int[] aNums = new int[included.length];
//        aNums[0] = a;
//        int answer = a * (included[0]? 1: 0);
//        for (int i = 1; i < included.length; i++) {
//            aNums[i] = aNums[i-1]+ d;
//            answer+= aNums[i] * (included[i]? 1: 0);
//        }
//        return answer;
    }

    public static void main(String[] args) {
        boolean[] included = {true, false, false, true, true};
        System.out.println(solution(3, 4, included));
    }
}
