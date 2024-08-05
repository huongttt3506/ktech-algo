package practice_programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181910

public class Solution181910 {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length();
        for (int i = len - n; i < len; i++) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
