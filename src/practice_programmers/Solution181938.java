package practice_programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181938
public class Solution181938 {
    public static int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) +String.valueOf(b));
        int c = 2 * a * b;
        return Math.max(ab, c);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        solution(a, b);
    }
}
