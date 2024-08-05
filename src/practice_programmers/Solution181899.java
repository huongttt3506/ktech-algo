package practice_programmers;
//https://school.programmers.co.kr/learn/courses/30/lessons/181899
public class Solution181899 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        int value = start_num;
        for (int i = 0; i < start_num - end_num + 1; i++) {
            answer[i] = value;
            value--;
        }

        return answer;
    }
}
