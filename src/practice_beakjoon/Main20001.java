package practice_beakjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/20001
// use Stack
public class Main20001 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack<String> problemStack = new Stack<>();
        if (reader.readLine().equals("고무오리 디버깅 시작")) {
            String line;
            while (!(line = reader.readLine()).equals("고무오리 디버깅 끝")) {
                if (line.equals("문제")) {
                    problemStack.push("문제");
                }
                else if (line.equals("고무오리")) {
                    if (problemStack.isEmpty()) {
                        problemStack.push("문제");
                        problemStack.push("문제");
                    } else problemStack.pop();
                }
            }
            String result = problemStack.isEmpty() ? "고무오리야 사랑해" : "힝구";
            System.out.println(result);
        }
    }
}

