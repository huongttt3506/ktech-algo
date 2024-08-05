package practice_beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2566
public class Main2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value;
        int maxValue = -1;
        int[][] matrix = new int[9][9];
        List<int[]> maxIdxList = new ArrayList<>();
        int[] index = new int[2];
        for (int i = 0; i < 9; i++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 9; j++) {
                value = Integer.parseInt(tokens.nextToken());
                matrix[i][j] = value;
                if (maxValue < value) {
                    maxValue = value;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matrix[i][j] == maxValue) {
                    index[0] = i + 1;
                    index[1] = j + 1;
                    maxIdxList.add(index);
                }
            }
        }
        System.out.println(maxValue);
        for (int[] query : maxIdxList) {
            System.out.println(query[0] + " " + query[1]);
        }

    }
}


