package practices;
//https://school.programmers.co.kr/learn/courses/30/lessons/181884
public class Solution181884 {
    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) break;
            }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;
        System.out.println(solution(numbers,n));
    }
}
