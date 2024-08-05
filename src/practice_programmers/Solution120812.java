package practice_programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution120812 {
    public int solution(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);
        }
        int maxFrequency = 0;
        int mode = -1;
        boolean isDuplicate = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value> maxFrequency) {
                maxFrequency = value;
                mode = key;
                isDuplicate = false;
            } else if (value == maxFrequency) {
                isDuplicate = true;
            }
        }
        return isDuplicate ? -1 : mode;
    }

    public int solusion2(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> mapfrequency = new HashMap<>();

        for (int num : array) {
            int count = mapfrequency.getOrDefault(num, 0) + 1;
            mapfrequency.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                answer = num;
            } else if (count == maxCount && answer != num) {
                answer = -1;
            }
        }

        return answer;
    }
}
