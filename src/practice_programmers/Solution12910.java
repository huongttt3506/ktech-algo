package practice_programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution12910 {
    public static void main(String[] args) {
        int[] arr = {3,2,6};
        System.out.println(Arrays.toString(solution(arr, 10)));
    }
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] % divisor == 0) {
               answer.add(arr[i]);
           }
        }

        return answer.isEmpty() ? new int[] {-1} : answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
    public int[] solution2(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr)
                .filter(factor -> factor % divisor == 0)
                .sorted().toArray();
        return answer.length == 0 ? new int[] {-1} : answer;
    }

}
