package practice_programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181925

import java.awt.*;

public class Solution181925 {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 0; i < numLog.length - 1; i++) {
            if (numLog[i+1] - numLog[i] == 1) answer += "w";
            if (numLog[i+1] - numLog[i] == 10) answer += "d";
            if (numLog[i+1] - numLog[i] == -1) answer += "s";
            if (numLog[i+1] - numLog[i] == -10) answer += "a";
        }
        return answer;
    }


}
