package practice_beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// https://www.acmicpc.net/problem/10809
public class Main10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int[] result = letterIndex(line);
        for (int idx : result) {
            System.out.print(idx + " ");
        }
    }
    public static int[] letterIndex(String word) {
        int[] answer = new int[26];
        char charCode = 'a';
        for (int i = 0; i <26 ; i++) {
            answer[i] = -1;
        }
        for (int i = 0; i < word.length(); i++) {
            if (answer[(word.charAt(i) - 'a')] == -1) {
                answer[(word.charAt(i) - 'a')] = i;
            }
        }
        return answer;
    }
}
