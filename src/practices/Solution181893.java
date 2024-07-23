package practices;

import java.util.Arrays;


public class Solution181893 {
    // O(n2)
    public int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
               arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            } else arr = Arrays.copyOfRange(arr, query[i], arr.length);
        }
        return arr;


    }
    // cách làm O(n)
    public int[] solution1(int[] arr, int[] query) {
        int left = 0;
        int right = arr.length;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                right = left + query[i] + 1;
            }
            else left += query[i];
        }
        int[] answer = new int[right - left];
        for (int i = 0; i < right - left; i++) {
            answer[i] = arr[left + i];
        }
        return answer;
    }
}

