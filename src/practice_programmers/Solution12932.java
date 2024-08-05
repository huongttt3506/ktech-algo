package practice_programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution12932 {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(String.valueOf(n).length());
//        int[] ans = solution(n);
//        int[] ans = solution2(n);
//        int[] ans = solution3(n);
        int[] ans = solution4(n);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] solution(long n) {
        String numStr = String.valueOf(n);
        int[] answer = new int[numStr.length()];
        int j = numStr.length() - 1;
        for (int i : numStr.toCharArray()) {
            answer[j] = i - 48;
            j--;
        }
        return answer;
    }

    public static int[] solution2(long n) {
        int len = String.valueOf(n).length();
        int[] answer = new int[len];
        for (int i = 0; i < len ; i++) {
            answer[i] = (int) n % 10;
            n /= 10;
        }
        return answer;
    }

    public static int[] solution3(long n) {
        List<Integer> arr = new ArrayList<>();
        while (n > 0) {
            arr.add((int)(n % 10));
            n /= 10;
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
    public static int[] solution4(long n) {
        int[] arr = new int[11];
        int i = 0;
        while (n > 0) {
            arr[i++] = (int) (n%10);
            n /= 10;
        }
        return Arrays.copyOfRange(arr, 0, i);
    }
}
