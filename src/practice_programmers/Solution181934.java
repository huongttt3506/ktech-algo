package practice_programmers;
// https://school.programmers.co.kr/learn/courses/30/lessons/181934
public class Solution181934 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (ineq.equals(">")) {
            // ">", "=" : n >= m
            // ">", "!" : n > m
            if (eq.equals("=")) {
                answer = n >= m ? 1 : 0;
            } else
                answer = n > m ? 1 : 0;
        }
        //"<", "=" : n <= m
        // "<", "!" : n < m
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                answer = n <= m ? 1 : 0;
            } else
                answer = n < m ? 1 : 0;
        }
        return answer;
    }

}
