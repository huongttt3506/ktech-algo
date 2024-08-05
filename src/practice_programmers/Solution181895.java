package practice_programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution181895 {
    public Object[] solution(int[] arr, int[][] intervals) {
        List<Integer> answer = new ArrayList<>();
        for (int[] query : intervals) {
            int start = query[0];
            int end = query[1];
            int[] subArray = Arrays.copyOfRange(arr, start, end + 1);
            for (int j : subArray) {
                answer.add(j);
            }
        }
        return answer.toArray();
    }

    public int[] solution1(int[] arr, int[][] intervals) {
        int start1 = intervals[0][0], end1 = intervals[0][1];
        int start2 = intervals[1][0], end2 = intervals[1][1];
        int[] answer = new int[(end1 - start1 + 1) + (end2 - start2 + 1)];

        int index = 0;
        for (int i = start1; i <= end1; i++) {
            answer[index] = arr[i];
            index++;
        }
        for (int i = start2; i <= end2; i++) {
            answer[index] = arr[i];
            index++;
        }
        return answer;
    }
}
