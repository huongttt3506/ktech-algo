package practice_programmers;

import java.util.Arrays;

public class Solution120811 {
    public int solution(int[] array) {
//        array = Arrays.stream(array).sorted().toArray();
        Arrays.sort(array);
        return array[(int) (array.length / 2)];
    }
}