package practice_programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181935
public class Solution181935 {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i += 2) answer += i;
        } else {
            for (int i = 2; i <= n; i += 2)  answer += i * i;
        }
        return answer;
    }
}
