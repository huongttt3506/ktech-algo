package practice_programmers;

public class Solution120815 {
    public int solution(int n) {
        int answer = 1;
        while ((answer * 6) % n != 0) {
            answer++;
        }
        return answer;
    }
}
