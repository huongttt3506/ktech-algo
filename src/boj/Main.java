package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//https://www.acmicpc.net/problem/15552
/*
5
1 1
12 34
5 500
40 60
1000 1000
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //test 의 갯수를 입력반듣다
        int tests = Integer.parseInt(reader.readLine());
        //test 의 갯수만큼 반복하면서
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < tests; i++) {
            //
            String line = reader.readLine();
            String[] tokens = line.split(" ");
            int sum = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]);
//            System.out.println(answer);
            answer.append(sum);
            answer.append("\n");

        }
        System.out.println(answer);


    }
}
