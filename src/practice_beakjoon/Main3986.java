package practice_beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/3986
public class Main3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String testWord = "";
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            testWord = reader.readLine();
            if (isGoodWord(testWord)) count++;
            }
        System.out.println(count);
        }
    private static boolean isGoodWord(String word) {
        Stack<Character> stack = new Stack<>();
        for (char ch : word.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else if (stack.peek() != ch) {
                stack.push(ch);
            } else stack.pop();
        }
        return stack.isEmpty();
    }
}
