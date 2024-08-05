package practice_beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
// use stack
//https://www.acmicpc.net/problem/4949
public class Main4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();
        while (true) {
            String line = reader.readLine();
            if (line.equals(".")) break;
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (char letter : line.toCharArray()) {
                if (letter - '.' == 0) break;
                if (letter == '(' || letter == '[') {
                    stack.push(letter);
                } else if (letter == ')' || letter == ']') {
                    if (stack.empty()) {
                        stack.push(letter);
                    } else if (stack.peek() == '[' && letter == ']') {
                        stack.pop();
                    } else if (stack.peek() == '(' && letter == ')') {
                        stack.pop();
                    } else {
                        stack.push(letter);
                    }
                }
            }
            if (stack.empty()) {
                answer.append("yes\n");
            } else answer.append("no\n");
        }
        System.out.println(answer);

    }
}