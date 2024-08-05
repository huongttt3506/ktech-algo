package practice_programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181903
public class Solution181903 {
    public String solution(int q, int r, String code) {
        String answer = "";
        for (int i = r; i < code.length(); i += q) {
            answer += code.charAt(i);
        }
        return answer;
    }
}
