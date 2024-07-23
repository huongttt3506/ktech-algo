package practices;

import java.net.Inet4Address;
import java.util.stream.IntStream;

//https://school.programmers.co.kr/learn/courses/30/lessons/181914
public class Solution181914 {
    public int solution(String number) {
        int[] nums = new int[number.length()];
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            nums[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
            sum += nums[i];
        }
        return sum%9;
    }
}
