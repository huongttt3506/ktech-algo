package practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/10988
public class beakjoon10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // read test string
        String test = reader.readLine();
        StringBuilder convertBuilder = new StringBuilder();
        for (int i = test.length() - 1; i >= 0; i--) {
            convertBuilder.append(test.charAt(i));
        }
        String convert = convertBuilder.toString();
        int result = (test.equals(convert) ? 1 : 0);
        System.out.println(result);


    }

}
