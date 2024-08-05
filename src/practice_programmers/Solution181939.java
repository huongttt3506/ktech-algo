package practice_programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181939
public class Solution181939 {
    public int solution(int a, int b) {
        String abStr = String.valueOf(a) + String.valueOf(b);
        String baStr = String.valueOf(b) + String.valueOf(a);
        int ab = Integer.parseInt(abStr);
        int ba = Integer.parseInt(baStr);
        return Math.max(ab, ba);
    }
}
