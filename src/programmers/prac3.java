package programmers;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/3003
public class prac3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] intString = scanner.nextLine().split(" ");
        int[] input = new int[6];
        for (int i = 0; i < 6; i++) {
            input[i] = Integer.parseInt(intString[i]);
        }
        scanner.close();
        System.out.println(solution(input));
    }

    public static String solution(int[] input) {
        int[] nums = {1, 1, 2, 2, 2, 8};
        int[] answer = new int[6];
        for (int i = 0; i < 6; i++) {
            answer[i] = nums[i] - input[i];
        }
        return Arrays.toString(answer);
    }

}

