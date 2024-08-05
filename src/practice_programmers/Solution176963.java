package practice_programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/176963

import java.util.HashMap;
import java.util.Map;

public class Solution176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> people = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            people.put(name[i], yearning[i]);
        }
        int index = 0;
        int score = 0;
        for (String[] p : photo) {
            for (int i = 0; i < p.length; i++) {
                if(people.containsKey(p[i])) score += people.get(p[i]);
            }
            answer[index] = score;
            index++;
            score = 0;
        }
        return answer;
    }
}
