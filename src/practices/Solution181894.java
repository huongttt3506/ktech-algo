package practices;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/181894
public class Solution181894 {
    public int[] solution(int[] arr) {
        int[] array = {1, 2, 1, 4, 5, 2, 9};
        int length = arr.length;
        int left = -1;
        int right = -1;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 2) {
                left = i;
                break;
            }
        }
        for (int j = length - 1; j >= 0; j--) {
            if (arr[j] == 2) {
                right = j;
                break;
            }
        }
        // case arr don't contain 2:
        if (left == -1 && right == -1) return new int[]{-1};
        return Arrays.copyOfRange(arr, left, right + 1);
    }
    public int[] solution2(int[] arr) {
        int length = arr.length;
        int left = -1;
        int right = -1;

        for (int i = 0; i < length; i++) {
            if (arr[i] == 2) {
                if (left == -1) {
                    left = i;
                }
                right = i;
            }
        }
        if (left == -1) return new int[] {-1};
        return Arrays.copyOfRange(arr, left, right + 1);
    }
}
