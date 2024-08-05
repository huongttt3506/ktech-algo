package practice_programmers;

public class Solution120913 {
    public String[] solution(String my_str, int n) {
        int len = my_str.length() % n == 0 ? my_str.length() / n: my_str.length() / n + 1;
        String[] answer = new String[len];
        int start = 0;
        for (int i = 0; i < len - 1; i++) {
            answer[i] = my_str.substring(start, start + n);
            start += n;
        }
        answer[len-1] = my_str.substring(start);
        return answer;
    }

}
