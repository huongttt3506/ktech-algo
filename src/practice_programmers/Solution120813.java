package practice_programmers;

import java.util.ArrayList;
import java.util.List;

public class Solution120813 {
    public int[] solution(int n) {
        int len = n%2 == 0 ? n / 2 : (n / 2 + 1);
        int[] answer = new int[len];
        int val = 1;
        int idx = 0;
        while (val <= n) {
            answer[idx] = val;
            val = val + 2;
            idx++;
        }
        return answer;
    }
    public int[] solution2(int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= n ; i = i+2) {
            answer.add(i);
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
