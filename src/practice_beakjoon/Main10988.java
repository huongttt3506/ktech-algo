package practice_beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/10988
public class Main10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // read test string
        String isPalindrome = reader.readLine();
        StringBuilder convertBuilder = new StringBuilder();
        for (int i = isPalindrome .length() - 1; i >= 0; i--) {
            convertBuilder.append(isPalindrome .charAt(i));
        }
        String convert = convertBuilder.toString();
        int result = (isPalindrome.equals(convert) ? 1 : 0);
        System.out.println(result);


    }

}
